package br.edu.fateczl.P3LabBD.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fateczl.P3LabBD.model.entity.Disciplina;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Integer> {
	
	public Disciplina findByNome(String nome);

}
