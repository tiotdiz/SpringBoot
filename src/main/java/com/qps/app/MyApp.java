package com.qps.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = { "com.qps" })
@EnableAutoConfiguration
public class MyApp {

	public static void main(String[] args) {
		SpringApplication.run(MyApp.class, args);
		System.out.println("Running!!");
	}
}

/**
 * 一些说明：
 * application.properties手动配置会自动覆盖自动配置
 */
