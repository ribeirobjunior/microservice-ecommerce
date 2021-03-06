package br.com.ecommerce.carrinhocompras;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CarrinhoComprasApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarrinhoComprasApplication.class, args);
	}

}
