package demo;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WhateverIWant {
	
	@RequestMapping("/hi/{name}")
	public  String  hiThere(Map model, @PathVariable String name){
		System.out.println("EEEEEEEEEEEEE: " + name);
		model.put("name",name);
		return "hola";	}
}
