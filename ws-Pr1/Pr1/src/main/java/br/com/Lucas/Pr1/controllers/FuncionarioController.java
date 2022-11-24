package br.com.Lucas.Pr1.controllers;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.Lucas.Pr1.models.Funcionario;
import br.com.Lucas.Pr1.services.FuncionarioService;

@RestController
@RequestMapping("/api/funcionario")
public class FuncionarioController {
	
	@Autowired
	private FuncionarioService _funcionarioService;
	
	@GetMapping
	private ResponseEntity<List<Funcionario>> getAll(){
		List<Funcionario> funcionarios = _funcionarioService.gettAll();
		return ResponseEntity.ok(funcionarios);	
	}
	
	@GetMapping(path ="/{id}")
	private ResponseEntity<Funcionario> getOne(@PathVariable Long id){
		Optional<Funcionario> funcionario = _funcionarioService.getOne(id);
		
		if(funcionario.isPresent()) {
			return ResponseEntity.ok(funcionario.get());
		}else {
			return ResponseEntity.notFound().build();
		}
	}
}
