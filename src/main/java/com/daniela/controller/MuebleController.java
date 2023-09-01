package com.daniela.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.daniela.model.Mueble;
import com.daniela.repository.IMuebleRepository;

@Controller
@RequestMapping("/mueble")
public class MuebleController {

	@Autowired
	private IMuebleRepository muebleRepository;
	
	@GetMapping("/muebles")
	public String listarMuebles(Model model) {
		List<Mueble> muebles = muebleRepository.findAll();
		model.addAttribute("muebles", muebles);
		return "lista-muebles";
	}
}
