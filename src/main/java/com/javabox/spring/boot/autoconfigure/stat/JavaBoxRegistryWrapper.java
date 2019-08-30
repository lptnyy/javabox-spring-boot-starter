package com.javabox.spring.boot.autoconfigure.stat;
import com.javabox.log.Log;
import com.javabox.registry.RegistryFactory;
import com.javabox.registry.RegistryService;
import com.javabox.registry.ZookeeperService;
import com.javabox.spring.boot.autoconfigure.properties.ZookeeperProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class JavaBoxRegistryWrapper {

    @Autowired
    ZookeeperProperties bootRegistryProperties;

    @Autowired
    Log log;

    @Bean
    public RegistryService registryService(){
        ZookeeperService zookeeperService = new ZookeeperService();
        zookeeperService.setLog(log);
        zookeeperService.setProperties(bootRegistryProperties);
        return zookeeperService;
    }

    @Bean
    public RegistryFactory registryFactory(){
        RegistryFactory registryFactory = new RegistryFactory();
        registryFactory.setRegistryService(registryService());
        return registryFactory;
    }
}
