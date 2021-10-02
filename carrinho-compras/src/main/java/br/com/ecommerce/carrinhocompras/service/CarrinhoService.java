package br.com.ecommerce.carrinhocompras.service;

import java.util.Optional;

import br.com.ecommerce.carrinhocompras.model.Carrinho;

public interface CarrinhoService {

	Carrinho adicionarAoCarrinho(Carrinho carrinho);
	
	Optional<Carrinho> findById(Long id);
}
