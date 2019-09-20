package com.jsfdaocrud.model;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.jsfdaocrud.operations.DatabaseOperations;

@ManagedBean (name="productoBean")
@RequestScoped

public class ProductoBean {
	private int idProductoBean;
	private String nombreProductoBean;
	private double precioProductoBean;
	
	public ArrayList ListaProductosFromDB;
	
	public ProductoBean()
	{
	}
	
	public int getIdProductoBean()
	{
		return idProductoBean;
	}
	
	public void setIdProductoBean(int idProductoBean)
	{
		this.idProductoBean = idProductoBean;
	}
	
	public String getNombreProductoBean()
	{
		return nombreProductoBean;
	}
	public void setNombreProductoBean(String nombreProductoBean)
	{
		this.nombreProductoBean = nombreProductoBean;
	}
	
	public double getPrecioProductoBean()
	{
		return precioProductoBean;
	}
	
	public void setPrecioProductoBean(double precioProductoBean)
	{
		this.precioProductoBean = precioProductoBean;
	}
	@PostConstruct
	public void init()
	{
		ListaProductosFromDB = DatabaseOperations.getListaProductosFromDB();
	}
	
	public ArrayList ListaProductos()
	{
		return ListaProductosFromDB;
	}
	
	public String guardarDetallesProducto(ProductoBean objNuevoProducto)
	{
		return DatabaseOperations.guardarDetallesProductoInDB(objNuevoProducto);
	}
	public String editarRegistroProducto(int idProductoBean)
	{
		return DatabaseOperations.editarRegistroProductoInDB(idProductoBean);
	}
	public String actualizarDetallesProducto(ProductoBean objActualizarProducto)
	{
		return DatabaseOperations.actualizarDetallesProductoInDB(objActualizarProducto);
	}
	public String borrarRegistroProducto(int idProductoBean)
	{
		return DatabaseOperations.borrarRegistroProductoInDB(idProductoBean);
	}
}
