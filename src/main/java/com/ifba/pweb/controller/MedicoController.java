package com.ifba.pweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ifba.pweb.dto.MedicoDTO;
import com.ifba.pweb.entities.Medico;
import com.ifba.pweb.repository.MedicoRepository;

@RestController
public class MedicoController {

	@Autowired
	private MedicoRepository repository;
	
	@GetMapping("/medico")
	public ResponseEntity<List<MedicoDTO>> listarMedicos(){
		
		return ResponseEntity.ok().body(MedicoDTO.converte(repository.findAll()));
		
	}
	
	

}
