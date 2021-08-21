package com.infoworld.service;

import javax.enterprise.context.ApplicationScoped;
import java.util.Random;

@ApplicationScoped
public class MyService {
    public Integer getRandom(){
      Random random = new Random();
      return random.nextInt(100);
    }

    public String greeting(String name) {
        return "hello " + name;
    }

}
