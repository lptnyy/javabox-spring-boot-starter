package com.javabox.spring.boot.autoconfigure.stat;

import com.javabox.log.Log;
import com.javabox.spring.boot.autoconfigure.log.BoxLogImpl;
import org.springframework.context.annotation.Bean;
public class JavaBoxLogWrapper {

    @Bean
    public Log getLog(){
        return new BoxLogImpl();
    }
}
