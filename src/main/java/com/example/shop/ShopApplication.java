package com.example.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShopApplication {
	/* intelliJ 에디터에서 application.properties 설정 필수
	* Run Configuration -> VM options -> -Dspring.profiles.active=dev 추가
	* */
	public static void main(String[] args) {
		SpringApplication.run(ShopApplication.class, args);
	}

}
