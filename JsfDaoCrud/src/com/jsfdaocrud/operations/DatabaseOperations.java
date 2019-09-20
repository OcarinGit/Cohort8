package com.jsfdaocrud.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Map;

import javax.faces.context.FacesContext;

import com.jsfdaocrud.model.ProductoBean;

public class DatabaseOperations {
	private static Connection conn;
	private static Statement stmnt;
	private static ResultSet rs;
	private static PreparedStatement pstmnt;
	
	//Método para realizar la conexión a la base de datos
	public static Connection getConnection()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver").getConstructor().newInstance();
			String db_url = "jdbc:mysql://localhost:3306/elmacho?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
			String db_user = "root";
			String db_password = "root";
			conn = DriverManager.getConnection(db_url, db_user, db_password);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return conn;
	}
	
	public static ArrayList getListaProductosFromDB()
	{
		ArrayList ListaProductos = new ArrayList();
		try
		{
			stmnt = getConnection().createStatement();
			rs = stmnt.executeQuery("select * from productos");
			
			while(rs.next())
			{
				ProductoBean objProducto = new ProductoBean();
				objProducto.setIdProductoBean(rs.getInt("IdProducto"));
				objProducto.setNombreProductoBean(rs.getString("NombreProducto"));
				objProducto.setPrecioProductoBean(rs.getDouble("PrecioProducto"));
				
				ListaProductos.add(objProducto);
			}
			System.out.println("Total de Registros Extraídos:"+ListaProductos.size());
			conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ListaProductos;
	}
	
	public static String guardarDetallesProductoInDB(ProductoBean objNuevoProducto)
	{
		String resultadosNavegacion="";
		int resultadoGuardar=0;
		try
		{
			pstmnt = getConnection().prepareStatement("insert into Productos (IdProducto,NombreProducto,PrecioProducto) values(?,?,?)");
			pstmnt.setInt(1, objNuevoProducto.getIdProductoBean());
			pstmnt.setString(2, objNuevoProducto.getNombreProductoBean());
			pstmnt.setDouble(3, objNuevoProducto.getPrecioProductoBean());
			resultadoGuardar = pstmnt.executeUpdate();
			
			conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		if(resultadoGuardar!=0)
		{
			resultadosNavegacion = "index.xhtml?faces-redirect=true";
		}
		else
		{
			resultadosNavegacion = "agregarProducto.xhtml?faces-redirect=true";
		}
		return resultadosNavegacion;
	}
	
	public static String editarRegistroProductoInDB(int idProductoBean)
	{
		ProductoBean editarRegistro=new ProductoBean();
		System.out.println("editarRegistroProductoInDB(): Producto Id:"+idProductoBean);
		
		/* Configurar los respectivos detalles del Producto en la Session*/
		Map<String, Object> objMapSession = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		
		try
		{
			stmnt = getConnection().createStatement();
			rs = stmnt.executeQuery("select * from Productos where IdProducto="+idProductoBean);
			if(rs != null)
			{
				rs.next();
				editarRegistro.setIdProductoBean(rs.getInt("IdProducto"));
				editarRegistro.setNombreProductoBean(rs.getString("NombreProducto"));
				editarRegistro.setPrecioProductoBean(rs.getDouble("PrecioProducto"));
			}
			objMapSession.put("objEditarRegistro", editarRegistro);
			conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return "editarProducto.xhtml?faces-redirect=true";
	}
	public static String actualizarDetallesProductoInDB(ProductoBean objActualizarProducto)
	{
		try
		{
			pstmnt = getConnection().prepareStatement("update Productos set IdProducto=?, NombreProducto=?, PrecioProducto=? where IdProducto=?");
			pstmnt.setInt(1, objActualizarProducto.getIdProductoBean());
			pstmnt.setString(2, objActualizarProducto.getNombreProductoBean());
			pstmnt.setDouble(3, objActualizarProducto.getPrecioProductoBean());
			pstmnt.setInt(4, objActualizarProducto.getIdProductoBean());
			pstmnt.executeUpdate();
			conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return "index.xhtml?faces-redirect=true";
	}
	
	public static String borrarRegistroProductoInDB(int idProductoBean)
	{
		System.out.println("borrarRegistroProductoInDB(): IdProducto:"+idProductoBean);
		try
		{
			pstmnt = getConnection().prepareStatement("delete from Productos where IdProducto=?");
			pstmnt.setInt(1, idProductoBean);
			pstmnt.executeUpdate();
			conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return "/index.xhtml?faces-redirect=true";
	}
	
	
	
	
	
}
