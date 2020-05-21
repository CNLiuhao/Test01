package com.liuhao.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @GetMapping(value = "test01/{id}/{name}")
    @ResponseBody
    public String test01(@PathVariable("id") Integer id,@PathVariable("name") String name){
        return "id:"+id + "name:"+name;
    }

}
