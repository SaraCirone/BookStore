package it.saracirone.fabula.entities;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "autori")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Autore {
    @Id
    @GeneratedValue
    private Integer id;
    private String nome; 
    private String cognome; 
    private String autoreNick; 
	@Enumerated(EnumType.STRING)
	private TipoRuolo tipoRuolo = TipoRuolo.ROLE_AUTHOR; 
    @OneToMany(mappedBy = "autore", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Books> book = new ArrayList<>();
	private String email;
	private String password;
	private boolean attivo = true;
	
	
	public Autore (String nome, String cognome, String autoreNick, TipoRuolo tipoRuolo, List<Books> book, String email, String password) {
		this.nome = nome; 
		this.cognome = cognome; 
		this.autoreNick = autoreNick; 
		this.book = book;
		this.tipoRuolo = tipoRuolo; 
		this.email = email; 
		this.password = password; 
	}
}
