package com.todo.Todo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Service
public class TodoService {
    static List<Todo> todos = new ArrayList<>();
    Logger logger = LoggerFactory.getLogger(getClass());
    protected static int counter = 0;
    static {
        todos.add(new Todo(++counter, "Divya", "spring", "finish spring boot",
                LocalDate.now().plusDays(10), LocalDate.now(), false));
        todos.add(new Todo(++counter, "Divya","react", "finish react",
                LocalDate.now().plusDays(5), LocalDate.now(), false));
    }
    public void addNewTodo(String username, String title, String description, LocalDate target){
        todos.add(new Todo(++counter, username, title, description,
                target, LocalDate.now(), false));
    }
    public void deleteTodoById(int id){
        todos.removeIf(todo -> todo.getId() == id);
    }
    public List<Todo> getTodos(){
        return todos;
    }

    public Todo findById(int id) {
        logger.debug("Find by ID: "+id);
        Todo result = todos.stream().filter(todo -> todo.getId() == id).findFirst().get();
        logger.debug("Found "+result+" with id "+id);
        return result;
    }
    public void updateTodoById(Todo updateTodo){
        deleteTodoById(updateTodo.getId());
        addNewTodo(updateTodo.getUsername(), updateTodo.getTitle(),
                updateTodo.getDescription(), updateTodo.getTargetDate());
    }
}
