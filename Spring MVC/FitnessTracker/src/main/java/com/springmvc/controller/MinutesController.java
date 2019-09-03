package com.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springmvc.model.Activity;
import com.springmvc.model.Exercise;

@Controller
public class MinutesController {
	
	@RequestMapping(value="/addMinutes")
	public String addMinutes(@ModelAttribute("exercise") Exercise exercise)
	{
		System.out.println("exercise:"+exercise.getMinutes());
		return "addMinutes";
	}

	
	@RequestMapping(value="/activities")
    public @ResponseBody List<Activity> findAll()
    {
		List<Activity> activities =new ArrayList();
		
		Activity run=new Activity();
		run.setDesc("run");
		activities.add(run);
		
		Activity swim=new Activity();
		run.setDesc("swim");
		activities.add(swim);
		
		Activity walk=new Activity();
		run.setDesc("walk");
		activities.add(walk);
		
		return activities;
		
    }
	
	
	/*
	 * @RequestMapping(value="/addMoreMinutes") public String
	 * addMoreMinutes(@ModelAttribute("exercise") Exercise exercise) {
	 * System.out.println("Exercising for:"+exercise.getMinutes()); return
	 * "addMinutes"; }
	 */
}
