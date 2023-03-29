package it.saracirone.fabula.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import it.saracirone.fabula.entities.Libro;
import it.saracirone.fabula.repositories.LibroRepo;

@Service
public class LibroService {

	@Autowired
	private LibroRepo ur;
	
	public Libro save(Libro u) {
		return ur.save(u);
	}
	
	public Optional<Libro> getById(int id) {
		return ur.findById(id);
	}
	
	public List<Libro> getAll() {
		return ur.findAll();
	}
	
	public Page<Libro> getAll_page(Pageable pageable) {
		return ur.findAll(pageable);
	}
	
	public void delete(Libro u) {
		ur.delete(u);
	}

	public Optional<Libro> findById(Integer id) {
	    return ur.findById(id);  
	}
	
		
	public void deleteById(Integer id) {
	    Optional<Libro> libro = ur.findById(id);
	    if (libro.isPresent()) {
	        ur.delete(libro.get());
	    } else {
	        // Il libro non esiste
	        throw new RuntimeException("Libro non trovato");
	    }
	}

	public List<Libro> findByTitoloContaining(String titolo) {
		return ur.findByTitoloContaining(titolo);
	}

	
	public List<Libro> getAllAutore() {
		return ur.findAllAutore();
	}
	
}


