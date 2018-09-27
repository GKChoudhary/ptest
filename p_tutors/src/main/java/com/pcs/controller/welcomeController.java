package com.pcs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class welcomeController {
	/*@RequestMapping(value="/welcome")
	public String welcome(){
		return "index";
	}
	*/
	@RequestMapping(value="/tutor_reg1")
	public String tutorReg1(){
		return "tutor_reg1";
	}

}
