package com.hxwj.cloud.feign.client;

import org.springframework.stereotype.Component;

@Component
public class ProviderServiceFallback implements ProviderService {

	@Override
	public String queryProductBasicInfoList(String params) {
		// TODO Auto-generated method stub
		return "hi," + params + "系统正在拼命加载中...";
	}
}