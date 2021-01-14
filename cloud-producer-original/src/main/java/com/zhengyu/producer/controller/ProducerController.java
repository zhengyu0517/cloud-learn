package com.zhengyu.producer.controller;

import com.fasterxml.jackson.datatype.jsr310.ser.DurationSerializer;
import com.zhengyu.producer.dto.UserDTO;
import com.zhengyu.producer.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/producer")
public class ProducerController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String get(@RequestParam String name){
         return "欢迎"+name;
    }

    @GetMapping("/user")
    public UserDTO getUser(@RequestParam String id,
    @RequestParam String name){
        UserDTO userDTO = new UserDTO();
        userDTO.setId(id);
        userDTO.setName(name);
        return userDTO;
    }

    @PostMapping("/post")
    public UserDTO postUser(@RequestBody User user){
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setName(user.getName());
        return userDTO;
    }
}
