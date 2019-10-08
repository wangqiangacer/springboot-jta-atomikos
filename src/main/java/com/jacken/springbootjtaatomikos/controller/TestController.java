package com.jacken.springbootjtaatomikos.controller;

import com.jacken.springbootjtaatomikos.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

	@Autowired
	private TestService testService;
	
	@RequestMapping("/index")
	@ResponseBody
	public String index(){
		testService.save();
		return "insert success!!!";
	}
}
