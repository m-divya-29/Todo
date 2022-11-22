package com.todo.Todo;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;


@Controller
@SessionAttributes("name")
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

    @RequestMapping(value = "addtodo", method= RequestMethod.GET)
    public String addNewTodo(ModelMap map){
        String user = (String) map.get("name");
        //2 way binding :: add a dummy to do so that model is not empty for next 'addtodo' call.
        Todo td = new Todo(0, user, "Drawing", "",
                LocalDate.now().plusMonths(4), LocalDate.now(), false );
        map.put("todo", td);
        return "addtodo";
    }
    @RequestMapping(value = "addtodo", method= RequestMethod.POST)
    public String showNewTodo(ModelMap map, @Valid Todo todo, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "addtodo";
        }
        String user = (String) map.get("name");
        todoService.addNewTodo(user, todo.getTitle(), todo.getDescription());
        return "redirect:/todo"; //calls URL @RequestMapping("/todo")
    }
}
