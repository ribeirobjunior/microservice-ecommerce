package br.com.ecommerce.carrinhocompras.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "tbitem")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "quantidade")
	private Integer quantidade;
	
	@Column(name = "produto")
	private Long produto;
	
	@JoinColumn(name="carrinho",referencedColumnName = "carrinhoid")
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonBackReference
	private Carrinho carrinho;

}
