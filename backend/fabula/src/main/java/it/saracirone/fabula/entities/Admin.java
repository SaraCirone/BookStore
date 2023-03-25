package it.saracirone.fabula.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "admin")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Admin {
    @Id
    @GeneratedValue
    private Integer id;
    private String nome; 
    private String cognome; 
    private String adminNick; 
	@Enumerated(EnumType.STRING)
	private TipoRuolo tipoRuolo = TipoRuolo.ROLE_ADMIN; 
	private String email;
	private String password;
	private boolean attivo = true;
		
}


