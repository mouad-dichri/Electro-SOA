package com.example.facture_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.facture_service.model.Facture;

@Repository
public interface FactureRepository extends JpaRepository<Facture, Long> {

	
}
