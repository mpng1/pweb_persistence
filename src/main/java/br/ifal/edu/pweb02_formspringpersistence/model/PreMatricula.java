package br.ifal.edu.pweb02_formspringpersistence.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class PreMatricula {
	
	
	@jakarta.persistence.Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Id;
	
	private String nomedoaluno;
	
	private LocalDate nascimento;
	
	private String nomedamae;
	
	private String nomedopai;
	
	private String telefone;
	
	private String email;
	
	private String serie;
	
	private String turno;
	
	private List<String> extracurriculares;
	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

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

	
	
}
