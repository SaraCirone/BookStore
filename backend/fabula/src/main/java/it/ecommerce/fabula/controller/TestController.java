package it.ecommerce.fabula.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

	@GetMapping()
public String getSaluti() {
	return "Saluti, sono un componente di test";
	}
	
	@GetMapping(value ="/{nome}")
public String getSaluti2(@PathVariable("nome") String Nome) {
		
	String message = String.format("Saluti, %s sono un componente di test", Nome); 
		
	return message;
	}
	
	
}
