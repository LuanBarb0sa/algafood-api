package com.llucasb.algafood.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.llucasb.algafood.domain.model.Cozinha;
import com.llucasb.algafood.domain.repository.CozinhaRepository;

@RestController
@RequestMapping( value = "/cozinhas")
public class CozinhaController {
	
	private static final Logger logger = LoggerFactory.getLogger(CozinhaController.class);

	@Autowired
	private CozinhaRepository cozinhaRepository;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Cozinha> listar() {
		return cozinhaRepository.listar();
	}
	
	@GetMapping(produces = MediaType.APPLICATION_XML_VALUE)
	public List<Cozinha> listarXml() {
		return cozinhaRepository.listar();
	}
	
}