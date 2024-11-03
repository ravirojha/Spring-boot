package com.example.myproject.springcore.rest;

import com.example.myproject.springcore.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;

    @Autowired
    private void setCoach(@Qualifier("basketballCoach") Coach theCoach) {
        myCoach = theCoach;
    }


    @GetMapping("/dailyworkout")
    private String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }


}
