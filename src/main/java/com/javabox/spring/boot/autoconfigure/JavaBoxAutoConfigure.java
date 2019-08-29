package com.javabox.spring.boot.autoconfigure;
import com.javabox.spring.boot.autoconfigure.properties.ZookeeperProperties;
import com.javabox.spring.boot.autoconfigure.stat.BaseMainFactoryWrapper;
import com.javabox.spring.boot.autoconfigure.stat.JavaBoxLogWrapper;
import com.javabox.spring.boot.autoconfigure.stat.JavaBoxRegistryFactoryWrapper;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.javabox.spring.boot.autoconfigure")
@EnableConfigurationProperties({ZookeeperProperties.class})
@Import({JavaBoxRegistryFactoryWrapper.class,
        JavaBoxRegistryFactoryWrapper.class,
        JavaBoxLogWrapper.class,
        BaseMainFactoryWrapper.class})
public class JavaBoxAutoConfigure {

}
