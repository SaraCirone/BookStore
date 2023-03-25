package it.saracirone.fabula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.saracirone.fabula.entities.Utente;
@Repository

public interface UtenteRepo extends JpaRepository<Utente, Integer> {

}
