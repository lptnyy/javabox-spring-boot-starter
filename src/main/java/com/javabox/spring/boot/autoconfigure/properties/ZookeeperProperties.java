package com.javabox.spring.boot.autoconfigure.properties;
import com.javabox.properties.RegistryProperties;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("spring.javabox.registry.zookeeper")
public class ZookeeperProperties extends RegistryProperties {

}
