package br.fpu.lista.de.compras.service;

import javax.annotation.PostConstruct;

import br.fpu.lista.de.compras.model.Produto;
import br.fpu.lista.de.compras.model.Unidade;
import br.fpu.lista.de.compras.repository.ProdutoRepository;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ApiService {
	final static Logger logger = Logger.getLogger(ApiService.class);

	@Autowired
	private ProdutoRepository produtoRepository;

	public void addProduto(String codigo, String nome, Double quantidade, Unidade unidade, Double preco) {
		Produto produto = new Produto().setCodigo(codigo).setNome(nome)
				.setQuantidade(quantidade).setUnidade(unidade).setPreco(preco);
		produtoRepository.save(produto);
	}

	@PostConstruct
	public void init() {
		logger.info("ApiService.init()");
		addProduto("1", "Leite", 1.0, Unidade.LITROS, 2.79);
		addProduto("2", "Suco de Laranja", 1.0, Unidade.LITROS, 3.99);
		addProduto("3", "Cerveja", 0.6, Unidade.LITROS, 4.49);
		addProduto("4", "Arroz", 5.0, Unidade.QUILOS, 10.99);
		addProduto("5", "Feijão", 1.0, Unidade.QUILOS, 2.79);
		addProduto("6", "Carne Bovina Alcatra", 1.0, Unidade.QUILOS, 22.29);
		addProduto("7", "Carne Suina Pernil", 1.0, Unidade.QUILOS, 12.79);
	}
}
