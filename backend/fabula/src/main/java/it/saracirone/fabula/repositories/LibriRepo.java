package it.saracirone.fabula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import it.saracirone.fabula.entities.Libri;

public interface LibriRepo  extends JpaRepository<Libri, Integer> {

}
