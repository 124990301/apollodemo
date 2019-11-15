package com.example.apollodemo;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class TestJavaConfigBean {
        //查找key为uuu的配置，没有找到返回100
        @Value("${ttt:100}")
        private String abc;
        private int batch;

        @Value("${batch:200}")
        public void setBatch(int batch) {
            this.batch = batch;
        }

        public String getAbc() {
            return abc;
        }

        public int getBatch() {
            return batch;
        }
    }
