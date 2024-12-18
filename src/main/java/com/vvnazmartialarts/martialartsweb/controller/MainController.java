package com.vvnazmartialarts.martialartsweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/requirements")
    public String requirements() {
        return "requirements";  // This will return the requirements.html page
    }

    @GetMapping("/pledges")
    public String pledges() {
        return "pledges";  // This will return the pledges.html page
    }

    @GetMapping("/photos")
    public String photos() {
        return "photos";  // This will return the photos.html page
    }
}
