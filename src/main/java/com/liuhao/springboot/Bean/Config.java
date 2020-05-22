package com.liuhao.springboot.Bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@ConfigurationProperties(prefix = "my")
public class Config {
    private List<String> server = new ArrayList<String>();
    public List<String> getServer(){
        return this.server;
    }

}
