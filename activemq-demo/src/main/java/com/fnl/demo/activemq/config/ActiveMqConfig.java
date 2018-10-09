package com.fnl.demo.activemq.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName ActiveMqConfig
 * @Description TODO
 * @Author dengcheng
 * @Date 2018/10/9 0009 上午 11:16
 **/
@Configuration
public class ActiveMqConfig {
    @Bean
    public ActiveMQQueue queue(){
        return new ActiveMQQueue("promoteAct");
    }
}
