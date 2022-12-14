package com.todo.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello {
    //http://localhost:8080/hello
    @RequestMapping("/hello")
    @ResponseBody
    public String greetHello(){
        return "Hello!";
    }
    @ResponseBody
    @RequestMapping("/hellohtml")
    public String greetHelloHtml(){
       return  "<html>" +
               "<body>" +
               "<h1>" +
               "Hello HTML" +
               "</h1>" +
               "</body>" +
               "</html>";
    }

    //returns jsp at /src/main/resources/META-INF/resources/WEB-INF/jsp (must add apache-jasper dependency to pom)
    @RequestMapping("/hellojsp")
    public String greetHelloJsp(){
        return "hello";
    }
}
