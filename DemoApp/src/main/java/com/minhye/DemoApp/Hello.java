package com.minhye.DemoApp;

import org.springframework.stereotype.Component;

// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

//@RestController
@Component
public class Hello {

    // @RequestMapping("/")
    public String greet() {
        return "Welkome Bruh!";
    }
}
