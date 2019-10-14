package com.virjanand.limitsservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.virjanand.limitsservice.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {
	
	private Configuration configuration;
	
	public LimitsConfigurationController(Configuration configuration) {
		this.configuration = configuration;
	}

	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfigurations() {
		return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
	}
}
