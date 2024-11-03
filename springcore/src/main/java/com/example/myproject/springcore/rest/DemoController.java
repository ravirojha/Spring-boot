package com.example.myproject.springcore.rest;

import com.example.myproject.springcore.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;
    private Coach anotherCoach;

    // Constructor injection
//    @Autowired
//    private DemoController(Coach theCoach) {
//        myCoach = theCoach;
//    }


    // Setter Injection

    @Autowired
    private void setCoach(@Qualifier("basketballCoach") Coach theCoach, @Qualifier("basketballCoach") Coach theAnotherCoach) {
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
    }


    @GetMapping("/dailyworkout")
    private String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("check")
    private String check() {
        return "Comparing: myCoach == anotherCoach, " + (myCoach == anotherCoach);
    }


}
