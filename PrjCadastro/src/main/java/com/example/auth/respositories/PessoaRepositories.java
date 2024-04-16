package com.example.auth.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.auth.entities.Pessoa;

public interface PessoaRepositories extends JpaRepository<Pessoa, Long> {

}

