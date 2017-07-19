package com.dream404.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MySQLController {
	
	@Autowired
	MySQL mySQL;
	
	@GetMapping("mysql")
	public Object mysql(){
		return mySQL;
	}
	
}
