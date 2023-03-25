package it.saracirone.fabula.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.saracirone.fabula.entities.Admin;
import it.saracirone.fabula.repositories.AdminRepo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


@Service
public class AdminService {
	@Autowired
	private AdminRepo adr;
	
	public Admin save(Admin u) {
		return adr.save(u);
	}
	
	public Optional<Admin> getById(int id) {
		return adr.findById(id);
	}
	
	public List<Admin> getAll() {
		return adr.findAll();
	}
	
	public Page<Admin> getAll_page(Pageable pageable) {
		return adr.findAll(pageable);
	}
	
	public void delete(Admin u) {
		adr.delete(u);
	}
}
