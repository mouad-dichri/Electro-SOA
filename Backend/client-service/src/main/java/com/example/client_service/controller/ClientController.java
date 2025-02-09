package com.example.client_service.controller;


import com.example.client_service.model.Client;
import com.example.client_service.repository.ClientRepository;
import com.example.client_service.service.*;

import jakarta.websocket.server.PathParam;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@RequestMapping("/clients")
public class ClientController {
	
	private final ClientService clientService;
	
	public ClientController(ClientService clientService) {
		
		this.clientService=clientService;
	}

	@PostMapping("/addClient")
	public Client addClient(@RequestBody Client client) {
		
		 return clientService.addClient(client);
	}
	
	
	
	
	
	@GetMapping("/allClients")
	public List<Client> getallClient(){
		
		return clientService.getallClient();
	}
	
	
	@GetMapping("/getClient/{id}")
	public ResponseEntity<Client> getClient(@PathVariable Long id) {
		return ResponseEntity.of(clientService.getClient(id));
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Client>  updateClient(@PathVariable Long id,@RequestBody Client client) {
		
		return ResponseEntity.ok(clientService.updateClient(id, client));
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteClient(@PathVariable Long id) {
		clientService.deleteClient(id);
	}
}
