package com.example.auth.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.auth.entities.Endereco;
import com.example.auth.respositories.EnderecoRepositories;

@Service
public class EnderecoServices {
	
	
	private final EnderecoRepositories enderecoRepositories;
	//construtor que recebe a dependencia 
	@Autowired
	public EnderecoServices (EnderecoRepositories enderecoRepositories) {
	this.enderecoRepositories = enderecoRepositories;
	}
	public Endereco saveEndereco (Endereco endereco) {
	return enderecoRepositories.save (endereco);
	}
	public Endereco getEnderecoById (Long id) {
	return enderecoRepositories.findById(id).orElse (null);
	}
	public List<Endereco> getAllEndereco () {
	return enderecoRepositories.findAll();
	}
	public void deleteEndereco (Long id) {
		enderecoRepositories.deleteById(id);
	}
}
