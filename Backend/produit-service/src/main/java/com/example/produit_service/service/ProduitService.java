package com.example.produit_service.service;




import com.example.produit_service.model.Produit;

import com.example.produit_service.repository.ProduitRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.annotation.*;
import java.util.List;
import java.util.Optional;

@Service
public class ProduitService {
    private final ProduitRepository produitRepository;

    public ProduitService(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }



    public Produit addProduit(Produit prod) {
    	
    	return produitRepository.save(prod);
    }

    public List<Produit> getAllProduits() {
        return produitRepository.findAll();
    }
    
    public Optional<Produit> getProduit(Long id) {
    	
    	return produitRepository.findById(id);
    }
    
    public Produit updateProduit(Long id,Produit produpdated){
    	
    	
    	Produit prod=produitRepository.findById(id).
    			orElseThrow(()->new RuntimeException("Produit inexistant"));
    	
    	prod.setNom(produpdated.getNom());
		prod.setPrix(produpdated.getPrix());
		return produitRepository.save(prod);
    }
    
    public void deleteProduit(Long id) {
    	
    	produitRepository.deleteById(id);
    }
}
