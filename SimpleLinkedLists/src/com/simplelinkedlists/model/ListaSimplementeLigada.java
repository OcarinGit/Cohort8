package com.simplelinkedlists.model;

public class ListaSimplementeLigada {
	Nodo cabeza;
	/*
	public ListaSimplementeLigada()
	{
		cabeza=null;
	}*/
	
	public void insert(int dato)
	{
		//Paso 1 - Crear el espacio en memoria con el dato asignado y el apuntador al siguiente nodo con valor de null
		Nodo nodo=new Nodo();
		nodo.dato = dato;
		nodo.nodo_siguiente = null;
		//Paso 2 - Asignamos el valor de la memoria del ultimo nodo de la lista ligada
		if(cabeza==null)
		{
			cabeza=nodo;
		}
		else
		{
			Nodo nodoRecorredor = cabeza;
			while(nodoRecorredor.nodo_siguiente!=null)
			{
				nodoRecorredor = nodoRecorredor.nodo_siguiente;
			}
			nodoRecorredor.nodo_siguiente=nodo;
		}
	}
	
	public void insertarAlInicio(int dato)
	{
		Nodo nodo = new Nodo();
		nodo.dato=dato;
		nodo.nodo_siguiente=null;
		nodo.nodo_siguiente=cabeza;
		cabeza=nodo;
	}
	
	public void insertarIndice(int indice, int dato)
	{
		Nodo nodo = new Nodo();
		nodo.dato = dato;
		nodo.nodo_siguiente=null;
		Nodo nodoRecorredor = cabeza;
		
		for(int cont=0;cont<indice-1;cont++)
		{
			nodoRecorredor = nodoRecorredor.nodo_siguiente;
		}
		//Hacemos el cambio de direcciones de memoria
		nodo.nodo_siguiente = nodoRecorredor.nodo_siguiente;
		nodoRecorredor.nodo_siguiente= nodo;
	}
	
	public void muestraNodos()
	{
		Nodo nodoRecorredor = cabeza;
		while(nodoRecorredor.nodo_siguiente!=null)
		{
			System.out.println(nodoRecorredor.dato);
			nodoRecorredor = nodoRecorredor.nodo_siguiente;
		}
		System.out.println(nodoRecorredor.dato);
	}
}
