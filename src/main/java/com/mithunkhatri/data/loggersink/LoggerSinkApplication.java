package com.mithunkhatri.data.loggersink;

import com.mithunkhatri.data.loggersink.entities.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@SpringBootApplication
@EnableBinding(Sink.class)
public class LoggerSinkApplication {
	private Logger logger = LoggerFactory.getLogger(LoggerSinkApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LoggerSinkApplication.class, args);
	}

	@StreamListener(value = "input")
	public void employees(Employee employee) {
		logger.info("employee : " + employee);
	}
}
