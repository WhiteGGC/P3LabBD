package br.edu.fateczl.P3LabBD.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fateczl.P3LabBD.model.entity.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
	
}
