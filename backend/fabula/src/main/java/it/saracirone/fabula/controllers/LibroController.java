package it.saracirone.fabula.controllers;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnore;

import it.saracirone.fabula.entities.Libro;
import it.saracirone.fabula.services.LibroService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/libri")
public class LibroController {
	

	private static final Logger logger = LoggerFactory.getLogger(LibroController.class);
	
	@Autowired
	private LibroService libroService;
	
	//METODO PER RICERCA ID
	
	@GetMapping(value = "/cerca/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Libro> listLibroById(@PathVariable("id") Integer id) {
	    logger.info("***** Libro con ID Code " + id + " *****");
	    Optional<Libro> libro = libroService.findById(id);
	    if (libro.isPresent()) {
	        return ResponseEntity.ok(libro.get());
	    } else {
	        return ResponseEntity.notFound().build();
	    }
	}
	
	@GetMapping(value = "/ricercaTitolo/{titolo}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Libro>> listLibroByTitolo(@PathVariable("titolo") String titolo) {
	    logger.info("***** Ricerca libro con titolo che contiene " + titolo + " *****");
	    List<Libro> libri = libroService.findByTitoloContaining(titolo);
	    if (!libri.isEmpty()) {
	        return ResponseEntity.ok(libri);
	    } else {
	        return ResponseEntity.notFound().build();
	    }
	}
	
    @GetMapping("/catalogo")
    public ResponseEntity<List<Libro>> getAll() {
        List<Libro> disp = libroService.getAll();

        if( disp.isEmpty() ) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
       
        return new ResponseEntity<>(disp, HttpStatus.OK);
    }
    
   /* @GetMapping(value = "/autore", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Libro>> getAutore() {
        List<Libro> disp = libroService.getAll();

        if( disp.isEmpty() ) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(disp, HttpStatus.OK);
    }
*/
//metodo ricerca per id e per titolo funzionante (27/03)
    

}
