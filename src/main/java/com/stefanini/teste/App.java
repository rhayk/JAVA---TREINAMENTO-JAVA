package com.stefanini.teste;

import java.time.LocalDate;
import java.util.Optional;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;
import javax.inject.Inject;

import com.stefanini.model.Pessoa;
import com.stefanini.servico.PessoaServico;

public class App {

	@Inject
	private PessoaServico pessoaServico;

	public static void main(String[] args) {
		// CONFIGURACAO PARA INICIAR O CONTAINER PARA GERENCIAMENTO DO CDI
		SeContainerInitializer initializer = SeContainerInitializer.newInstance();
		try (final SeContainer container = initializer.initialize()) {
			App app = container.select(App.class).get();
			app.executar();
		}
	}

	public void executar() {
		buscarTodos();
//		encontrar();
//		salvar();
//		remover();
	}
	
	
//	private void remover() {
//		servico.remover(5L);
//	}

	private void encontrar() {
		Optional<Pessoa> pessoa = pessoaServico.encontrar(5L);
		if (pessoa.isPresent()) {
			System.out.println("Pessoa encontrada");
			System.out.println(pessoa.get());
		} else {
			System.out.println("Pessoa não encontrada");
		}
	}

	private void buscarTodos() {
		pessoaServico.getList().ifPresent(i -> {
			i.forEach(pessoa -> {
				//System.out.println(pessoa.getEnderecos());
				System.out.println(pessoa.getNome());
			});
		});
//		System.out.println();
	}

	public void salvar() {

//		Pessoa pessoa = new Pessoa("JOAO", LocalDate.of(1995, 8, 24));
//		pessoa.setEmail("joaom.dev@hotmail.com");
//		servico.salvar(pessoa);

	}

}
