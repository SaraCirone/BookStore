package it.saracirone.fabula.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import it.saracirone.fabula.entities.Books;
import it.saracirone.fabula.repositories.BooksRepo;

@Service
public class BooksService {

	@Autowired
	private BooksRepo ur;
	
	public Books save(Books u) {
		return ur.save(u);
	}
	
	public Optional<Books> getById(int id) {
		return ur.findById(id);
	}
	
	public List<Books> getAll() {
		return ur.findAll();
	}
	
	public Page<Books> getAll_page(Pageable pageable) {
		return ur.findAll(pageable);
	}
	
	public void delete(Books u) {
		ur.delete(u);
	}
}


