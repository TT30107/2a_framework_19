package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class syouhinhensyuController {

	@RequestMapping(path = "/hensyu", method = RequestMethod.GET)
	public String viewPage() {

		return "syouhinhensyu";
	}

	//一覧表示用
	@RequestMapping(path = "/myhome", method = RequestMethod.POST)
	public String loginPost(String pjId, Model model) {

		return "myhome";
	}
}