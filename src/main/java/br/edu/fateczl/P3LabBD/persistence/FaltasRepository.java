package br.edu.fateczl.P3LabBD.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import br.edu.fateczl.P3LabBD.model.entity.Faltas;

public interface FaltasRepository extends JpaRepository<Faltas, Integer>{
	
	@Procedure(name = "Faltas.spAtualizaFaltas")
	String spAtualizaFaltas(@Param("presenca") String presenca,
			@Param("ra") int ra, @Param("codigo") int codigo, 
			@Param("data") String data);
}
