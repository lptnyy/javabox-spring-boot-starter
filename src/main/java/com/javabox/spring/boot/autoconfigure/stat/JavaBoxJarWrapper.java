package com.javabox.spring.boot.autoconfigure.stat;
import com.javabox.jar.LoadJar;
import org.springframework.context.annotation.Bean;

public class JavaBoxJarWrapper {

    @Bean
    public LoadJar loadJar(){
        return new LoadJar();
    }
}
