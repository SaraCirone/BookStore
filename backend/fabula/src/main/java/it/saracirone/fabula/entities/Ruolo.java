 package it.saracirone.fabula.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ruoli")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter


public class Ruolo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	private TipoRuolo tipoRuolo;
	private String nomeRuolo; 
	
}
