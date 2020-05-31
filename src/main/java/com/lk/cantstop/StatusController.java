package com.lk.cantstop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {
	
	@GetMapping("/")
	public String getStatus() {
		
		return "App is up and running!";
		
	}

}
