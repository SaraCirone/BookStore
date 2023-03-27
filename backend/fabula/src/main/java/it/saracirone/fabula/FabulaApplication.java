
package it.saracirone.fabula;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.text.PasswordView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import it.saracirone.fabula.config.Beans;
import it.saracirone.fabula.entities.Ruolo;
import it.saracirone.fabula.entities.TipoRuolo;
import it.saracirone.fabula.entities.TipoGenere;
import it.saracirone.fabula.entities.Autore;
import it.saracirone.fabula.entities.Admin;
import it.saracirone.fabula.entities.Genere;
import it.saracirone.fabula.entities.Libro;
import it.saracirone.fabula.entities.Utente;
import it.saracirone.fabula.repositories.LibroRepo;
import it.saracirone.fabula.services.AdminService;
import it.saracirone.fabula.services.AutoreService;
import it.saracirone.fabula.services.GenereService;
import it.saracirone.fabula.services.LibroService;
import it.saracirone.fabula.controllers.LibroController;
import it.saracirone.fabula.services.RuoloService;
import it.saracirone.fabula.services.UtenteService;
import org.springframework.http.ResponseEntity;




@ComponentScan("it.saracirone.fabula")
@SpringBootApplication
public class FabulaApplication implements CommandLineRunner {
	
	ApplicationContext ctx = new AnnotationConfigApplicationContext(Beans.class);

	public static void main(String[] args) {
		SpringApplication.run(FabulaApplication.class, args);
		
	}

	@Override 
	public void run(String...args) throws Exception {
		controlloDb();
		//addDB();

		((AnnotationConfigApplicationContext)ctx).close();
		
	}
	

	
	@Autowired
	private RuoloService rs; 
	
	@Autowired
	private LibroService ls; 
	
	@Autowired
	private AutoreService as; 
	
	@Autowired
	private GenereService gs;
	
	@Autowired
	private UtenteService us;
	
	@Autowired
	private AdminService ads;
	
	

	public void addDB() {
		System.out.println("Popolazione delle tabelle in corso!");
		Ruolo r1 = (Ruolo)ctx.getBean("ruolo", TipoRuolo.ROLE_ADMIN, "Admin");
		Ruolo r2 = (Ruolo)ctx.getBean("ruolo", TipoRuolo.ROLE_AUTHOR, "Autore" );
		Ruolo r3 = (Ruolo)ctx.getBean("ruolo", TipoRuolo.ROLE_USER, "Utente");
		rs.save(r1);
		rs.save(r2); 
		rs.save(r3);
		System.out.println("Creazine Ruoli avvenuta!");
				
		
		Genere g1 = (Genere)ctx.getBean("genere", TipoGenere.HORROR, "Horror");
		Genere g2 = (Genere)ctx.getBean("genere", TipoGenere.ROMANCE, "Romance");
		Genere g3 = (Genere)ctx.getBean("genere", TipoGenere.STORIA, "Storia");
		Genere g4 = (Genere)ctx.getBean("genere", TipoGenere.THRILLER, "Thriller");
		Genere g5 = (Genere)ctx.getBean("genere", TipoGenere.YOUNG_ADULT, "Young Adult");
		Genere g6 = (Genere)ctx.getBean("genere", TipoGenere.AVVENTURA, "Avventura");
		Genere g7 = (Genere)ctx.getBean("genere", TipoGenere.NARRATIVA, "Narrativa");
		Genere g8 = (Genere)ctx.getBean("genere", TipoGenere.FANTASCIENZA, "Fantascienza");
		Genere g9 = (Genere)ctx.getBean("genere", TipoGenere.FANTASY, "Fantasy");
		gs.save(g1);
		gs.save(g2);
		gs.save(g3);
		gs.save(g4);
		gs.save(g5);
		gs.save(g6);
		gs.save(g7);
		gs.save(g8);
		gs.save(g9);
		System.out.println("Creazine Generi avvenuta!");
	
		Utente u1 = new Utente();
	    u1.setNome("UtenteTest");
	    u1.setCognome("Test");
        u1.setUserNick("UTENTEprova");
        u1.setEmail("utente@example.com");
        u1.setPassword("utente_123");
        u1.setRuolo(r3);
        us.save(u1);
        
		System.out.println("Creazine Utente avvenuta!");
		
    	Admin a1 = new Admin();
	    a1.setNome("AdminTest");
	    a1.setCognome("Test");
        a1.setAdminNick("ADMINprova");
        a1.setEmail("admin@example.com");
        a1.setPassword("admin_123");
        a1.setRuolo(r1);
        ads.save(a1);
        
        System.out.println("Creazine Admin avvenuta!");
        
    	Autore autore1 = new Autore();
    	autore1.setNome("Autore");
    	autore1.setCognome("01");
    	autore1.setAutoreNick("Autore01");
    	autore1.setEmail("autore1@example.com");
    	autore1.setPassword("autore01");
    	autore1.setRuolo(r2);
        as.save(autore1);
        
    	Autore autore2 = new Autore();
    	autore2.setNome("Autore");
    	autore2.setCognome("02");
    	autore2.setAutoreNick("Autore02");
    	autore2.setEmail("autore2@example.com");
    	autore2.setPassword("autore02");
    	autore2.setRuolo(r2);
        as.save(autore2);
        
        
    	Autore autore3 = new Autore();
    	autore3.setNome("Autore");
    	autore3.setCognome("03");
    	autore3.setAutoreNick("Autore03");
    	autore3.setEmail("autore3@example.com");
    	autore3.setPassword("autore03");
		autore3.setRuolo(r2);
        as.save(autore3);

        
        System.out.println("Creazine Autori avvenuta!");
   
        
        Libro libro1 = new Libro();
        libro1.setTitolo("Io sono leggenda");
        libro1.setDescrizione("Ambientato in un futuro post apocalittico, l'unico sopravvissuto deve sopravvivere agli zombie");
        libro1.setPrezzo(15.00);
        libro1.setImgUrl("iosonoleggenda.png");
        libro1.setPezzi(10);
        libro1.setGenere(g7);
        libro1.setAutore(autore1);
        ls.save(libro1);

        Libro libro2 = new Libro();
        libro2.setTitolo("Bones ad All");
        libro2.setDescrizione("Un libro Horror che parla di due ragazzi cannibali");
        libro2.setPrezzo(12.30);
        libro2.setImgUrl("bonesandall.png");
        libro2.setPezzi(4);
        libro2.setGenere(g1);
        libro2.setAutore(autore1);
        ls.save(libro2);
        
        
        Libro libro3 = new Libro();
        libro3.setTitolo("Il signore degli Anelli");
        libro3.setDescrizione("Le avventure di una compagnia che viaggia tra molti pericoli per distruggere un antico anello");
        libro3.setPrezzo(20.00);
        libro3.setImgUrl("ilsignoredeglianelli.png");
        libro3.setPezzi(5);
        libro3.setGenere(g9);
        libro3.setAutore(autore1);
        ls.save(libro3);
        
        
        Libro libro4 = new Libro();
        libro4.setTitolo("12 anni schiavo");
        libro4.setDescrizione("Storia autobiografica di uno schiavo di colore nel 1800");
        libro4.setPrezzo(10.00);
        libro4.setImgUrl("12annischiavo.png");
        libro4.setPezzi(7);
        libro4.setGenere(g3);
        libro4.setAutore(autore2);
        ls.save(libro4);
        
        Libro libro5 = new Libro();
        libro5.setTitolo("After");
        libro5.setDescrizione("Storia di due ragazzi e del rapporto complicato");
        libro5.setPrezzo(10.00);
        libro5.setImgUrl("after.png");
        libro5.setPezzi(7);
        libro5.setGenere(g5);
        libro5.setAutore(autore2);
        ls.save(libro5);
        
        Libro libro6 = new Libro();
        libro6.setTitolo("Multiversum");
        libro6.setDescrizione("Ambientato in un multiverso con due ragazzi");
        libro6.setPrezzo(15.00);
        libro6.setImgUrl("multiversum.png");
        libro6.setPezzi(10);
		libro6.setGenere(g7);
        libro6.setAutore(autore3);
        ls.save(libro6);

        
        
        System.out.println("Creazine Libri avvenuta!");
        
        //CREAZIONE UTENTE, ADMIN, AUTORE, LIBRI, RUOLO E GENERE FUNZIONANTE 
		
		System.out.println("Popolazione Avvenuta!");
	}
	
	public void controlloDb() {
		System.out.println("Esecuzine avviata con successo");
	}

	
	
}
