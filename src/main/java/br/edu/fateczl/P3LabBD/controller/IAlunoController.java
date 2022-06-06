package br.edu.fateczl.P3LabBD.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import br.edu.fateczl.P3LabBD.model.dto.AlunoDTO;
import br.edu.fateczl.P3LabBD.model.entity.Aluno;

public interface IAlunoController {

	public List<AlunoDTO> buscarAlunos();
	public ResponseEntity<AlunoDTO> buscarAluno(int ra);
	public ResponseEntity<String> insereAluno(Aluno aluno);
	public ResponseEntity<String> atualizaAluno(Aluno aluno);
	public ResponseEntity<String> excluiAluno(Aluno aluno);
	
}
