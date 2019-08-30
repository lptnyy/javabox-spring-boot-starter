package com.javabox.spring.boot.autoconfigure.runner;

import com.javabox.jar.LoadJar;
import org.springframework.beans.factory.annotation.Autowired;

public class JavaBoxApplicationRunnerTest {


    @Autowired
    LoadJar loadJar;

    @org.junit.Test
    public void run() throws Exception {
        loadJar.loadJar("https://freenetfile.oss-ap-southeast-1.aliyuncs.com/demo.jar");
    }
}
