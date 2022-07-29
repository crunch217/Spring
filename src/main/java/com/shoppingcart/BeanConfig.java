package com.shoppingcart;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@ComponentScan(basePackages = "com.shoppingcart")
@EnableAspectJAutoProxy
public class BeanConfig {

}
