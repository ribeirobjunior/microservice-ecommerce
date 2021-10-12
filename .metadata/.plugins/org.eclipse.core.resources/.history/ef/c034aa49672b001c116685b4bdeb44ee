package br.com.ecommerce.catalogoprodutos.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ecommerce.catalogoprodutos.model.Produto;
import br.com.ecommerce.catalogoprodutos.repository.ProdutoRepository;
import br.com.ecommerce.catalogoprodutos.service.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Override
	public Produto salvarProduto(Produto produto) {
		return produtoRepository.save(produto);
	}

	@Override
	public Optional<Produto> findById(Long id) {
		return produtoRepository.findById(id);
	}
	

}
