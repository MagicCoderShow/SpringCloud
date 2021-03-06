package com.dream404.springcloud.eurekacustomer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

	@Autowired
	HelloService helloService;

	@RequestMapping(value = "/sayHello", method = RequestMethod.GET)
	public String hello(@RequestParam String name) {
		return helloService.Hello(name);
	}

}
