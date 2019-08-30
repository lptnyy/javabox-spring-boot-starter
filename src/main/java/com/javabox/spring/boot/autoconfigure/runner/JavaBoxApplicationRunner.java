package com.javabox.spring.boot.autoconfigure.runner;
import com.javabox.spring.boot.autoconfigure.annotation.ClassPathScanningProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class JavaBoxApplicationRunner implements ApplicationRunner {

    @Autowired
    ServiceRegistryRun runRegistryService;

    @Autowired
    ClassPathScanningProvider classPathScanningProvider;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        runRegistryService.run();
        classPathScanningProvider.findCandidateComponents("com.example");
    }
}
