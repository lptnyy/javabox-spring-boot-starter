package com.javabox.spring.boot.autoconfigure.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("spring.javabox.admin")
public class AdminProperties {
    Boolean open = false;
    String admin;
    String password;
}
