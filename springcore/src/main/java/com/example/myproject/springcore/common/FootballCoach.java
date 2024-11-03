package com.example.myproject.springcore.common;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice dribbling";
    }
}
