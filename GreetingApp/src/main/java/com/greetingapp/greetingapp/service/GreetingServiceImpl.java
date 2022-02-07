package com.greetingapp.greetingapp.service;

import com.greetingapp.greetingapp.Entity.Greeting;
import com.greetingapp.greetingapp.Entity.User;
import com.greetingapp.greetingapp.repository.GreetingRepository;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;
@ToString
@Service
public class GreetingServiceImpl implements GreetingService{
   @Autowired
   private GreetingRepository greetingREpository;

    private static final String template = "Hello,%s";
    private final AtomicLong counter = new AtomicLong();

    @Override
    public Greeting addGreeting(User user) {
        String message = String.format(template,(user.toString().isEmpty())? "Hello world" : user.toString());
        return new Greeting(counter.incrementAndGet(),message);
    }

    @Override
    public Greeting getGreeting(long id) {
        return null;
    }

//
//    @Override
//    public Greeting getGreeting(long id) {
//        return greetingREpository.findBy(id).get();
//    }
}
