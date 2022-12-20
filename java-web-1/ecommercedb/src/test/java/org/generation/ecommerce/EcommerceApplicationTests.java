package org.generation.ecommerce;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.generation.ecommerce.model.Producto;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;



@SpringBootTest
@AutoConfigureMockMvc

class EcommerceApplicationTests {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	@DisplayName("prueba el metodo put para modificar un productos ")
	public void pruebaPUT() throws Exception {
		this.mockMvc.perform(put("/api/productos/16" ).queryParam("precio","81.55"))
				.andDo(print())
		.andExpect(status().isOk( ) )
		.andExpect(content().string(containsString("81.55") ) );
		
		
	}
	
	
	@Test
	@DisplayName("prueba el metodo post para crear un productos ")
	public void pruebaPOST() throws Exception {
	Producto p =new Producto();
	p.setNombre("Cuaderno Profesional Scribe Clásico / Raya / 150 hojas");
	p.setDescripcion("Cuaderno Profesional Scribe Clásico / Raya / 150 hojas");
	p.setURL_imagen("producto_7.jpg");
	p.setPrecio(74.22);
	this.mockMvc.perform(post ("/api/productos/")
			.contentType(MediaType.APPLICATION_JSON)
			.content(asJsonString(p))			
			).andDo(print())
	.andExpect(status().isOk( ) )
	.andExpect(content().string(containsString("producto_7.jpg") ) );

	}
	
	private static String asJsonString(final Object obj) {
	    try {
	      return new ObjectMapper().writeValueAsString(obj);
	    } catch (Exception e) {
	      throw new RuntimeException(e);
	    }//catch
	 } // asJsonString

	
	
	@Test
	@Disabled("se deshabilita temporalmente para nbo borrar registros en cada prueba")
	@DisplayName("prueba el metodo DELETE de productos y su resultado")
	public void pruebaDELETE() throws Exception {
		this.mockMvc.perform(delete ("/api/productos/15")) 
        .andDo(print())
		.andExpect(status().isOk( ) )
.andExpect(content().string(containsString("/ Raya / 150 hojas")));
		
	}
	
	
	@Test 
	@DisplayName("prueba el metodo GET de productos con id:1 t su contenido")
	public void pruebaGet() throws Exception {
		this.mockMvc.perform(get ("/api/productos/1")) 
		        .andDo(print())
				.andExpect(status().isOk( ) )
		.andExpect(content().string(containsString("Norma 580814") ));
	}
}//class