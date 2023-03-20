package it.saracirone.fabula;


import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

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
		popolaDB2();
		((AnnotationConfigApplicationContext)ctx).close();
		
	}
	
	@Autowired
	private UtenteService us;
	
	@Autowired
	private RuoloService rs; 
	
	public void popolaDB() {

		System.out.println("Popolazione delle tabelle User e Ruoli in corso!");
		Ruolo r1 = (Ruolo)ctx.getBean("ruolo", TipoRuolo.ROLE_ADMIN, "Admin");
		Ruolo r2 = (Ruolo)ctx.getBean("ruolo", TipoRuolo.ROLE_USER, "Utente");
		Ruolo r3 = (Ruolo)ctx.getBean("ruolo", TipoRuolo.ROLE_AUTHOR, "Autore");
		Utente u1 = (Utente)ctx.getBean("utente", "Admin", "User", "UserAdmin", "Admin_123", "admin@mail.com");
		Utente u2 = (Utente)ctx.getBean("utente", "Sara", "Cirone", "SaraCirone", "123456", "saracirone@mail.com");
		Utente u3 = (Utente)ctx.getBean("utente", "Fabio",  "Volo", "F_Volo", "123456", "fvolo@mail.com");
		
		rs.save(r1);
		rs.save(r2);
		rs.save(r3);
		
		u1.setRuoli(new HashSet<>() {{
			add(r1);
		}});

		u2.setRuoli(new HashSet<>() {{
			add(r2);
		}});
		
		u3.setRuoli(new HashSet<>() {{
			add(r3);
		}});
		
		us.save(u1);
		us.save(u2);
		us.save(u3);
		
		System.out.println("Tabelle popolate con successo!");
	}
	
	public void popolaDB2() {
		System.out.println("Popolazione delle tabelle Autore e Libri in corso");

		System.out.println("Db popolato!");
	}
}
