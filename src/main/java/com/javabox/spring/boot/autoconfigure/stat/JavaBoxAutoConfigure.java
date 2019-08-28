package com.javabox.spring.boot.autoconfigure.stat;
import com.javabox.spring.boot.autoconfigure.properties.JavaBoxRegistryProperties;
import com.javabox.spring.boot.autoconfigure.properties.JavaBoxStatProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({
        JavaBoxStatProperties.class,
        JavaBoxRegistryProperties.class})
public class JavaBoxAutoConfigure {
    public JavaBoxAutoConfigure(){

    }
}
