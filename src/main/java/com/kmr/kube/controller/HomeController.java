package com.kmr.kube.controller;

import com.kmr.kube.beans.User;
import com.kmr.kube.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @Autowired
    HomeService homeService;

    @GetMapping("/get")
    public String getMessage(){
        return "Hello World";

    }


    @GetMapping("/get/{msg}")
    public String getGreet(@PathVariable String msg){
        return "Hello "+msg;
    }


    @PostMapping
    public String postData(@RequestBody User user){
        return  homeService.postData(user);
    }



}
