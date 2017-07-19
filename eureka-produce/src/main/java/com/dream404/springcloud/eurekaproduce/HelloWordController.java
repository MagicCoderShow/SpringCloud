package com.dream404.springcloud.eurekaproduce;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {
	@Value("${server.port}")
	String serverPort;
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String HelloWord(@RequestParam String name){
		return name+":Hello World! by "+serverPort;
	}
}
