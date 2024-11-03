package com.example.myproject.springcore.config;

import com.example.myproject.springcore.common.Coach;
import com.example.myproject.springcore.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportsConfig {
    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
