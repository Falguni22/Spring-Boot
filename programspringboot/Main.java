package com.programspringboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
@SpringBootConfiguration
public class Main {

	public static void main(String[] args) {
		ApplicationContext con =SpringApplication.run(Main.class, args);
		
	}

}
@Component
class person{
	
}
@Configuration
@ComponentScan(basePackages="com.progrank.SpringBootAppApplication")
class Configu{
	
}
