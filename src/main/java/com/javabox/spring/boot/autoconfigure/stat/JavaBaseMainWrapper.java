package com.javabox.spring.boot.autoconfigure.stat;
import com.javabox.registry.RegistryFactory;
import com.javabox.spring.boot.autoconfigure.factory.JavaBoxFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@Import({
        JavaBoxRegistryWrapper.class,
        JavaBoxRegistryWrapper.class,
        JavaBoxLogWrapper.class,
        JavaBoxJarWrapper.class
})
public class JavaBaseMainWrapper {

    @Autowired
    RegistryFactory registryFactory;

    @Bean
    public JavaBoxFactory getFactory(){
        JavaBoxFactory baseStartFactory = new JavaBoxFactory();
        baseStartFactory.setRegistryBaseFactory(registryFactory);
        return baseStartFactory;
    }
}
