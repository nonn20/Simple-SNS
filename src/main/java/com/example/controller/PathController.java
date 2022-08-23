package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.config.BeanTest;
import com.example.repository.ToukouRepository;

@Controller
public class PathController {
	@Autowired
	ToukouRepository repository;
	
	@Autowired
	BeanTest bean;
	
	@RequestMapping("home")
	public String goHome(Model model) {
		
		String toukouList[][] = new String[10][2];
		int getStart = (int) repository.count();
		
		int i = getStart;
		for(String[] toukou1:toukouList) {
			//toukouList = repository.findById(getStart-i);
			toukou1[0] = repository.findById(i).get().getName();
			toukou1[1] = repository.findById(i).get().getContent();
			i--;
		}
		
		model.addAttribute("bean", bean.inclement().getcount());
		model.addAttribute("toukou1",toukouList);
		return "home";
	}

}
