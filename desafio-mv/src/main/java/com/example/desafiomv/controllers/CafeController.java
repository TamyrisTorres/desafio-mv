package com.example.desafiomv.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.desafiomv.entities.Cafe;
import com.example.desafiomv.repositories.CafeRepository;

@RestController

@RequestMapping("/cafe")
public class CafeController {

	@Autowired
	private CafeRepository cafeRepository;
	
	
	@PostMapping
	public @ResponseBody Cafe cafeDaManha(@RequestParam String colaborador,@RequestParam String cpf,@RequestParam String comida) {
		Cafe cafe = new Cafe(colaborador, cpf, comida);
		cafeRepository.save(cafe);
		return cafe;
	}
	@GetMapping
	public Iterable<Cafe> obterLista() {
		return cafeRepository.findAll();
	}
	
	
	@PutMapping
	public Cafe alterarCafe(Cafe cafe) {
		cafeRepository.save(cafe);
		return cafe;
	}
	@DeleteMapping(path = "/{id)")
	public void excluirCafe(Long id) {
		cafeRepository.deleteById(id);
	}
	
	
	
}
