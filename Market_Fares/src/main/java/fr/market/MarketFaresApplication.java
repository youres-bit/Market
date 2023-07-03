package fr.market;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MarketFaresApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarketFaresApplication.class, args);
		
		System.out.println("Ok");
	}

}
