package com.example.auth.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.auth.entities.Endereco;
import com.example.auth.entities.Pessoa;
import com.example.auth.services.EnderecoServices;
import com.example.auth.services.PessoaServices;

public class PessoaController {

	private final PessoaServices pessoaServices;
	@Autowired
	public PessoaController (PessoaServices pessoaServices) {
	this.pessoaServices = pessoaServices;
	}
	@PostMapping
	public Pessoa createPessoa (@RequestBody Pessoa pessoa) {
	return pessoaServices.savePessoa (pessoa);
	}
	@GetMapping("/{id}")
	public Pessoa getPessoa (@PathVariable Long id) { return pessoaServices.getPessoaById(id);
	}
	@GetMapping
	public List<Pessoa> getAllEndereco () {
	return pessoaServices.getAllPessoa();
	}
	@DeleteMapping("/{id}")
	public void deletePessoa (@PathVariable Long id) {
		pessoaServices.deletePessoa(id);
	}
}


