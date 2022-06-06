package br.edu.fateczl.P3LabBD.model.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName(value = "faltas")
//@JsonTypeInfo(include = JsonTypeInfo.As.WRAPPER_OBJECT, use = JsonTypeInfo.Id.NAME)
public class FaltasDTO {

	private AlunoDTO aluno;
	private DisciplinaDTO disciplina;
	private String data;
	private String presenca;
	
	
	public AlunoDTO getAluno() {
		return aluno;
	}
	public void setAluno(AlunoDTO aluno) {
		this.aluno = aluno;
	}
	public DisciplinaDTO getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(DisciplinaDTO disciplina) {
		this.disciplina = disciplina;
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getPresenca() {
		return presenca;
	}
	public void setPresenca(String presenca) {
		this.presenca = presenca;
	}
	@Override
	public String toString() {
		return "FaltasDTO [aluno=" + aluno + ", disciplina=" + disciplina + ", data=" + data + ", presenca=" + presenca
				+ "]";
	}
	
}
