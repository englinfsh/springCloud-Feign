package com.lin.feng.sheng.service.outer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(value = "eurekaUserService")
public interface IFeignUserService {


	@RequestMapping(value = "/hello")
    String hello2User(@RequestParam(value = "name") String name);


}
