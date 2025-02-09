package com.example.client_service.service;
import com.example.client_service.model.Client;
import com.example.client_service.repository.ClientRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.annotation.*;
import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
	
	private final ClientRepository clientRepository;
	
	public ClientService(ClientRepository clientRepository) {
		
		this.clientRepository=clientRepository;
	}
	
	
	
	public Client addClient(Client client) {
		
		return clientRepository.save(client);
	}
	
	public List<Client> getallClient(){
		
		return clientRepository.findAll();
	}

	public Optional<Client> getClient(Long id) {
		
		return clientRepository.findById(id);
	}
	
	public Client updateClient(Long id,Client clientupdated) {
		
		Client anclient=clientRepository.findById(id).orElseThrow(()->
		new RuntimeException("Client invalide"));
		
		anclient.setNom(clientupdated.getNom());
		anclient.setPrenom(clientupdated.getPrenom());
		anclient.setAdresse(clientupdated.getAdresse());
		anclient.setTel(clientupdated.getTel());
		anclient.setVille(clientupdated.getVille());
		
		return clientRepository.save(anclient);
	}

	public void deleteClient(Long id) {
		
		clientRepository.deleteById(id);
	}
}
