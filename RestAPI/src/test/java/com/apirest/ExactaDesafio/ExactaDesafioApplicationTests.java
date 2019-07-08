package com.apirest.ExactaDesafio;

import com.apirest.ExactaDesafio.models.Gasto;
import com.apirest.ExactaDesafio.services.GastoService;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.net.URI;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.WebApplicationContext;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExactaDesafioApplicationTests {

	@Autowired
	private WebApplicationContext webApplicationContext;

	@Test
	public void contextLoads() {
	}

	@Mock
	private GastoService gastoService;

	private MockMvc mockMvc;

	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void testGet() throws Exception {
		mockMvc.perform(get("http://localhost:8080/api/v1/gastos")).andExpect(status().isOk());
	}

	@Test
	public void testPost() throws Exception {

		Gasto mockGasto = new Gasto();
		String input = "2018-07-22T14:00:00-03:00";
		OffsetDateTime offsetDateTime = OffsetDateTime.parse(input, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
		mockGasto.setDataHora(offsetDateTime);
		mockGasto.setDescricao("Descricao gasto");
		mockGasto.setNomePessoa("Piercarlo Soares");
		mockGasto.setTags("Tag1 Tag2 Tag3 Tag4");
		RestTemplate restTemplate = new RestTemplate();

		final String baseUrl = "http://localhost:8080/api/v1/gastos";
		URI uri = new URI(baseUrl);

		Gasto gasto = mockGasto;

		ResponseEntity<String> result = restTemplate.postForEntity(uri, gasto, String.class);

		Assert.assertEquals(201, result.getStatusCodeValue());
	}

	@Test
	public void testGetAfterPost() throws Exception {
		mockMvc.perform(get("http://localhost:8080/api/v1/gastos")).andExpect(status().isOk())
				.andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8));
	}

	@Test
	public void testGetId() throws Exception {
		mockMvc.perform(get("http://localhost:8080/api/v1/gastos/").param("id", "1"))
				.andExpect(status().isOk()).andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8));
	}

}
