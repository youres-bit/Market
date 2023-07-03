package fr.market.entities;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor @AllArgsConstructor 	@Data  @Entity


public class client {
	@Id
	private int id;
	private String nom;
	private String prenom;
	private String ville;

}
