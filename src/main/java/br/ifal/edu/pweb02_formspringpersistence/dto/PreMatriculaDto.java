package br.ifal.edu.pweb02_formspringpersistence.dto;

import java.time.LocalDate;
import java.util.List;

import br.ifal.edu.pweb02_formspringpersistence.model.PreMatricula;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class PreMatriculaDto {

	@NotBlank(message="Nome do aluno obrigatório")
	private String nomedoaluno;
	@NotNull(message="Data de nascimento obrigatória")
	private LocalDate nascimento;
	@NotBlank(message="Nome da mãe obrigatório")
	private String nomedamae;
	@NotBlank(message="Nome do pai obrigatório")
	private String nomedopai;
	@NotBlank(message="Telefone obrigatório")
	private String telefone;
	@Email @NotBlank(message="E-mail inválido")
	private String email;
	@NotBlank(message="Série inválida")
	private String serie;
	@NotBlank(message="Turno inválido")
	private String turno;
	@Size(max = 3, message="Você só pode escolher três atividades extracurriculares.")
	private List<String> extracurriculares;
	
	public String getNomedoaluno() {
		return nomedoaluno;
	}
	public void setNomedoaluno(String nomedoaluno) {
		this.nomedoaluno = nomedoaluno;
	}
	public LocalDate getNascimento() {
		return nascimento;
	}
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
	public String getNomedamae() {
		return nomedamae;
	}
	public void setNomedamae(String nomedamae) {
		this.nomedamae = nomedamae;
	}
	public String getNomedopai() {
		return nomedopai;
	}
	public void setNomedopai(String nomedopai) {
		this.nomedopai = nomedopai;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public List<String> getExtracurriculares() {
		return extracurriculares;
	}
	public void setExtracurriculares(List<String> extracurriculares) {
		this.extracurriculares = extracurriculares;
	}
	
	public PreMatricula toPreMatricula() {
		PreMatricula prematricula = new PreMatricula();
		prematricula.setNomedoaluno(nomedoaluno);
		prematricula.setNascimento(nascimento);
		prematricula.setNomedamae(nomedamae);
		prematricula.setNomedopai(nomedopai);
		prematricula.setTelefone(telefone);
		prematricula.setEmail(email);
		prematricula.setSerie(serie);
		prematricula.setTurno(turno);
		prematricula.setExtracurriculares(extracurriculares);
		return prematricula;
		
	}
	
	
	
}
