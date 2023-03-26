package it.saracirone.fabula.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
@Table(name = "genere")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter


public class Genere {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	@Enumerated(EnumType.STRING)
	private TipoGenere tipoGenere; 
	private String nomeGenere;
	
}
