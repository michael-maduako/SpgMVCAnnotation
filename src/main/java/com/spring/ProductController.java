package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ProductController {
	@GetMapping("/")
	public String displayProduct(ModelMap map) {
		map.addAttribute("prd","Laptop and Projector");
		return "index";
	}
}
