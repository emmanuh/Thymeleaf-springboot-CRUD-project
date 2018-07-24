package com.emuthui.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.emuthui.entity.County;
import com.emuthui.repository.CountryRepository;

@Controller
public class CountryController {
	
	@Autowired
	private CountryRepository countryRepository; 
	

	@GetMapping("/")
    public String home(Model model, @RequestParam(defaultValue = "0") int page) {
		model.addAttribute("data",countryRepository.findAll(PageRequest.of(page, 4)));
		model.addAttribute("currentPage", page);
		return "index";
	}
	@PostMapping("/save")
	public String save(County c) {
		
		countryRepository.save(c);
		return "redirect:/";
	}
	
	@GetMapping("/findone")
	@ResponseBody
	public Optional<County> findOne(@RequestParam Integer id) {	
		return countryRepository.findById(id);
	 
	}
	@GetMapping("/delete")
    public String delete(@RequestParam Integer id) {
		countryRepository.deleteById(id);
		return "redirect:/";
	}
}
