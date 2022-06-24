package com.inspien.springboot.pilot;

import org.eclipse.jetty.util.IO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

	@Bean
	public IONTest inTest() {
		return new IONTest();
	}
}
