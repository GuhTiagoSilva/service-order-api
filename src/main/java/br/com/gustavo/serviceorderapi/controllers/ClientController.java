package br.com.gustavo.serviceorderapi.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.gustavo.serviceorderapi.domain.model.Client;

@RestController
public class ClientController {
	
	@RequestMapping(value="/clients",method = RequestMethod.GET)
	public List<Client> listar() {
		
		Client client = new Client();
		client.setId(1L);
		client.setName("Gustavo Tiago");
		client.setEmail("gustavo@gmail.com");
		client.setPhone("957821-8899");
		
		Client client2 = new Client();
		client2.setId(2L);
		client2.setName("Paulo da Silva");
		client2.setEmail("paulo@gmail.com");
		client2.setPhone("955321-8899");
		
		List<Client>clientList = new ArrayList<Client>();
		clientList.add(client);
		clientList.add(client2);
		
		return clientList;
		
	}
	
}
