package com.example.produit_service.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.produit_service.model.Produit;
import com.example.produit_service.service.ProduitService;


@RestController
@RequestMapping("/produits")
public class ProduitController {

    private final ProduitService produitService;

    public ProduitController(ProduitService produitService) {
        this.produitService = produitService;
    }

    @PostMapping("/addProduct")
    public Produit addProduit(@RequestBody Produit produit) {
    	
    	return produitService.addProduit(produit);
    }
    
    @GetMapping("/show/{id}")
 public ResponseEntity<Produit> getProduit(@PathVariable Long id) {
    	
    	return ResponseEntity.of(produitService.getProduit(id));
    }
    
    
    
    @GetMapping("/showAll")
    public List<Produit> getAllProduits() {
        return produitService.getAllProduits();
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<Produit> updateProduit(@PathVariable Long id,@RequestBody Produit produit){
    	
    	return ResponseEntity.ok(produitService.updateProduit(id, produit));
    }

    @DeleteMapping("/delete/{id}")
    
    public void deleteProduit(@PathVariable Long id) {
    	
    	produitService.deleteProduit(id);
    }

}
