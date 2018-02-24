package com.example.demo.test2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Spring Boot 配置文件详解：自定义属性、随机数、多环境配置等
 * http://www.spring4all.com/article/248
 * @author ballsb
 * @date 2018/2/23
 */
@Component
@ConfigurationProperties(prefix = "shbn")
public class Properties {

    //@Value("${shbn.name}")
    private String name;

    //@Value("${shbn.title}")
    private String title;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
