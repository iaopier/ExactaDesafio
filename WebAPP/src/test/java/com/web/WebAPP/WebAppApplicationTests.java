package com.web.WebAPP;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


@RunWith(SpringRunner.class)
@SpringBootTest
public class WebAppApplicationTests {

	@Autowired
	private WebApplicationContext webApplicationContext;

	@Test
	public void contextLoads() {
	}
	
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}
	
	@Test
	public void testIndex() throws Exception {
		mockMvc.perform(get("/")).andExpect(status().isOk());
	}
	
	@Test
	public void testCadastrar() throws Exception {
		mockMvc.perform(get("/cadastrar")).andExpect(status().isOk());
	}

	@Test
	public void testGastos() throws Exception {
		mockMvc.perform(get("/gastos")).andExpect(status().isOk());
	}
	
	
	@Test
	public void testGastosId() throws Exception {
		mockMvc.perform(get("/gastos").param("id", "1")).andExpect(status().isOk());
	}
}
