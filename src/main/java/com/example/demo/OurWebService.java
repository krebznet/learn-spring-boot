package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class OurWebService {
	
	
	@GetMapping(path = "/test")
	public @ResponseBody() String test(@RequestParam() String echo) { 
		return echo;
	}

}
