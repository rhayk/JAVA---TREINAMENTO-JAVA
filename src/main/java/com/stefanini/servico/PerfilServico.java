package com.stefanini.servico;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.validation.Valid;

import com.stefanini.dao.PerfilDao;
import com.stefanini.model.Perfil;
import com.stefanini.util.IGenericService;

/**
 * 
 * Classe de servico, as regras de negocio devem estar nessa classe
 *
 */
public class PerfilServico implements IGenericService<Perfil, Long>{

	@Inject
	private PerfilDao dao;
	
	
	
	
	public Perfil salvar(@Valid Perfil perfil) {
		return dao.salvar(perfil);
	}
	
	/**
	 * Atualizar os dados de um Perfil
	 */
	
	@Override
	public Perfil atualizar(@Valid Perfil entity) {
		return dao.atualizar(entity);
	}
	
	/**
	 * Remover um Perfil pelo id
	 */
	@Override
	public void remover(@Valid Long id) {
		dao.remover(id);
	}
	
	/**
	 * Buscar uma lista de Perfil
	 */
	
	
	@Override
	public Optional<List<Perfil>> getList(){
		return dao.getList();
	}
	
	/**
	 * Buscar uma Perfil pelo ID
	 */
	
	@Override
	public Optional<Perfil> encontrar(Long id) {
		return dao.encontrar(id);
	
	}
}
