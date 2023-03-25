package it.saracirone.fabula.entities;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "utenti")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Utente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Enumerated(EnumType.STRING)
	private TipoRuolo tipoRuolo = TipoRuolo.ROLE_USER; 
	private String userNick;
	private String email;
	private String password;
	private String nome;
	private String cognome;
	private boolean attivo = true;
	
	/*@OneToMany(mappedBy = "utente")
	private List<Libri> libri;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
		name = "ruoli_utenti",
			joinColumns = @JoinColumn(name = "utente_id"),
			inverseJoinColumns = @JoinColumn(name = "ruolo_id")
			)
	private Set<Ruolo> ruoli;
	
	 @OneToMany(mappedBy = "autore")
	    private List<Libri> libro;*/
	
}
