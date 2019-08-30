package com.javabox.spring.boot.autoconfigure.runner;
import com.javabox.exception.RegistryException;
import com.javabox.registry.RegistryService;
import com.javabox.registry.ServerNode;
import com.javabox.spring.boot.autoconfigure.factory.JavaBoxFactory;
import com.javabox.spring.boot.autoconfigure.util.ServerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceRegistryRun {

    @Autowired
    JavaBoxFactory javaBoxFactory;

    @Autowired
    ServerConfig serverConfig;

    public void run() throws RegistryException {
        ServerNode serverNode = new ServerNode();
        RegistryService registryService = javaBoxFactory.getRegistryBaseFactory().getRegistryService();
        serverNode.setPort(serverConfig.getPort()+"");
        serverNode.setIp(serverConfig.getIp());
        registryService.connect(serverNode);
    }
}
