package com.todo.Todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Service
public class TodoService {
    static List<Todo> todos = new ArrayList<>();
    protected static int counter = 0;
    static {
        todos.add(new Todo(++counter, "Divya", "spring", "finish spring boot",
                LocalDate.now().plusDays(10), LocalDate.now(), false));
        todos.add(new Todo(++counter, "Divya","react", "finish react",
                LocalDate.now().plusDays(5), LocalDate.now(), false));
    }
    public void addNewTodo(String username, String title, String description){
        todos.add(new Todo(++counter, username, title, description,
                LocalDate.now().plusYears(1), LocalDate.now(), false));
    }
    public List<Todo> getTodos(){
        return todos;
    }
}
