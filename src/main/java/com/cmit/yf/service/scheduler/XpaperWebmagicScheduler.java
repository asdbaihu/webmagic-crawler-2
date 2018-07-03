package com.cmit.yf.service.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class XpaperWebmagicScheduler {
	
	private final Logger logger = LoggerFactory.getLogger(XpaperWebmagicScheduler.class);

}
