package br.com.ecommerce.carrinhocompras.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import br.com.ecommerce.carrinhocompras.model.Carrinho;
import br.com.ecommerce.carrinhocompras.model.Item;
import br.com.ecommerce.carrinhocompras.model.Produto;
import br.com.ecommerce.carrinhocompras.service.CarrinhoService;
import br.com.ecommerce.carrinhocompras.service.ConsumirAPiProduto;

@RestController
public class CarrinhoController {

	@Autowired
	private CarrinhoService carrinhoService;
	
	@Autowired
	private ConsumirAPiProduto consumirAPiProduto;
	
	@PostMapping("/adicionaraocarrinho/{id}")
	public Carrinho adicionarAoCarrinho(@PathVariable("id") Long carrinhoId, @RequestPart(name = "item", required = true) Item item) {
		Optional<Carrinho> carrinho = carrinhoService.findById(carrinhoId);
		Carrinho carrinhoParaCarregar;
		if(carrinho.equals(Optional.empty())) {
			carrinhoParaCarregar = new Carrinho();
		}else {
			carrinhoParaCarregar = carrinho.get();
		}
		item.setCarrinho(carrinhoParaCarregar);
		carrinhoParaCarregar.getItens().add(item);
		return carrinhoService.adicionarAoCarrinho(carrinhoParaCarregar);
	}
	
	@GetMapping("/buscar/{id}")
	public Optional<Carrinho> findById(@PathVariable("id") Long id){
		return carrinhoService.findById(id);
	}
	
	
	@GetMapping("/listarprodutos")
	public List<Produto> buscarProduto(){
		return consumirAPiProduto.retornaProdutos();
	}
	
}
