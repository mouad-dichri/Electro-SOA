package com.example.produit_service.repository;

import com.example.produit_service.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProduitRepository extends JpaRepository<Produit, Long>{

}
