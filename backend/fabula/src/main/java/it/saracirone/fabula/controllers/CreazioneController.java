package it.saracirone.fabula.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import it.saracirone.fabula.entities.Utente;
import it.saracirone.fabula.entities.Libro;
import it.saracirone.fabula.entities.Ruolo;
import it.saracirone.fabula.services.LibroService;
import it.saracirone.fabula.services.RuoloService;
import it.saracirone.fabula.services.UtenteService;

@RestController
public class CreazioneController {

	@Autowired
	private LibroService libriService; 
	
	
	@Autowired
	private UtenteService utenteService; 
	

	@Autowired
	private RuoloService ruoloService; 
	
	
	
	@PostMapping("/creautente")
	public ResponseEntity<Utente> creautente(@RequestBody Utente request) {
		return ResponseEntity.ok(utenteService.save(request));
	}
	
	@PostMapping("/crealibri")
	public ResponseEntity<Libro> crealibri(@RequestBody Libro request) {
		return ResponseEntity.ok(libriService.save(request));
	}
	
	
}
