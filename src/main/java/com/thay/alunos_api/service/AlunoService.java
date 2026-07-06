package com.thay.alunos_api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.thay.alunos_api.model.Aluno;
import com.thay.alunos_api.repository.AlunoRepository;


@Service
public class AlunoService {
    private AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }


    public List<Aluno> listarTodos(){
        
        return alunoRepository.findAll();
    } 

    public Aluno salvar(Aluno aluno){
        return alunoRepository.save(aluno);
    }

    public Aluno atualizar(Long id, Aluno aluno){
        aluno.setId(id);
        return alunoRepository.save(aluno);
    }

    public void deletar(Long id) {
         alunoRepository.deleteById(id);
    }
    

    
}
