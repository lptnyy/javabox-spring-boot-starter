package com.javabox.spring.boot.autoconfigure.properties;

/**
 *  发现服务类型
 */
public enum Registry {
    ZOOKEEPER("zookeeper"),NACOS("nacos");

    String value;

    Registry(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
