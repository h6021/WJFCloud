package com.hxwj.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hxwj.cloud.feign.client.ProviderService;

@RestController
@RequestMapping("/service")
public class UserController {

	@Autowired
	ProviderService providerService;

	//@HystrixCommand(fallbackMethod = "hiError") 可以使用
	@RequestMapping(value = "/queryUser", method = RequestMethod.GET)
	String queryProductBasicInfoList(@RequestParam String params) {
		return providerService.queryProductBasicInfoList(params);
	}

	public String hiError(String name) {
		return "hi," + name + "系统正在拼命加载中...";
	}
}
