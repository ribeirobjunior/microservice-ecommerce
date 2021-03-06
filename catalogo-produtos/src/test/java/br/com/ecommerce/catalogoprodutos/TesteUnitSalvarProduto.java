package br.com.ecommerce.catalogoprodutos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.ecommerce.catalogoprodutos.model.Produto;

@WebMvcTest
@ExtendWith(SpringExtension.class )
public class TesteUnitSalvarProduto {
	
	@Autowired
	private MockMvc mvc;
	
	@Test
	public void testUnit() throws Exception {
		Produto produtoParaSalvar = new Produto("PS5", 4.600);
		
		MvcResult resultado =  mvc.perform(MockMvcRequestBuilders.post("/salvar")
			.content(asJsonString(produtoParaSalvar))
			.contentType(MediaType.APPLICATION_JSON)
			.accept(MediaType.APPLICATION_JSON)).andReturn();
		
		assertEquals(asJsonString(produtoParaSalvar), resultado.getResponse().getContentAsString());
	
	}
	
	public static String asJsonString(final Object obj) {
	    try {
	        final ObjectMapper mapper = new ObjectMapper();
	        final String jsonContent = mapper.writeValueAsString(obj);
	        return jsonContent;
	    } catch (Exception e) {
	        throw new RuntimeException(e);
	    }
	}  

}
