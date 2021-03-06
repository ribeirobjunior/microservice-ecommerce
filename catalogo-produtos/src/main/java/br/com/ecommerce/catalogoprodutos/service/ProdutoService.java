package br.com.ecommerce.catalogoprodutos.service;

import java.util.List;
import java.util.Optional;

import br.com.ecommerce.catalogoprodutos.model.Produto;

public interface ProdutoService {
	
	Produto salvarProduto(Produto produto);
	
	Optional<Produto> findById(Long id);
	
	List<Produto> findAll();

}
