package com.kurafloyka.springcore.rest;

import com.kurafloyka.springcore.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;
    private Coach anotherCoach;

    //constructor injection
    @Autowired
    public DemoController(@Qualifier("tennisCoach") Coach theCoach, @Qualifier("tennisCoach") Coach anotherCoach) {
        this.myCoach = theCoach;
        this.anotherCoach = anotherCoach;
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    //setter injection
    //@Autowired
    //public void setMyCoach(Coach myCoach) {
    //    this.myCoach = myCoach;
    //}

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check() {
        return "Comparing beans: myCoach ==anotherCoach, " + (myCoach == anotherCoach);
    }
}
