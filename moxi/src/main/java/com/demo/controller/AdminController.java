package com.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Admin;
import com.demo.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
    private AdminService service;
	
	@RequestMapping("index")
    public ModelAndView page1() {
        return new ModelAndView("/index.html") ;
    }
	//
	@RequestMapping("map")
	public Map<String, String> map1(){
		Map<String, String> map=new HashMap<String, String>();
		map.put("name", "zhangsan");
		map.put("age", "28");
		return map;
	}
	@RequestMapping("login")
    public Admin page2(Admin admin) {
        return service.findById(admin);
    }
}
