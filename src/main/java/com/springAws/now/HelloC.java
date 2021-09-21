package com.springAws.now;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloC {
	@GetMapping("/wow")
	public String hello() {
	return "master the blaster";
	}

}
