package com.algoritmosoop.misclases;

public class Libro {
	
	public String ISBN;
	public String Titulo;
	public String autor;
	public int anio;
	public int noHojas;
	public double precio;
	public boolean isPastaDura;
	
	public Libro()
	{
		this.ISBN="001B";
		this.Titulo="NoName";
		this.autor="El Machou";
		this.anio=1900;
		this.noHojas=1;
		this.precio=0.0;
		this.isPastaDura=false;
	}
	
	public Libro(String ISBN)
	{
		this.ISBN= ISBN;
		this.Titulo="NoName";
		this.autor="El Machou";
		this.anio=1900;
		this.noHojas=1;
		this.precio=0.0;
		this.isPastaDura=false;
	}
	
	public Libro(String ISBN, String Titulo)
	{
		this.ISBN=ISBN;
		this.Titulo=Titulo;
		this.autor="El Machou";
		this.anio=1900;
		this.noHojas=1;
		this.precio=0.0;
		this.isPastaDura=false;
	}
	
	public Libro(String ISBN, String Titulo, String autor)
	{
		this.ISBN=ISBN;
		this.Titulo=Titulo;
		this.autor=autor;
		this.anio=1900;
		this.noHojas=1;
		this.precio=0.0;
		this.isPastaDura=false;
	}
	
	public Libro(String ISBN, String Titulo, String autor, int anio)
	{
		this.ISBN=ISBN;
		this.Titulo=Titulo;
		this.autor=autor;
		this.anio = anio;
		this.noHojas=1;
		this.precio=0.0;
		this.isPastaDura=false;
	}
	
	public boolean prestarLibro()
	{
		return false;
	}
	
	public void agregarLibro() 
	{
	}
	public boolean eliminarLibro()
	{
		return false;
	}
	public int contarLibros()
	{
		return 0;
	}
	public double verPrecio(String ISBN)
	{
		return precio;
	}

}
