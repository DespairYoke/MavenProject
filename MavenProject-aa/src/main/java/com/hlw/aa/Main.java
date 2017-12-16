package com.hlw.aa;

import cn.damai.Core;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication(scanBasePackages = {"com.hlw.aa.config"})
@ComponentScan(value ={"com.hlw.aa.config"})
@Import(value = {cn.damai.Main.class, Core.class})
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }
}
