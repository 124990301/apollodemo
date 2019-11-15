package com.example.apollodemo;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApolloConfig {

    @Autowired
    private TestJavaConfigBean bean;

    @GetMapping("/getConfig")
    public String getConfig(String key){
        Config config = ConfigService.getAppConfig(); //config instance is singleton for each namespace and is never null
        String someDefaultValue = "none";
        String value = config.getProperty(key, someDefaultValue);
        return value;
    }

    @GetMapping("/getConfig2")
    public String getConfig2(){
        return bean.getAbc();
    }
}
