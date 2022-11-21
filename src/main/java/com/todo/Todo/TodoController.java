package com.todo.Todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TodoController {
    TodoService todoService;
    TodoController(TodoService todoService){
        this.todoService = todoService;
    }
    @RequestMapping("/todo")
    public String getAllTodo(ModelMap modelMap){
        modelMap.put("todos", todoService.getTodos());
        return "todos";
    }
}
