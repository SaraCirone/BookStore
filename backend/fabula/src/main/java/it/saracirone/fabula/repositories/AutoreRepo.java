package it.saracirone.fabula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import it.saracirone.fabula.entities.Autore;

public interface AutoreRepo extends JpaRepository<Autore, Integer> {

}