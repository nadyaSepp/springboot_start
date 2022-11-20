package ru.ilyabikmeev.springBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Эта аннотация за нас делает все настройки. Будут сканироваться все бины из данного пакета и всех подпакетов
@SpringBootApplication
public class SpringBootDemoApplication {
	//Здесь начинает работать наше приложение.
	//Проект создан с помощью https://start.spring.io/

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

}
