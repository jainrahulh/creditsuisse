package com.creditsuisse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.creditsuisse.service.LogFileReaderService;

@SpringBootApplication
public class ChallengeApplication {
	
	static Logger logger = LoggerFactory.getLogger(ChallengeApplication.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		logger.debug("*****Start*****");
		
		ApplicationContext context = SpringApplication.run(ChallengeApplication.class, args);
		LogFileReaderService logFileReader = context.getBean(LogFileReaderService.class);

		String fileName = "logfile.txt";
		
		logger.info("File Location: "+ fileName);
		
		logFileReader.readFile(fileName);
		
	}

}
