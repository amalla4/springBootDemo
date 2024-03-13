package com.example.demo;

import com.example.demo.services.ColorPrinter;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class DemoApplication implements CommandLineRunner {
	private ColorPrinter colorPrinter;

	public DemoApplication(ColorPrinter colorPrinter){
		this.colorPrinter = colorPrinter;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	//overriding run() from CommandLineRunner interface
	@Override
	public void run(final String... args){
		log.info(colorPrinter.print());
	}

}
