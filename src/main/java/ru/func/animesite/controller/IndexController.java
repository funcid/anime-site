package ru.func.animesite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author func 29.12.2019
 */
@Controller
public class IndexController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
