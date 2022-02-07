package com.greetingapp.greetingapp.service;


import com.greetingapp.greetingapp.Entity.Greeting;
import com.greetingapp.greetingapp.Entity.User;
import org.springframework.stereotype.Service;

import javax.persistence.MappedSuperclass;
@Service
public interface GreetingService {
    Greeting addGreeting(User user);
    Greeting getGreeting(long id);
}
