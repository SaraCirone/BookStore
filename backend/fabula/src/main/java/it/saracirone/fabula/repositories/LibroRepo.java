package it.saracirone.fabula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import it.saracirone.fabula.entities.Libro;

public interface LibroRepo extends JpaRepository<Libro, Integer>{

}


