package com.thay.alunos_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thay.alunos_api.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    
}
