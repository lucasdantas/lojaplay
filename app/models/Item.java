package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Item extends Model {
	
	public String nome;
	
	@Override
	public String toString() {
		return nome;
	}

}
