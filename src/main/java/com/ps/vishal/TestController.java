package com.ps.vishal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/hindi")
    String getGreetingInHindi() {
        return "Namaskaar!, Aap kaise hai?";
    }

    @RequestMapping("/telugu")
    String getGreetingInTelugu() {
        return "Hello!, Meeru ela unnaru?";
    }
}
