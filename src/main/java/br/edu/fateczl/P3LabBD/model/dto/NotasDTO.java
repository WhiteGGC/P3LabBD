package br.edu.fateczl.P3LabBD.model.dto;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName(value = "notas")
//@JsonTypeInfo(include = JsonTypeInfo.As.WRAPPER_OBJECT, use = JsonTypeInfo.Id.NAME)
public class NotasDTO {
	
	private AlunoDTO aluno;
	private DisciplinaDTO disciplina;
	private AvaliacaoDTO avaliacao;
	private Float nota;
	
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
	public AvaliacaoDTO getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(AvaliacaoDTO avaliacao) {
		this.avaliacao = avaliacao;
	}
	public Float getNota() {
		return nota;
	}
	public void setNota(Float nota) {
		this.nota = nota;
	}
	@Override
	public String toString() {
		return "NotasDTO [aluno=" + aluno + ", disciplina=" + disciplina + ", avaliacao=" + avaliacao + ", nota=" + nota
				+ "]";
	}
	
}
