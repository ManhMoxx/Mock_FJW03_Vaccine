package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ScheduleController {
	
	@GetMapping("/ScheduleList")
	public String ScheduleList() {
		
		return"scheduleListPage";
	}
}
