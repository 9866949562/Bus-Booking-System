package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.springboot.DTO.ReservationDTO;

@Controller
@RequestMapping("/dashboard")
public class DashboardController {
	
	@ModelAttribute("reservation")
	public ReservationDTO reservationDTO() {
		return new ReservationDTO();
	}
	
	@GetMapping
	public String displayDashboard() {
		return "dashboard";
		
	}
	
	@PostMapping
	public String saveStudent(@ModelAttribute("reservation") ReservationDTO reservationDTO) {
		return "dashboard";
	}
	
	
	

}
