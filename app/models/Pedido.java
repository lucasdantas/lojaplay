package models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import play.db.jpa.Model;

@Entity
public class Pedido extends Model {
	
	@ManyToMany
	public List<Item> itens;
	
	@Temporal(TemporalType.TIMESTAMP)
	public Date data;
	
	public Pedido() {
		data = new Date();
	}
	
	@Override
	public String toString() {
		return id + " / " + data;
	}

}
