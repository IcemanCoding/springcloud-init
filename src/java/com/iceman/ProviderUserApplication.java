package com.iceman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Iceman
 * 2018/12/27
 */
@SpringBootApplication
//@ComponentScan( basePackages = { "com.iceman.controller" } )
// @SpringBootApplication 整合了@Configuration @EnableAutoConfiguration @ComponentScan注解
public class ProviderUserApplication {

    public static void main( String[] args ) {
        SpringApplication.run( ProviderUserApplication.class, args );
    }

}
