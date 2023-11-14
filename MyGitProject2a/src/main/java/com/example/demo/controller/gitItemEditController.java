package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class gitItemEditController {

	@RequestMapping(path = "/gititemedit", method = RequestMethod.GET)
	public String doEditGet(String productName, String productPrice, Model model) {

		model.addAttribute("productName", productName);
		model.addAttribute("productPrice", productPrice);
		return "gititemedit";
	}

	//一覧表示用
	@RequestMapping(path = "/gititemedit", method = RequestMethod.POST)
	public String doEditPost(@RequestParam String productName, @RequestParam String productPrice, Model model) {

		model.addAttribute("productName", productName);
		model.addAttribute("productPrice", productPrice);
		return "gititemeditupdate";
	}
}