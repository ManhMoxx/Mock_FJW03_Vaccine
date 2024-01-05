package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CreateSchedule {
	@GetMapping("/createschedule")
	public String createSchedule() {
		return "createSchedulePage";
	}
}
