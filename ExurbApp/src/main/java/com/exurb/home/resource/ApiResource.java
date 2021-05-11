package com.exurb.home.resource;
import java.lang.reflect.InvocationTargetException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.exurb.home.entity.Message;

@RestController
@RequestMapping("home")
public class ApiResource {

    @Autowired
    
   

    @RequestMapping(value = "welcome", method = RequestMethod.GET)
    public String welcome() {

        return "Welcome to this page";
    }
    @RequestMapping(value = "message", method = RequestMethod.POST)

    public Message Message(Message message)
           {
        if (message.getName().isEmpty()) {
            message.setName("Guest User");
        }

        return message;

    }

    
 
}
