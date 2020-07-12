package com.example.CI_CD_AWS;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	public String hello()
	{
		return "Hello Youtube";
	}

}
