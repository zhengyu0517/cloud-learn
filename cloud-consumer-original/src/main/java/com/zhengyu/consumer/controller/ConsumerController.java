package com.zhengyu.consumer.controller;

import com.zhengyu.consumer.dto.UserDTO;
import com.zhengyu.consumer.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public UserDTO getUser(){
        return restTemplate.getForObject("http://localhost:9000/producer/user?id=1&name=zhengyu",UserDTO.class);
    }

    @PostMapping("/post")
    public UserDTO postUser(@RequestBody User user){
        return restTemplate.postForObject("http://localhost:9000/producer/post",user,UserDTO.class);
    }
}
