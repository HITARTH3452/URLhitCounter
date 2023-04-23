package com.geekster.UrlHitCounter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
    @RestController
    public class UrlHitController{
        static HashMap<String,Integer> counter = new HashMap<>();

        @GetMapping("count/{username}")
                public String HitCount(@PathVariable String username){
            if(username != null){
                counter.put(username,counter.getOrDefault(username,0)+1);
            }
            return "username:"+ username + "Hitcounter: "+ counter.get(username);
        }
    }

