package fr.market.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor 	@Data  @Entity

public class Produit {
	@Id
	private int iden;
	private String designation;
	private float prix_uni;
}
