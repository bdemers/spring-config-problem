package com.example.spring.configproblem;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("another.namespace")
public class NestedConfigProperties {

    private String otherProperty;

    public String getOtherProperty() {
        return otherProperty;
    }

    public void setOtherProperty(String otherProperty) {
        this.otherProperty = otherProperty;
    }
}
