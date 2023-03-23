package it.ecommerce.fabula;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest()
@ContextConfiguration(classes = FabulaApplication.class)
public class TestControlli {
	
	private MockMvc mvc; 
	
	@Autowired
	private WebApplicationContext wac; 
	
	@BeforeEach
	public void setup() {
		mvc = MockMvcBuilders
				.webAppContextSetup(wac)
				.build(); 
	}
	
	@Test
	public void testGetTest() throws Exception {
		mvc.perform(get("/api/test")
		.contentType(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk())
		.andExpect(jsonPath("$")
		.value("Saluti, sono un componente di test"))
		.andDo(print());
	}

	@Test
	public void testGetTest2() throws Exception {
		mvc.perform(get("/api/test/Sara")
		.contentType(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk())
		.andExpect(jsonPath("$")
		.value("Saluti, Sara sono un componente di test"))
		.andDo(print());
	}
}
