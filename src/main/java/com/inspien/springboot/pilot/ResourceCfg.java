package com.inspien.springboot.pilot;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("/rest")
public class ResourceCfg extends ResourceConfig {

	public ResourceCfg() {
		packages("com.inspien.springboot.service");
	}
}
