package com.algaworks.algalog.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Cliente;


@RestController
public class ClienteController {
	
	
	@GetMapping("/clientes")
	public List<Cliente> Listar() {
		
		Cliente cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Marco");
		cliente1.setTelefone("84996159775");
		cliente1.setEmail("marcoaureliotomaz@gmail.com");
		
		Cliente cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Aurelio");
		cliente2.setTelefone("84988887777");
		cliente2.setEmail("aurelio@gmail.com");
		
		return Arrays.asList(cliente1, cliente2);
	}
}
