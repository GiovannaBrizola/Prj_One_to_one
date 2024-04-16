package com.example.auth.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.auth.entities.Pessoa;
import com.example.auth.respositories.PessoaRepositories;

@Service
public class PessoaServices {
	private final PessoaRepositories pessoaRepositories;
	@Autowired
	public PessoaServices (PessoaRepositories pessoaRepositories) {
	this.pessoaRepositories = pessoaRepositories;
	}
	public Pessoa savePessoa (Pessoa endereco) {
	return pessoaRepositories.save (endereco);
	}
	public Pessoa getPessoaById (Long id) {
	return pessoaRepositories.findById(id).orElse (null);
	}
	public List<Pessoa> getAllPessoa () {
	return pessoaRepositories.findAll();
	}
	public void deletePessoa (Long id) {
		pessoaRepositories.deleteById(id);
	}
	
}
