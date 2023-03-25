package it.saracirone.fabula.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import it.saracirone.fabula.entities.Utente;
import it.saracirone.fabula.entities.Books;
import it.saracirone.fabula.entities.Ruolo;
import it.saracirone.fabula.services.BooksService;
import it.saracirone.fabula.services.RuoloService;
import it.saracirone.fabula.services.UtenteService;

@RestController
public class CreazioneController {

	@Autowired
	private BooksService libriService; 
	
	
	@Autowired
	private UtenteService utenteService; 
	

	@Autowired
	private RuoloService ruoloService; 
	
	
	
	@PostMapping("/creautente")
	public ResponseEntity<Utente> creautente(@RequestBody Utente request) {
		return ResponseEntity.ok(utenteService.save(request));
	}
	
	@PostMapping("/crealibri")
	public ResponseEntity<Books> crealibri(@RequestBody Books request) {
		return ResponseEntity.ok(libriService.save(request));
	}
	
	
}
