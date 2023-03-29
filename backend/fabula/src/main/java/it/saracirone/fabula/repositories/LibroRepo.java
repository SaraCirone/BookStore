package it.saracirone.fabula.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import it.saracirone.fabula.entities.Libro;


@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "libri", path="libri")
@Repository
public interface LibroRepo extends JpaRepository<Libro, Integer>{
	 List<Libro> findByTitoloContaining(String titolo);
	 
	@Query(value = "SELECT id, autore FROM Libro")
	 List<Libro> findAllAutore();

  }


