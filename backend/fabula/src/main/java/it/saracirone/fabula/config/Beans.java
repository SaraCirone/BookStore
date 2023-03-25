package it.saracirone.fabula.config;

import java.util.Date;
import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import it.saracirone.fabula.entities.Admin;
import it.saracirone.fabula.entities.Autore;
import it.saracirone.fabula.entities.Books;
import it.saracirone.fabula.entities.Genere;
import it.saracirone.fabula.entities.Ruolo;
import it.saracirone.fabula.entities.TipoRuolo;
import it.saracirone.fabula.entities.Utente;



@Configuration

public class Beans {
	
	@Bean
	@Scope("prototype")
	Utente utente(TipoRuolo tipoRuolo, String userNick, String email, String password, String nome, String cognome) {
		return Utente.builder()
		.tipoRuolo(TipoRuolo.ROLE_USER)
		.userNick(userNick)
		.email(email)
		.password(password)
		.nome(nome)
		.cognome(cognome)
		.attivo(true)
		.build();
		
	}
	
	@Bean
    @Scope("prototype")
    Ruolo ruolo(TipoRuolo tr, String nomeRuolo) {
	return Ruolo.builder()
			.tipoRuolo(tr)
			.nomeRuolo(nomeRuolo)
			.build();
}
	
	
	@Bean
	@Scope("prototype")
	Admin admin(TipoRuolo tipoRuolo, String adminNick, String email, String password, String nome, String cognome) {
		return Admin.builder()
		.tipoRuolo(TipoRuolo.ROLE_USER)
		.adminNick(adminNick)
		.email(email)
		.password(password)
		.nome(nome)
		.cognome(cognome)
		.attivo(true)
		.build();
		
	}
	
	
	@Bean
	@Scope("prototype")
	Books book(String titolo, String descrizione, Double prezzo, String imgUrl, int unita, Date dataCreazione, Genere genere, Autore autore) {
		return Books.builder()
				.titolo(titolo)
				.descrizione(descrizione)
				.prezzo(prezzo)
				.imgUrl(imgUrl)
				.dataCreazione(dataCreazione)
				.genere(genere)
				.autore(autore)
				.build();

			
	}
	

	
	@Bean
	@Scope("prototype")
	Autore autore(TipoRuolo tipoRuolo, String autoreNick, String email, String password, String nome, String cognome) {
		return Autore.builder()
		.tipoRuolo(TipoRuolo.ROLE_AUTHOR)
		.autoreNick(autoreNick)
		.email(email)
		.password(password)
		.nome(nome)
		.cognome(cognome)
		.attivo(true)
		.build();
		
	}
	

	
	
	
 /*
    @Bean
    @Scope("prototype")
    Utente utente(String username, String password, String email, String nome, String cognome) {
		return Utente.builder()
		.username(username) 
		.email(email)
		.nome(nome)
		.cognome(cognome)
		.password(password)
		.attivo(true)
		.build();
		
	}

    @Bean
    @Scope("prototype")
    Libri libro(String titolo, int numeroPag, String descrizione, String imgUrl, Double prezzo, boolean disp, Utente autore) {
		return Libri.builder()
		.titolo(titolo)
		.numeroPag(numeroPag)
		.descrizione(descrizione)
		.imgUrl(imgUrl)
		.prezzo(prezzo)
		.disp(disp)
		.autore(autore)
		.build();
	}


    @Bean
    @Scope("prototype")
    Ruolo ruolo(TipoRuolo tr, String nomeRuolo) {
	return Ruolo.builder()
			.tipoRuolo(tr)
			.nomeRuolo(nomeRuolo)
			.build();
}
	*/

}
