package com.springdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springdemo.services.Humn;

@Controller
@RequestMapping("/demo")
public class DemoController {

	@Autowired
	public Humn humn;
	
    @RequestMapping("/index")
    public String index(){
        return "demo";
    }
    @RequestMapping("/add")
    public ModelAndView add(){
    	ModelAndView model=new ModelAndView(humn.show());
    	System.out.println(humn.show());
    	return model;
    }
}