package com.fnl.ssmDemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName SsmDemo
 * @Description TODO
 * @Author dengcheng
 * @Date 2018/10/10 0010 上午 9:26
 **/
@SpringBootApplication
@MapperScan("com.fnl.ssmDemo.dao.mapper")
public class SsmDemo {
    public static void main(String[] args) {
        SpringApplication.run(SsmDemo.class,args);
    }
}
