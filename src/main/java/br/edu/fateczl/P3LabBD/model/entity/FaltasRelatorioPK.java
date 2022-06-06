package br.edu.fateczl.P3LabBD.model.entity;

import java.io.Serializable;
import java.util.Date;

public class FaltasRelatorioPK implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int raAluno;
	private int codigoDisciplina;
	private String data;
	
	public int getRaAluno() {
		return raAluno;
	}
	public void setRaAluno(int raAluno) {
		this.raAluno = raAluno;
	}
	
	public int getCodigoDisciplina() {
		return codigoDisciplina;
	}
	public void setCodigoDisciplina(int codigoDisciplina) {
		this.codigoDisciplina = codigoDisciplina;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "FaltasRelatorioPK [raAluno=" + raAluno + ", codigoDisicplina=" + codigoDisciplina + ", data=" + data
				+ "]";
	}
	
}
