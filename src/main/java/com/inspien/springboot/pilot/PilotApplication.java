package com.inspien.springboot.pilot;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Collections;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
public class PilotApplication {

	public static void main(String[] args) {
		try {
			ConfigurableApplicationContext ctx = SpringApplication.run(PilotApplication.class,args);
			ConfigurableListableBeanFactory beanFactory = ctx.getBeanFactory();
//			beanFactory.registerSingleton("test", new IONTest());

		}catch (Exception e ){
			e.printStackTrace();
		}
	}
}
