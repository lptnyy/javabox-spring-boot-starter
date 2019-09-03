package com.javabox.spring.boot.autoconfigure.runner;
import com.javabox.exception.RegistryException;
import com.javabox.jar.JarBean;
import com.javabox.jar.Loaded;
import com.javabox.log.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceLoadJar {

    @Autowired
    Loaded<JarBean> jarBeanLoaded;

    @Autowired
    Log log;

    public void run() throws RegistryException {
        JarBean jarBean = jarBeanLoaded.loadNetWorkJar("https://freenetfile.oss-ap-southeast-1.aliyuncs.com/demo.jar");
    }
}
