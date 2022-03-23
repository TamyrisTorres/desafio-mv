package com.example.desafiomv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.desafiomv.entities.Cafe;
import com.example.desafiomv.repositories.CafeRepository;

@Service
public class CafeService {

	@Autowired
	private CafeRepository cafeRepository;

	
	
	
	

}
