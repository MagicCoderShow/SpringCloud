package com.dream404.springcloud.eurekacustomer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="SERVICE-PRODUCE",fallback=HystrixClientFallback.class)
@Service("helloService")
public interface HelloService {
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
    String Hello(@RequestParam(value = "name") String name);
}
