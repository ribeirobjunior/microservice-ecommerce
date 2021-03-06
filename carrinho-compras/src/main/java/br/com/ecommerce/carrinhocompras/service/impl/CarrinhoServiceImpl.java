package br.com.ecommerce.carrinhocompras.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ecommerce.carrinhocompras.model.Carrinho;
import br.com.ecommerce.carrinhocompras.repository.CarrinhoRepository;
import br.com.ecommerce.carrinhocompras.service.CarrinhoService;

@Service
public class CarrinhoServiceImpl implements CarrinhoService {
	
	@Autowired
	private CarrinhoRepository carrinhoRepository;

	@Override
	public Carrinho adicionarAoCarrinho(Carrinho carrinho) {
		return carrinhoRepository.save(carrinho);
	}

	@Override
	public Optional<Carrinho> findById(Long id) {
		return carrinhoRepository.findById(id);
	}

}
