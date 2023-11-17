package controllers;

import java.util.ArrayList;
import java.util.List;

import models.Item;
import models.Pedido;
import play.cache.Cache;
import play.mvc.Controller;

public class Pedidos extends Controller {
	
	public static void form() {
		List<Item> itens = Item.findAll();
		List<Item> itensCarrinho = Cache.get(session.getId(), List.class);
		
		render(itens, itensCarrinho);
	}
	
	public static void listar() {
		List<Pedido> pedidos = Pedido.findAll();
		render(pedidos);
	}
	
	public static void addItem(Long id) {
		List<Item> itensCarrinho = Cache.get(session.getId(), List.class);
	 	if (itensCarrinho == null) {
	 		itensCarrinho = new ArrayList<Item>();
	 	}
	 	
	 	Item item = Item.findById(id);
		itensCarrinho.add(item);
		Cache.set(session.getId(), itensCarrinho);
		form();
	}
	
	public static void salvar() {
		List<Item> itensCarrinho = Cache.get(session.getId(), List.class);
		if (itensCarrinho == null) {
			form();
		}
		
		Pedido pedido = new Pedido();
		pedido.itens = itensCarrinho;
		pedido.save();
		
		Cache.clear();
	}
	
	public static void detalhar(Long id) {
		Pedido pedido = Pedido.findById(id);
		render(pedido);
	}
	
}
