package br.edu.fateczl.P3LabBD.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.edu.fateczl.P3LabBD.model.entity.NotasRelatorio;

public interface NotasRelatorioRepository extends JpaRepository<NotasRelatorio, Integer>{
	
	@Query(value = "SELECT n.ra_aluno, a.nome AS nome_aluno, n.codigo_disciplina, d.nome AS nome_disciplina, d.sigla, d.turno, d.num_aulas, n.codigo_avaliacao, av.tipo, n.nota "
			+ " FROM aluno a, disciplina d, notas n, avaliacao av"
			+ " WHERE n.codigo_disciplina = d.codigo"
			+ " AND a.ra = n.ra_aluno"
			+ " AND n.codigo_avaliacao = av.codigo",
			nativeQuery = true)
	public List<NotasRelatorio> geraLista();
	
	@Query(value = "SELECT n.ra_aluno, a.nome AS nome_aluno, n.codigo_disciplina, d.nome AS nome_disciplina, d.sigla, d.turno, d.num_aulas, n.codigo_avaliacao, av.tipo, n.nota "
			+ " FROM aluno a, disciplina d, notas n, avaliacao av"
			+ " WHERE n.codigo_disciplina = d.codigo"
			+ " AND a.ra = n.ra_aluno"
			+ " AND n.codigo_avaliacao = av.codigo"
			+ " AND n.ra_aluno = ?1"
			+ " AND n.codigo_disciplina = ?2",
			nativeQuery = true)
	public List<NotasRelatorio> geraListaAlunoDisc(int ra, int cod);
}
