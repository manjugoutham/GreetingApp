package com.greetingapp.greetingapp.controller;

import com.greetingapp.greetingapp.Entity.Greeting;
import com.greetingapp.greetingapp.Entity.User;
import com.greetingapp.greetingapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;
@RestController
@RequestMapping("/greetings")
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping(value = {"","/","/home"})
        public Greeting greeting(@RequestParam(value="firstname",defaultValue = "world") String fname,
                                 @RequestParam(value="lastname",defaultValue = "world") String lname){

        //    return new Greeting(counter.incrementAndGet(),String.format(template,fname,lname));
            User user = new User();
            user.setFirstname(fname);
            user.setFirstname(lname);
            return greetingService.addGreeting(user);
        }
    }

