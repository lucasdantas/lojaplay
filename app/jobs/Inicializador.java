package jobs;

import models.Departamento;
import models.Item;
import models.Vendedor;
import play.jobs.Job;
import play.jobs.OnApplicationStart;

@OnApplicationStart
public class Inicializador extends Job {

	@Override
	public void doJob() throws Exception {
		if (Item.count() == 0) {
			Item i1 = new Item();
			i1.nome = "Teclado";
			i1.save();
			
			Item i2 = new Item();
			i2.nome = "Mouse";
			i2.save();
			
			Item i3 = new Item();
			i3.nome = "Monitor LED";
			i3.save();
			
			Item i4 = new Item();
			i4.nome = "HD SSD 256GB";
			i4.save();
			
			Item i5 = new Item();
			i5.nome = "Gabinete";
			i5.save();
			
			Item i6 = new Item();
			i6.nome = "Fonte ATX";
			i6.save();
			
			Item i7 = new Item();
			i7.nome = "Filtro de linha";
			i7.save();
			
			Departamento d1 = new Departamento();
			d1.nome = "Vendas";
			d1.save();
			
			Departamento d2 = new Departamento();
			d2.nome = "Logística";
			d2.save();
			
			Departamento d3 = new Departamento();
			d3.nome = "SAC";
			d3.save();
			
			Vendedor v1 = new Vendedor();
			v1.nome = "Joao";
			v1.save();
			
			Vendedor v2 = new Vendedor();
			v2.nome = "Antonio";
			v2.save();
			
			Vendedor v3 = new Vendedor();
			v3.nome = "Maria";
			v3.save();
		}
	}
	
}
