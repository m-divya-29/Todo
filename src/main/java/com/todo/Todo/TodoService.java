package com.todo.Todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Service
public class TodoService {
    static List<Todo> todos = new ArrayList<>();
    static {
        todos.add(new Todo(1, "spring", "finish spring boot",
                LocalDate.now().plusDays(10), LocalDate.now(), false));
        todos.add(new Todo(2, "react", "finish react",
                LocalDate.now().plusDays(5), LocalDate.now(), false));
    }
    public List<Todo> getTodos(){
        return todos;
    }
}
