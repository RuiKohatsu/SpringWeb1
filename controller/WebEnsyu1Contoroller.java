package com.example.lesson.controller;

import com.example.lesson.LessonApplication;
import com.example.lesson.record.ProductRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.lesson.service.ProductService;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;
@Controller
public class WebEnsyu1Contoroller {

    @Autowired
    private ProductService productService;
    @GetMapping("product-list")
    //@ResponseBodyを使用するとinput文字列が返されるだけとなる
    public String userList(Model model) {
        var list = productService.findAll();
        model.addAttribute("products", list);
        return "product-list";
    }

    @GetMapping("/product/{id}")
    public String output(@PathVariable("id") int id, Model model) {
        var product = productService.findById(id);
        System.out.println(product);
        model.addAttribute("product", product);
        return "product";
    }


}
