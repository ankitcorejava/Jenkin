package com.example.Jenkin;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinApplicationTests {

	Logger loggers = Logger.getLogger("");

	@SuppressWarnings("static-access")
	@Test
	void contextLoads() {

		loggers.getLogger("sysout");
	}
	
	@Test
	void contextLoads2() {

		Logger.getLogger("sysout-contextLoads2");
	}
	
	@Test
	void contextLoads3() {

		Logger.getLogger("sysout-contextLoads3");
	}



}
