package br.com.caio.todo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {

    // escrever um endpoint que da hello world
    // HTTP -> verbos/methods GET POST PUT PATCH DELETE
    // requisicao -> verbo + rota

    @GetMapping("sayHello") // GET hello/sayHello
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping // GET /hello
    public String test() {
        return "test";
    }
}
