package com.javabox.spring.boot.autoconfigure.stat;
import com.javabox.jar.JarBean;
import com.javabox.jar.Loaded;
import com.javabox.jar.LoadedNetWorkJar;
import org.springframework.context.annotation.Bean;

public class JavaBoxJarWrapper {

    @Bean
    public Loaded<JarBean> loadJar(){
        return new LoadedNetWorkJar();
    }
}
