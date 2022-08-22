package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entity.Toukou;
import com.example.repository.ToukouRepository;

@Controller
public class ToukouController {
	@ModelAttribute
	public Toukou setUpForm() {
		return new Toukou();
	}
	
	@RequestMapping("toukou1")
	public String toukou() {
		return "toukou";
	}
	
	@Autowired
	ToukouRepository repository;

	@PostMapping("shupo")
	public String submit(@Validated Toukou form,
						BindingResult bindingResult,
						Model model
						/*@RequestParam(name="name") String name,
						@RequestParam(name="content") String content*/) {
		
		/*エラー拾い*/
		if(bindingResult.hasErrors()) {
			List<String> errorList = new ArrayList<String>();
            for (ObjectError error : bindingResult.getAllErrors()) {
                errorList.add(error.getDefaultMessage());
            }
            model.addAttribute("validationError", errorList);
            return "toukou";
		}
		/*データベースに登録*/
		repository.save(form);
		
		return "redirect:home";
	}
}

