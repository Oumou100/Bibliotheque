package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.Categorie;
import com.entities.DetailsCle;
import com.entities.Emprunt;

public interface EmpruntRepository extends JpaRepository<Emprunt,DetailsCle>{

}
