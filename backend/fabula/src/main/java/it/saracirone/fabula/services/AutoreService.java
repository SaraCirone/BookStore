package it.saracirone.fabula.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.saracirone.fabula.entities.Autore;
import it.saracirone.fabula.repositories.AutoreRepo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
@Service

public class AutoreService {

	@Autowired
	private AutoreRepo as; 
	
	public Autore save(Autore u) {
		return as.save(u);
	}
	
	public Optional<Autore> getById(int id) {
		return as.findById(id);
	}
	
	public List<Autore> getAll(){
		return as.findAll();
	}
	public Page<Autore> getAll_page(Pageable pageable) {
		return as.findAll(pageable);
	}
	public void delete(Autore u) {
		as.delete(u);
	}
}
