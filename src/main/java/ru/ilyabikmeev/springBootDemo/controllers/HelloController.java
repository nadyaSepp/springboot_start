package ru.ilyabikmeev.springBootDemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//Раньше мы писали сервлеты для такой цели
//Сейчас у нас классы, помеченные аннотацией @Controller
@Controller
public class HelloController {
    //Все методы HTTP - GET, POST, PUT, PATCH, DELETE

    //Обработка GET запроса по корневому маршруту
    @GetMapping("/")
    public String index() {
        //Название view-файла без расширения .html
        return "index";
    }

    @GetMapping("/projects")
    public String projects() {
        return "projects";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }
}
