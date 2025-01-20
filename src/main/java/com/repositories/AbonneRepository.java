package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entities.Abonne;

@Repository
public interface AbonneRepository extends JpaRepository<Abonne, Long>{

}
