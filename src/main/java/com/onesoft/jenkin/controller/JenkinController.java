package com.onesoft.jenkin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinController {
	
	@GetMapping(value = "/get")
	public String getMsg() {
		return "Done!!";
	}

}
