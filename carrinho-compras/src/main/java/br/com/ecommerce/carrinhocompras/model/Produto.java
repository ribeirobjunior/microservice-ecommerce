package br.com.ecommerce.carrinhocompras.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produto {
	
	private Long id;
	private String nome;
	private Double preco;

}
