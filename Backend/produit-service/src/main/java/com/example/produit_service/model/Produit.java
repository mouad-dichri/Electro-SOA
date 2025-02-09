package com.example.produit_service.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity


public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private double prix;
    public Produit(Long id, String nom, double prix) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
    }
   

        public Produit() {}

     

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public double getPrix() {
            return prix;
        }

        public void setPrix(double prix) {
            this.prix = prix;
        }
    }


