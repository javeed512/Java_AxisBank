package com.axis.spring.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.axis.spring.aop")
@EnableAspectJAutoProxy
public class AppConfig {

}
