package com.stefanini.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "TB_PERFIL")
public class Perfil implements Serializable { //A serialização significa salvar o estado atual dos objetos em arquivos em formato binário para o seu computador, sendo assim esse estado poderá ser recuperado posteriormente recriando o objeto em memória assim como ele estava no momento da sua serialização.
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //STRATEGY -> (Opcional) A estratégia de geração de chave primária que o provedor de persistência deve usar para gerar a chave primária da entidade anotada.
	@Column(name = "CO_SEQ_PERFIL")
	private Long id;
	
	@NotNull
	@Column(name = "NO_PERFIL")
	private String nomePerfil;
	
	@NotNull
	@Column(name = "DS_PERFIL")
	private String dsPerfil;
	
	@NotNull
	@Column(name = "DT_HORA_INCLUSAO")
	private Date dataHoraInclusao;
	
	@NotNull
	@Column(name = "DT_HORA_ALTERACAO")
	private Date dataHoraAlteracao;
	
//	@OneToMany(mappedBy= "perfil")                   //mapeando as tabelas
//	private Set<Pessoa> Pessoa;
	
public Perfil() {
	
}


public Perfil(@NotNull String nome, @NotNull   String dsPerfil, @NotNull Date dataHoraInclusao, @NotNull Date dataHoraAlteracao  ) {
	super();
	this.nomePerfil = nomePerfil;
	this.dsPerfil = dsPerfil;
	this.dataHoraInclusao = dataHoraInclusao;
	this.dataHoraAlteracao = dataHoraAlteracao; 
	
 }
 
//public Set<Pessoa> getPessoa(){
//		return pessoa;
//	}
//
//	public void setPessoa(Set<Pessoa> pessoa) {
//		this.pessoa = pessoa;
//	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getPerfil() {
		return nomePerfil;
	}


	public void setPerfil(String nomePerfil) {
		this.nomePerfil = nomePerfil;
	}


	public String getDsPerfil() {
		return dsPerfil;
	}


	public void setDsPerfil(String dsPerfil) {
		this.dsPerfil = dsPerfil;
	}


	public Date getDataHoraInclusao() {
		return dataHoraInclusao;
	}


	public void setDataHoraInclusao(Date dataHoraInclusao) {
		this.dataHoraInclusao = dataHoraInclusao;
	}


	
	public Date getDataHoraAlteracao() {
		return dataHoraAlteracao;
	}


	
	public void setDataHoraAlteracao(Date dataHoraAlteracao) {
		this.dataHoraAlteracao = dataHoraAlteracao;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataHoraAlteracao == null) ? 0 : dataHoraAlteracao.hashCode());
		result = prime * result + ((dataHoraInclusao == null) ? 0 : dataHoraInclusao.hashCode());
		result = prime * result + ((dsPerfil == null) ? 0 : dsPerfil.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nomePerfil == null) ? 0 : nomePerfil.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Perfil other = (Perfil) obj;
		if (dataHoraAlteracao == null) {
			if (other.dataHoraAlteracao != null)
				return false;
		} else if (!dataHoraAlteracao.equals(other.dataHoraAlteracao))
			return false;
		if (dataHoraInclusao == null) {
			if (other.dataHoraInclusao != null)
				return false;
		} else if (!dataHoraInclusao.equals(other.dataHoraInclusao))
			return false;
		if (dsPerfil == null) {
			if (other.dsPerfil != null)
				return false;
		} else if (!dsPerfil.equals(other.dsPerfil))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nomePerfil == null) {
			if (other.nomePerfil != null)
				return false;
		} else if (!nomePerfil.equals(other.nomePerfil))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Perfil [id=" + id + ", nomePerfil=" + nomePerfil + ", dsPerfil=" + dsPerfil + ", dataHoraInclusao="
				+ dataHoraInclusao + ", dataHoraAlteracao=" + dataHoraAlteracao + "]";
	}


	
	
	
	}








		

