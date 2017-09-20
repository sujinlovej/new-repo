package com.study.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StarController {
	
	@RequestMapping("/study/showMessage.html")
	public String showMessage(Model model, HttpServletRequest req, HttpServletResponse res) {
		
		
		model.addAttribute("message", "Hello, Spring Web Programming");
		
		return "showMessage";
		
	}

}
