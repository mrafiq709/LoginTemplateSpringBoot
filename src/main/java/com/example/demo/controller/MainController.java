package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.User;

@Controller
public class MainController {

	/**
	 * Login Page -> Get Mapping: User will see the login Page for enter credential
	 * @return -> login.html Page
	 */
	@GetMapping("/login")
	public String loginGet(Model model) {
		model.addAttribute("data", new User());
		return "login";
	}
	
	/**
	 * Login Page -> Post Mapping: Get User Input data from login page
	 * @return -> login.html Page
	 */
	@PostMapping("/login-processing")
	public String loginPost(Model model, @ModelAttribute("data") User user) {
		System.out.println("Login Data: " + user.getEmail());
		return "NewFile";
	}
}
