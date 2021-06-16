package com.MyProject.Blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //Processing of all transitions on the site
public class MainController {

    @GetMapping/*Processing URL address */("/") // URL address  "/" - main page
    public String home(Model model) {
        model.addAttribute("title", "Главня страница");
        return "home.html"; // calling the template "home"
    }

    public String menu(Model model) {
        model.addAttribute("title", "Меню");
        return "menu.html"; // calling the template "home"
    }

}
