package com.example.auth.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.auth.entities.Endereco;
import com.example.auth.services.EnderecoServices;

@RestController
@RequestMapping("/products")
public class EnderecoController {

	private final EnderecoServices enderecoServices;
	@Autowired
	public EnderecoController (EnderecoServices enderecoServices) {
	this.enderecoServices = enderecoServices;
	}
	@PostMapping
	public Endereco createEndereco (@RequestBody Endereco endereco) {
	return enderecoServices.saveEndereco (endereco);
	}
	@GetMapping("/{id}")
	public Endereco getEndereco (@PathVariable Long id) { return enderecoServices.getEnderecoById(id);
	}
	@GetMapping
	public List<Endereco> getAllEndereco () {
	return enderecoServices.getAllEndereco();
	}
	@DeleteMapping("/{id}")
	public void deleteProduto (@PathVariable Long id) {
		enderecoServices.deleteEndereco(id);
	}
}

