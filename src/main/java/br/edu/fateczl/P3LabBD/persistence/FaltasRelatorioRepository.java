package br.edu.fateczl.P3LabBD.persistence;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import br.edu.fateczl.P3LabBD.model.entity.FaltasRelatorio;

public interface FaltasRelatorioRepository extends JpaRepository<FaltasRelatorio, Integer>{
	
	@Query(value = "SELECT *, a.nome AS nome_aluno, d.nome AS nome_disciplina FROM aluno a, disciplina d, faltas f"
			+ " WHERE f.codigo_disciplina = d.codigo"
			+ " AND a.ra = f.ra_aluno",
			nativeQuery = true)
	public List<FaltasRelatorio> geraLista();
	
	@Query(value = "SELECT *, a.nome AS nome_aluno, d.nome AS nome_disciplina FROM aluno a, disciplina d, faltas f"
			+ " WHERE f.codigo_disciplina = d.codigo"
			+ " AND a.ra = f.ra_aluno"
			+ " AND f.ra_aluno = ?1"
			+ " AND f.codigo_disciplina = ?2",
			nativeQuery = true)
	public List<FaltasRelatorio> geraListaAlunoDisc(int ra, int cod);
	
}
