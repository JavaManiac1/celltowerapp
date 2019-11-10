package com.celltowerapp;

import com.celltowerapp.controller.OpenCSVReader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CelltowerwebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(CelltowerwebappApplication.class, args);
		 OpenCSVReader.readFromCSV();
	}

}
