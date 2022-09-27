package io.avenue.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/index")
public class MainController {
	
	@GetMapping
	public String mainIdex() {
		return "index";
	}

}
