package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.dao.ScheduleDAO;
import com.spring.dao.VaccineDAO;
import com.spring.entities.Schedule;

@Controller
public class ScheduleController {
	
	@Autowired
	ScheduleDAO scheduleDAO;
	
	@Autowired
	VaccineDAO vaccineDAO;
	
	@GetMapping("/ScheduleList")
	public String ScheduleList(
			@RequestParam(name = "pageNum" , defaultValue = "1") Integer pageNum,
			@RequestParam(name = "pageSize", defaultValue = "5") Integer pageSize,
			ModelMap map
	) {
		map.addAttribute("list", scheduleDAO.findAll(pageNum, pageSize) );
		return"scheduleListPage";
	}
	
	@GetMapping("/createschedule")
	public String createSchedule(ModelMap map) {
		map.addAttribute("listVaccine", vaccineDAO.findAll());
		return "createSchedulePage";
	}
	@PostMapping("/createschedule")
	public String saveSchedule(Schedule s, ModelMap map) {		
		scheduleDAO.create(s);
		return "createSchedulePage";		
	}
}
