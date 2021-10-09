package br.com.ecommerce.carrinhocompras.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("br.com.ecommerce.carrinhocompras.controller"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(buildingApiInfo());
	}

	private ApiInfo buildingApiInfo() {
		return new ApiInfoBuilder()
				.title("Carrinho de compras")
				.description("API para inserção e consulta de itens no carrinho de compras")
				.version("1.0.0-SNAPSHOT")
				.build();
				
	}
	
}
