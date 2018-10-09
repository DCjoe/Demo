package com.fnl.demo.activemq.mq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName PromoteActConsumer
 * @Description TODO
 * @Author dengcheng
 * @Date 2018/10/9 0009 下午 13:06
 **/

@Component
public class PromoteActConsumer {
    @JmsListener(destination = "promoteAct")
    public void receiveQueue(String consumer) {
        System.out.println(consumer+"消息已经消费了");
    }
}
