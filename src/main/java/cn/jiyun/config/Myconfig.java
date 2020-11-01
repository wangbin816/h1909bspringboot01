package cn.jiyun.config;

import cn.jiyun.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Myconfig {
    @Bean
    public User getUser(){
        return new User();
    }
}
