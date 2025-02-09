package com.example.facture_service.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.facture_service.model.Facture;
import com.example.facture_service.service.FactureService;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/factures")
public class FactureController {

	private final FactureService factureservice;
	
	
	public FactureController(FactureService factureservice) {
		
		this.factureservice=factureservice;
	}
	
	@PostMapping("/add")
	public Facture addFacture(@RequestBody Facture facture) {
		return factureservice.addFacture(facture);
	}
	
	@GetMapping("/getAll")
	public List<Facture> getAllFactures(){
		
		return factureservice.getAllFactures();
	}
	
	
	@GetMapping("/getFacture/{id}")
	public  ResponseEntity<Facture>  getFactureById(@PathVariable Long id) {
		
		return ResponseEntity.of(factureservice.getFactureById(id));
	}
	@DeleteMapping("/delete/{id}")
	public void deleteFacture(@PathVariable Long id) {
		factureservice.deleteFacture(id);
	}
	
	@PutMapping("update/{id}")
	
	public ResponseEntity<Facture> updateFacture(@PathVariable Long id,@RequestBody Facture facture){
		
		return ResponseEntity.ok(factureservice.updateFacture(id, facture));
	}

	
}
