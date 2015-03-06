package org.example.cities;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by cq on 6/3/15.
 */
public class GreetingsController {

    @RequestMapping("/greetings")
    public String index() {
        return "Greetings HK Roadshow!";
    }
}
