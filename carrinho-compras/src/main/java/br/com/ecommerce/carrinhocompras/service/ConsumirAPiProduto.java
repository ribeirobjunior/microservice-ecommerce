package br.com.ecommerce.carrinhocompras.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.ecommerce.carrinhocompras.model.Produto;

@FeignClient(name="produto", url = "http://localhost:8080/produto/")
public interface ConsumirAPiProduto {
	
	@RequestMapping(method= RequestMethod.GET, value = "/")
	List<Produto> retornaProdutos();

}
