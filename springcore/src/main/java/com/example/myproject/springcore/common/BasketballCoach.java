package com.example.myproject.springcore.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach{

    @PostConstruct
    private void initialise() {
        System.out.println("In initialise: " + getClass().getSimpleName());

    }

    @PreDestroy
    private void cleanUp() {
        System.out.println("In cleanUp: " + getClass().getSimpleName());

    }
    @Override
    public String getDailyWorkout() {
        return "Shoot 100 hoops.";
    }
}
