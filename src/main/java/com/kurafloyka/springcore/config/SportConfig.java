package com.kurafloyka.springcore.config;

import com.kurafloyka.springcore.common.Coach;
import com.kurafloyka.springcore.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }


}
