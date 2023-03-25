package it.saracirone.fabula;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import it.saracirone.fabula.config.Beans;
import it.saracirone.fabula.entities.Ruolo;
import it.saracirone.fabula.entities.TipoRuolo;
import it.saracirone.fabula.entities.Utente;
import it.saracirone.fabula.entities.Admin;
import it.saracirone.fabula.entities.Autore;
import it.saracirone.fabula.entities.Books;
import it.saracirone.fabula.services.AdminService;
import it.saracirone.fabula.services.AutoreService;
import it.saracirone.fabula.services.BooksService;
import it.saracirone.fabula.services.RuoloService;
import it.saracirone.fabula.services.UtenteService;


@SpringBootApplication
public class FabulaApplication implements CommandLineRunner {
	
	ApplicationContext ctx = new AnnotationConfigApplicationContext(Beans.class);

	public static void main(String[] args) {
		SpringApplication.run(FabulaApplication.class, args);
	}

	@Override 
	public void run(String...args) throws Exception {
		//popolaDB();
		//popolaDB2();
		addDB();
		((AnnotationConfigApplicationContext)ctx).close();
		
	}
	
	@Autowired
	private UtenteService us;
	
	@Autowired
	private RuoloService rs; 
	
	@Autowired
	private BooksService bs; 
	
	@Autowired
	private AutoreService as; 
	
	@Autowired
	private AdminService ads; 
	

	public void addDB() {
		System.out.println("Popolazione delle tabelle User e Ruoli in corso!");
		/*Ruolo r1 = (Ruolo)ctx.getBean("ruolo", TipoRuolo.ROLE_ADMIN, "Admin");
		Ruolo r2 = (Ruolo)ctx.getBean("ruolo", TipoRuolo.ROLE_AUTHOR, "Autore");
		Ruolo r3 = (Ruolo)ctx.getBean("ruolo", TipoRuolo.ROLE_USER, "Utente");
		
		rs.save(r1);
		rs.save(r2); 
		rs.save(r3);
		
		Utente u1 = (Utente)ctx.getBean("utente", TipoRuolo.ROLE_USER, "USERfabula", "user@mail.com", "user", "User", "Test");
		
		us.save(u1);
		
		Admin a1 = (Admin)ctx.getBean("admin", TipoRuolo.ROLE_ADMIN, "ADMINfabula", "admin@mail.com", "admin", "Admin", "Test");
		
		ads.save(a1);*/
		
		


		
		Autore au1 = (Autore)ctx.getBean("autore", TipoRuolo.ROLE_AUTHOR, "AUTHORfabula", "author@mail.com", "author", "Author", "Test");
		Autore au2 = (Autore)ctx.getBean("autore", TipoRuolo.ROLE_AUTHOR, "AUTHOR2fabula", "author2@mail.com", "author2", "Author2", "Test");
		as.save(au1);
		as.save(au2);
		
		Books book1 =(Books)ctx.getBean("book","Titolo del libro 1", "Un libro Fantasy", 12.00, "img.png", 4, (LocalDate.of(2020, 2, 24)), "FANTASY", Autore.getId());
		Books book2 =(Books)ctx.getBean("book","Titolo del libro 2", "Un libro Horror", 13.00, "img2.png", 6, (LocalDate.of(2020, 8, 12)), "HORROR");
		Books book3 =(Books)ctx.getBean("book","Titolo del libro 3", "Un libro Romance", 15.00, "img2.png", 2, (LocalDate.of(2022, 1, 01)), "ROMANCE");
	
		au1.getBook().add(book1);
		au1.getBook().add(book2);
		au2.getBook().add(book3);
		
		bs.save(book1); 
		bs.save(book2);
		bs.save(book3);

		
	}
	
	/*public void popolaDB() {

		System.out.println("Popolazione delle tabelle User e Ruoli in corso!");
		Ruolo r1 = (Ruolo)ctx.getBean("ruolo", TipoRuolo.ROLE_ADMIN, "Admin");
		Ruolo r2 = (Ruolo)ctx.getBean("ruolo", TipoRuolo.ROLE_USER, "Utente");
		Utente u1 = (Utente)ctx.getBean("utente", "admin", "admin@mail.com", "admin", "admin", "admin");
		Utente u2 = (Utente)ctx.getBean("utente", "user", "mario@mail.com", "user", "Mario", "Rossi");
		
		rs.save(r1);
		rs.save(r2);

		u1.setRuoli(new HashSet<>() {{
			add(r1);
		}});

		u2.setRuoli(new HashSet<>() {{ 
			add(r2);
		}});
		
		us.save(u1);
		us.save(u2);
		
		System.out.println("Tabelle popolate con successo!");
	}
	
	public void popolaDB2() {
		System.out.println("Popolazione delle tabelle Autore e Libri in corso");
		
		Ruolo r1 = (Ruolo)ctx.getBean("ruolo", TipoRuolo.ROLE_ADMIN, "Admin");
		Ruolo r2 = (Ruolo)ctx.getBean("ruolo", TipoRuolo.ROLE_USER, "Utente");
		rs.save(r1);
		rs.save(r2);

		
		Utente user1 = new Utente();
		user1.setUsername("Admin");
		user1.setEmail("admin@example.com");
		user1.setPassword("adminpass");
		user1.setRuoli(new HashSet<>() {{
			add(r1);
		}});
		us.save(user1);
		
		Utente user2 = new Utente();
		user2.setUsername("Autore01");
		user2.setEmail("autore01@example.com");
		user2.setPassword("autorepass");
		user2.setRuoli(new HashSet<>() {{
			add(r2);
		}});
		us.save(user2);
		
		Libri libro1 = (Libri)ctx.getBean("libro","Titolo Prova",  30, "Un libro di prova", "imgProva", 10, true, user1.getUsername());
		ls.save(libro1);
		
		System.out.println("Db popolato!");
	}*/
}
