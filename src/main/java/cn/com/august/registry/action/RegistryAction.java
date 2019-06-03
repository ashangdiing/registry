package cn.com.august.registry.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.com.august.registry.Config;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("registry")
public class RegistryAction {
	@Autowired
	private Config config;
	@RequestMapping(value="/getName",method =RequestMethod.GET)
	public String getName() {
		log.info("getName:"+config.getName());
		return  config.getName();
	}
}
