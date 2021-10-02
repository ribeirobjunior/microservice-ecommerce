package br.com.ecommerce.catalogoprodutos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ecommerce.catalogoprodutos.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
