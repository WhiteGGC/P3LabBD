package br.edu.fateczl.P3LabBD.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import br.edu.fateczl.P3LabBD.model.dto.FaltasDTO;
import br.edu.fateczl.P3LabBD.model.dto.FaltasRelatorioDTO;
import br.edu.fateczl.P3LabBD.model.entity.Faltas;

public interface IFaltaController {
	
	public List<FaltasDTO> buscarFaltas();
	public ResponseEntity<String> atualizaFaltas(Faltas faltas);
	public List<FaltasRelatorioDTO> listaFaltas();
	public List<FaltasRelatorioDTO> listaFaltasAlunoDisc(int ra, int cod);
	
}
