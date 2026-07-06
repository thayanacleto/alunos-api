package com.thay.alunos_api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thay.alunos_api.model.Aluno;
import com.thay.alunos_api.service.AlunoService;


@RestController
@RequestMapping("/alunos")
public class AlunoController {
    private AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

@GetMapping 
public List<Aluno> listarTodos() {
    return alunoService.listarTodos();
}

@PostMapping 
public Aluno salvar(@RequestBody Aluno aluno) {
    return alunoService.salvar(aluno);
}

@PutMapping("/{id}")
public Aluno atualizar(@PathVariable Long id, @RequestBody Aluno aluno){

    return alunoService.atualizar(id, aluno);
    
}


@DeleteMapping("/{id}") 
public void deletar(@PathVariable Long id) {
        alunoService.deletar(id);
}



}
