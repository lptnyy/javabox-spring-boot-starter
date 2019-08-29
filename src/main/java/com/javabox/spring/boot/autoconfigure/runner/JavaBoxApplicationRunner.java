package com.javabox.spring.boot.autoconfigure.runner;
import com.javabox.registry.RegistryService;
import com.javabox.registry.ServerNode;
import com.javabox.spring.boot.autoconfigure.factory.JavaBoxFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class JavaBoxApplicationRunner implements ApplicationRunner {

    @Autowired
    JavaBoxFactory javaBoxFactory;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        RegistryService registryService = javaBoxFactory.getRegistryBaseFactory().getRegistryService();
        registryService.connect(new ServerNode());
    }
}
