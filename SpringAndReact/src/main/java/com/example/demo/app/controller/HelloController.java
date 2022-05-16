package com.example.demo.app.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.entity.BirthStone;

@RestController
@CrossOrigin(origins = "*") 
public class HelloController {
	
    @GetMapping("/api/hello")
    @ResponseBody
    public BirthStone getBirthStone() {
        BirthStone birthStone = new BirthStone("2月", "アメジスト", "紫");
        return birthStone;
    }
}