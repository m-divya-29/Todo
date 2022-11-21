package com.todo.Todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;


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
    public String addNewTodo(){
        return "addtodo";
    }
    @RequestMapping(value = "addtodo", method= RequestMethod.POST)
    public String showNewTodo(@RequestParam String title,
                              @RequestParam String description, ModelMap map){
        String user = (String) map.get("name");
        todoService.addNewTodo(user, title, description);
        return "redirect:/todo"; //calls URL @RequestMapping("/todo")
    }
}
