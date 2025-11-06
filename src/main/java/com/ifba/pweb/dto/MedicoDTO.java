package com.ifba.pweb.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.ifba.pweb.entities.Medico;
import com.ifba.pweb.enums.Especialidade;

public class MedicoDTO {

	private String nome;
	private String email;
	private String crm;
	private Especialidade especialidade;

	public MedicoDTO(Medico medico) {
		this.nome = medico.getNome();
		this.email = medico.getEmail();
		this.especialidade = medico.getEspecialidade();
		this.crm = medico.getCrm();
	}

	private MedicoDTO() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public Especialidade getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}
	
	public static List<MedicoDTO> converte(List<Medico> lista){
		 return lista.stream().map(MedicoDTO::new).collect(Collectors.toList());
		 }

	

}
