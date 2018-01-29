package com.lin.feng.sheng.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lin.feng.sheng.service.outer.IFeignUserService;

/**
 * 前端应用层。
 * @author lfsheng
 *
 */
@RestController(value="/test")
public class RestFeignController  {
	public Logger logger= Logger.getLogger(this.getClass());
	@Autowired
	IFeignUserService feignUserService;

	@Value("${server.port}")
    String port;


	@RequestMapping("/hi")
    public String hi() {
		String name = "DDD-"+System.currentTimeMillis();
		logger.info("------通过feign组件调用UserService服务......................");
		String ret = feignUserService.hello2User(name);
        return "hi i am from port:" +port+",hello2User:"+ret;
    }





}
