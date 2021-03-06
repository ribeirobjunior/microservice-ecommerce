package br.com.ecommerce.catalogoprodutos.config;

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
				.apis(RequestHandlerSelectors.basePackage("br.com.ecommerce.catalogoprodutos.controller"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(buildingApiInfo());
	}

	private ApiInfo buildingApiInfo() {
		return new ApiInfoBuilder()
				.title("Controle de produtos")
				.description("API para cadastro e consulta de produtos")
				.version("1.0.0-SNAPSHOT")
				.build();
				
	}
	
}
