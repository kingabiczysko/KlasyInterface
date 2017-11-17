package com.kodilla.dodatkowe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DodatkoweApplication extends Car implements CarInterface
{

	public static void main(String[] args) {
		SpringApplication.run(DodatkoweApplication.class, args);

		Car car1 = new Car();
		car1.jedz();



	}
}
