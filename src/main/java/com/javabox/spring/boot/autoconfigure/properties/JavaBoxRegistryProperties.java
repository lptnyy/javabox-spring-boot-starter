package com.javabox.spring.boot.autoconfigure.properties;

import com.javabox.registry.RegistryType;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("spring.javabox.registry")
@Data
public class JavaBoxRegistryProperties {
    // 默认使用nacos
    String registryType = RegistryType.NACOS.getValue();
    // 服务注册Ip
    String registryIp;
    // 服务注册端口
    String registryPort;
}
