package com.desafio.quality.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.quality.dto.RequestUsuarioDTO;
import com.desafio.quality.model.Usuario;
import com.desafio.quality.service.UsuarioService;

@RestController
@RequestMapping("/api/v1/usuario")
public class UsuarioController {
	@Autowired
	private UsuarioService service;
	
	@GetMapping("/todos")
	public List<Usuario> greeting() {
		return service.buscaTodos();
	}
	
    @RequestMapping(method =  RequestMethod.POST)
    public  ResponseEntity<Usuario> salvaOuAtualiza(@RequestBody RequestUsuarioDTO usuario){
        return new ResponseEntity<Usuario>(service.salva(usuario), HttpStatus.OK); 
    }

}
