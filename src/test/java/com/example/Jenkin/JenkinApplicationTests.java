package com.example.Jenkin;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinApplicationTests {

	Logger loggers = Logger.getAnonymousLogger();

	@Test
	void contextLoads() {

		loggers.log(null, "Testing....");
	}

}
