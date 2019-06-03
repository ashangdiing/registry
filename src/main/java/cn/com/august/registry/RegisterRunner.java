package cn.com.august.registry;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
@Component
@SpringBootApplication(scanBasePackages = "${cn.com.*}")
public class RegisterRunner implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
	 
		log.debug("注册中心正在启动中");
	}

}
