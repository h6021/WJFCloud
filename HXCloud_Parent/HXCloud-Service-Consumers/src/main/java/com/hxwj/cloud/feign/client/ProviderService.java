package com.hxwj.cloud.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "HXCLOUD-SERVICE-PROVIDERS", fallback = ProviderServiceFallback.class)
public interface ProviderService {

	@RequestMapping(value = "/service/queryUser",method = RequestMethod.GET)
    String queryProductBasicInfoList(@RequestParam(value = "params") String params);
}