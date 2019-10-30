package com.ours;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * created by lyf at 2019/5/17 14:15<br>
 *
 */
@SpringBootApplication()
@MapperScan("com.ours.dao")
public class ServerApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class,args);
    }

    @Override
    public void run(String... args) throws Exception {
    	System.out.println("启动完成");
    }
}
