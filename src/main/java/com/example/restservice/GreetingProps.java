package com.example.restservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@ConfigurationProperties(prefix = "props")
class GreetingProps {

    private String dftNameConst2;
    private String var1;
    private String multiline;

    public String getDftNameConst2() {
        return dftNameConst2;
    }

    public void setDftNameConst2(String dftNameConst2) {
        this.dftNameConst2 = dftNameConst2;
    }

    public String getVar1() {
        return var1;
    }

    public void setVar1(String var1) {
        this.var1 = var1;
    }

    public String getMultiline() {
        return multiline;
    }

    public void setMultiline(String multiline) {
        this.multiline = multiline;
    }
}
