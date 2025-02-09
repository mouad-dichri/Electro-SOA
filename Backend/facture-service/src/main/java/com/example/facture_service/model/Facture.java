package com.example.facture_service.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.*;


@Entity
public class Facture {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String date_facture;
	private Double montant;
	
	private Long client_id;
	
	private List<Long> produitIds;

	public Facture(Long id, String date_facture, Double montant, Long client_id, List<Long> produitIds) {
		
		this.id = id;
		this.date_facture = date_facture;
		this.montant = montant;
		this.client_id = client_id;
		this.produitIds = produitIds;
	}

	public Facture() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDate_facture() {
		return date_facture;
	}

	public void setDate_facture(String date_facture) {
		this.date_facture = date_facture;
	}

	public Double getMontant() {
		return montant;
	}

	public void setMontant(Double montant) {
		this.montant = montant;
	}

	public Long getClient_id() {
		return client_id;
	}

	public void setClient_id(Long client_id) {
		this.client_id = client_id;
	}

	public List<Long> getProduitIds() {
		return produitIds;
	}

	public void setProduitIds(List<Long> produitIds) {
		this.produitIds = produitIds;
	}
	
	
	
}
