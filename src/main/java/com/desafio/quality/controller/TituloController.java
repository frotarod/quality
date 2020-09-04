package com.desafio.quality.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Transient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.quality.converter.ResponseConverter;
import com.desafio.quality.dto.ResponseDTO;
import com.desafio.quality.model.Titulo;
import com.desafio.quality.model.Usuario;
import com.desafio.quality.service.TituloService;

@RestController
@RequestMapping("/api/v1/titulo")
public class TituloController {
	@Autowired
	private TituloService service;
	
	
	@GetMapping("/usuario")
	@ResponseBody
	public List<Titulo> buscaPorUsario(@RequestParam String nome) {
		return service.buscaPorUsuario(nome);
	}
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/todos")
	public  ResponseEntity<List<ResponseDTO>> buscaTodos() {
		List<Titulo> titulos = service.buscaTodos();
		return  new ResponseEntity<List<ResponseDTO>>(ResponseConverter.converter(titulos), HttpStatus.OK);
	}

}
