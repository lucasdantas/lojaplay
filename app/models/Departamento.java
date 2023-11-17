package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import play.db.jpa.Model;

@Entity
public class Departamento extends Model {

	public String nome;
	
	@ManyToMany
	public List<Vendedor> vendedores;
}
