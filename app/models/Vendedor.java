package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Vendedor extends Model {

	public String nome;
	
}
