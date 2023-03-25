package it.saracirone.fabula.entities;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Entity
@Table(name = "books")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Books {

	@Id
	@GeneratedValue
	private Integer id;
	private String titolo;
	private String descrizione; 
	private Double prezzo; 
	private String imgUrl;
	private int unita; 
	private Date dataCreazione;
	@Enumerated(EnumType.STRING)
	public Genere genere;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "autore_id")
	private Autore autore;
	
}
