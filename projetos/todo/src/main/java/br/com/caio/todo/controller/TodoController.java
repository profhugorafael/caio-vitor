package br.com.caio.todo.controller;

import br.com.caio.todo.model.Todo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {


    @GetMapping("todos")
    public List<Todo> getAll() {
        List<Todo> todos = new ArrayList<>(List.of(
                new Todo(1L, "lavar roupas", false),
                new Todo(2L, "preparar almoco", false),
                new Todo(),
                new Todo(3L, "lavar louca", true)
        ));

        return todos;
    }

    @GetMapping("todos/{id}")
    public Todo getById(@PathVariable long id) {

        List<Todo> todos = new ArrayList<>(List.of(
                new Todo(1L, "lavar roupas", false),
                new Todo(2L, "preparar almoco", false),
                new Todo(),
                new Todo(3L, "lavar louca", true)
        ));

        Todo todoById = todos.stream()
                .filter(todo -> todo.getId() == id)
                .toList()
                .get(0);

        return todoById;
    }
}
