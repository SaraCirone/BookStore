

package it.saracirone.fabula.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import it.saracirone.fabula.entities.Autore;
import it.saracirone.fabula.entities.Genere;
import it.saracirone.fabula.entities.TipoGenere;
import it.saracirone.fabula.entities.TipoGenere;
import it.saracirone.fabula.entities.Libro;
import it.saracirone.fabula.entities.Ruolo;
import it.saracirone.fabula.entities.TipoRuolo;
import it.saracirone.fabula.entities.Utente;

@Configuration
public class Beans {

	//tipo Ruolo
	@Bean
    @Scope("prototype")
    public Ruolo ruolo(TipoRuolo tr, String nomeRuolo) {
	return Ruolo.builder()
			.tipoRuolo(tr)
			.nomeRuolo(nomeRuolo)
			.build();
	
}
	//Genere 
	@Bean
    @Scope("prototype")
	public Genere genere(TipoGenere gr, String nomeGenere) {
		return Genere.builder()
				.tipoGenere(gr)
				.nomeGenere(nomeGenere)
				.build();	
	}
	
	//Autore
	
	@Bean
	@Scope("prototype")
	public Autore autore(String nome, String cognome, String autoreNick, String email, String password, Ruolo tipoRuolo) {
		return Autore.builder()
				.nome(nome) 
				.cognome(cognome)
				.autoreNick(autoreNick)
				.email(email)
				.password(password)
				.ruolo(tipoRuolo)
				.build();
	}
	
	
	//Libro
	@Bean
	@Scope("prototype")
	public Libro libro(String titolo, String descrizione, Double prezzo, String imgUrl, int pezzi, Genere tipoGenere , Autore autore) {
		return Libro.builder()
				.titolo(titolo)
				.descrizione(descrizione)
				.prezzo(prezzo)
				.imgUrl(imgUrl)
				.pezzi(pezzi)
				.genere(tipoGenere)
				.autore(autore)
				.build();
	}
	
	//Utente
	
	@Bean
	@Scope("prototype")
	public Utente utente(String nome, String cognome, String userNick, String email, String password, Ruolo tipoRuolo) {
		return Utente.builder()
				.nome(nome) 
				.cognome(cognome)
				.userNick(userNick)
				.email(email)
				.password(password)
				.ruolo(tipoRuolo)
				.build();
	}
}