package com.todo.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {
    Logger logger = LoggerFactory.getLogger(getClass());
    AuthenticationService authenticationService;
    //taken care by spring since authenticationservice class is defined as a bean.
    LoginController(AuthenticationService authenticationService){
        this.authenticationService = authenticationService;
    }
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String gotoLogin(){
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String gotoWelcome(@RequestParam String name, @RequestParam String password,
                              ModelMap model){
        model.put("name", name);
        model.put("password", password);
        if(authenticationService.authenticate(name, password))
            return "welcome";
        model.put("error", "Invalid credentials. Try again!");
            return "login";
    }

    //http://localhost:8080/loginName?name=john
    @RequestMapping("/loginName")
    public String gotoLoginName(@RequestParam String name, ModelMap modelMap){
        modelMap.put("name", name); //this is passed to login.jsp as argument
        logger.debug("PARAM : {}",name);
        return "login";
    }

}
