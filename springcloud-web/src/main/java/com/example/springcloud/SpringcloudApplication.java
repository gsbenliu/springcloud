package com.example.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.core.util.UuidUtil;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.MDC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan
@Slf4j
public class SpringcloudApplication {

	public static void main(String[] args) {
		MDC.put("THREAD_TRACE_LOG_ID", UuidUtil.getTimeBasedUuid().toString());
		log.info("项目启动。。。。。。");
		SpringApplication.run(SpringcloudApplication.class, args);
	}

}
