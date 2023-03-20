package it.saracirone.fabula.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import it.saracirone.fabula.entities.Libri;
import it.saracirone.fabula.repositories.LibriRepo;


@Service
public class LibriService {
	@Autowired
	private LibriRepo ur;
	
	public Libri save(Libri u) {
		return ur.save(u);
	}
	
	public Optional<Libri> getById(int id) {
		return ur.findById(id);
	}
	
	public List<Libri> getAll() {
		return ur.findAll();
	}
	
	public Page<Libri> getAll_page(Pageable pageable) {
		return ur.findAll(pageable);
	}
	
	public void delete(Libri u) {
		ur.delete(u);
	}

}
