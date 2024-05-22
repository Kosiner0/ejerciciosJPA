package com.almacen.service;

import java.util.ArrayList;
import java.util.List;

import com.almacen.modelo.Producto;

public class ProductoService {

	private List<Producto> listaProductos;
	
	public ProductoService() {
		listaProductos = new ArrayList<>();
	}

	public List<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}
	
	
	
}
