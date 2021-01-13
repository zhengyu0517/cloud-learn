package com.zhengyu.producer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String get(@RequestParam String name){
         return "欢迎"+name;
    }

}
