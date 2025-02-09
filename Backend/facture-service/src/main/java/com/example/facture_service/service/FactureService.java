package com.example.facture_service.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.facture_service.model.Facture;
import com.example.facture_service.repository.FactureRepository;

import jakarta.transaction.Transactional;

@Service
public class FactureService {

	
	private final FactureRepository facturerepository;
	
	public FactureService(FactureRepository facturerepository) {
		
		this.facturerepository=facturerepository;
	}
	
	public Facture addFacture(Facture facture) {
		
		return facturerepository.save(facture);
	}
	
	public List<Facture> getAllFactures(){
		
		return facturerepository.findAll();
	}
	
	public Optional<Facture> getFactureById(Long id) {
		
		return facturerepository.findById(id);
	}
	
	@Transactional
	public void deleteFacture(Long id) {
		
		facturerepository.deleteById(id);
	}
	
	
	@Transactional
	public Facture updateFacture(Long id,Facture factureupdated){
		
		Facture fact=facturerepository.findById(id).orElseThrow(()->new RuntimeException("Aucune facture trouvée"));
		
		fact.setDate_facture(factureupdated.getDate_facture());
		fact.setMontant(factureupdated.getMontant());
		fact.setClient_id(factureupdated.getClient_id());
		fact.setProduitIds(factureupdated.getProduitIds());
		
		return facturerepository.save(fact);
		
		
	}
}
