package com.todo.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String gotoLogin(){
        return "login";
    }

    //http://localhost:8080/loginName?name=john
    @RequestMapping("/loginName")
    public String gotoLoginName(@RequestParam String name, ModelMap modelMap){
        modelMap.put("name", name); //this is passed to login.jsp as argument
        System.out.println("*-*-*-* PARAM "+name);
        return "login";
    }

}
