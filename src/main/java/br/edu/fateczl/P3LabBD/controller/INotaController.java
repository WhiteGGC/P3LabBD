package br.edu.fateczl.P3LabBD.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import br.edu.fateczl.P3LabBD.model.dto.NotasDTO;
import br.edu.fateczl.P3LabBD.model.dto.NotasRelatorioDTO;
import br.edu.fateczl.P3LabBD.model.entity.Notas;

public interface INotaController {
	
	public List<NotasDTO> buscarNotas();
	public ResponseEntity<String> atualizaNotas(Notas notas);
	public ResponseEntity<String> insereNotas(Notas notas);
	public List<NotasRelatorioDTO> listaNotas();
	public List<NotasRelatorioDTO> listaNotasAlunoDisc(int ra, int cod);
	
}
