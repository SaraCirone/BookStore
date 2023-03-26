package it.saracirone.fabula.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.saracirone.fabula.entities.Genere;
import it.saracirone.fabula.repositories.GenereRepo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
@Service

public class GenereService {
	
	@Autowired
	private GenereRepo gr;
	
	public Genere save(Genere u) {
		return gr.save(u);
	}
	
	public Optional<Genere> getById(int id) {
		return gr.findById(id);
	}
	
	public List<Genere> getAll() {
		return gr.findAll();
	}
	
	public Page<Genere> getAll_page(Pageable pageable) {
		return gr.findAll(pageable);
	}
	
	public void delete(Genere u) {
		gr.delete(u);
	}

}
