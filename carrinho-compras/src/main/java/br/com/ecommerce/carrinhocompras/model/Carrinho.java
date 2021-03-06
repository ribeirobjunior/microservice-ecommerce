package br.com.ecommerce.carrinhocompras.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "tbcarrinhodecompras")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Carrinho {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "carrinhoid")
	private Long id;
	
	@OneToMany(mappedBy = "carrinho",cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonManagedReference
	private List<Item> itens;
	
	public List<Item> getItens(){
		if(itens == null) {
			itens = new ArrayList<Item>();
		}
		return itens;
	}
}
