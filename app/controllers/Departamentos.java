package controllers;

import java.util.ArrayList;
import java.util.List;

import models.Departamento;
import models.Vendedor;
import play.mvc.Controller;

public class Departamentos extends Controller {
	
	public static void detalhar(Long id) {
		Departamento d = Departamento.findById(id);
		List<Vendedor> vendedores = Vendedor.findAll();
		render(d, vendedores);
	}
	
	public static void addVendedor(Long id, Long idVendedor) {
		Departamento departamento = Departamento.findById(id);
		Vendedor vendedor = Vendedor.findById(idVendedor);
		if (departamento.vendedores == null) {
			departamento.vendedores = new ArrayList<>();
		}
		departamento.vendedores.add(vendedor);
		departamento.save();
		detalhar(departamento.id);
	}

}

