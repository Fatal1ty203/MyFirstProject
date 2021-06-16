package com.MyProject.Blog.controllers;

import com.MyProject.Blog.models.FullMenu;
import com.MyProject.Blog.repo.FullMenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Iterator;

@Controller
public class BlogController {

    @Autowired
    private FullMenuRepository fullMenuRepository;

    @GetMapping("/menu")
    public String menu(Model model){
        Iterable<FullMenu> fullMenus = fullMenuRepository.findAll(); //all values from table in database
        model.addAttribute("fullMenus",fullMenus);
        return "menu";
    }

}
