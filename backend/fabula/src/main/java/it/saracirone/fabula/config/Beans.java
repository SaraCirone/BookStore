package it.saracirone.fabula.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.Builder;

import it.saracirone.fabula.entities.Autore;
import it.saracirone.fabula.entities.Categorie;
import it.saracirone.fabula.entities.Libri;
import it.saracirone.fabula.entities.Ruolo;
import it.saracirone.fabula.entities.TipoRuolo;
import it.saracirone.fabula.entities.Utente;


@Configuration

public class Beans {
	
	@Bean
	@Scope("prototype")
	public Utente utente(String nome, String cognome, String username, String password, String email) {
		return Utente.builder()
		.nome(nome)
		.cognome(cognome)
		.username(username) 
		.password(password)
		.email(email)
		.attivo(true)
		.build();
		
	}
	
	@Bean
	@Scope("prototype")
	public Libri libro(String titolo, int numeroPag, Categorie categorie, String sinossi, String imgUrl, Double prezzo, boolean disp) {
		return Libri.builder()
		.titolo(titolo)
		.numeroPag(numeroPag)
		.categorie(categorie)
		.sinossi(sinossi)
		.imgUrl(imgUrl)
		.prezzo(prezzo)
		.disp(disp)
		.build();
	}


	
@Bean
@Scope("prototype")
public Ruolo ruolo(TipoRuolo tr) {
	return Ruolo.builder()
			.tipoRuolo(tr)
			.build();
}
	

}
