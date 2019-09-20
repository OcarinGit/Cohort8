package com.hibernatemavenpractica1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productos")
public class Productos {
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="IdProducto")
	private int IdProducto;
	
	@Column(name="NombreProducto")
	private String NombreProducto;
	
	@Column (name="PrecioProducto")
	private double PrecioProducto;
	
	public Productos() {
	}
	public int getIdProducto() {
		return IdProducto;
	}
	public void setIdProducto(int idProducto) {
		IdProducto = idProducto;
	}
	public String getNombreProducto() {
		return NombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		NombreProducto = nombreProducto;
	}
	public double getPrecioProducto() {
		return PrecioProducto;
	}
	public void setPrecioProducto(double precioProducto) {
		PrecioProducto = precioProducto;
	}
}
