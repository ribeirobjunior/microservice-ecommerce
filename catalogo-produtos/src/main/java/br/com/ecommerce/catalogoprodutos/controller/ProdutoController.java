package br.com.ecommerce.catalogoprodutos.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import br.com.ecommerce.catalogoprodutos.model.Produto;
import br.com.ecommerce.catalogoprodutos.service.ProdutoService;

@RestController
public class ProdutoController {
	
	@Autowired
	private ProdutoService produtoService;
	
	@PostMapping("/salvar")
	public Produto salvar(@RequestPart(name = "produto", required = true) Produto produto) {
		return produtoService.salvarProduto(produto);
	}
	
	@GetMapping("/buscar/{id}")
	public Optional<Produto> findById(@PathVariable("id") Long id) {
		return produtoService.findById(id);
	}
	
	
	@GetMapping
	public List<Produto> findAll(){
		return produtoService.findAll();
	}
}
