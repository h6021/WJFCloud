package com.hxwj.cloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户接口
 * 
 * @author cch
 *
 */
@RestController
@RequestMapping("/service")
public class UserController {

	@RequestMapping(value = "/queryUser", method = RequestMethod.GET)
	String queryProductBasicInfoList(String params) {
		return params + "您好";
	}
}