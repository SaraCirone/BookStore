package it.saracirone.fabula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import it.saracirone.fabula.entities.Utente;


@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "utenti", path="utenti")
public interface UtenteRepo extends JpaRepository<Utente, Integer> {

}
