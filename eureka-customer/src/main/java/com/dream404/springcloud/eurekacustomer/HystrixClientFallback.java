package com.dream404.springcloud.eurekacustomer;

public class HystrixClientFallback implements HelloService{

	@Override
	public String Hello(String name) {
		return name+"正式服务器挂掉了，我出来溜一波";
	}  

} 