package com.tuanc.auc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/","home"})
public class HomeCtrl {
	@GetMapping(value= {"","index"})
	public String index() {
		return "home/index";
	}
}
