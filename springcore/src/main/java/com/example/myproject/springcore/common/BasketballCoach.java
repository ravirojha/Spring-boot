package com.example.myproject.springcore.common;
import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Shoot 100 hoops.";
    }
}
