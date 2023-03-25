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
	private AutoreRepo ar;
	
	public Autore save(Autore u) {
		return ar.save(u);
	}
	
	public Optional<Autore> getById(int id) {
		return ar.findById(id);
	}
	
	public List<Autore> getAll() {
		return ar.findAll();
	}
	
	public Page<Autore> getAll_page(Pageable pageable) {
		return ar.findAll(pageable);
	}
	
	public void delete(Autore u) {
		ar.delete(u);
	}
}
