package com.operacionesaritmeticas.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.operacionesaritmeticas.model.OperacionesAritmeticas;

@WebServlet("/AleatoriosServlet")
public class AleatoriosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int cantidadAleatorios = Integer.parseInt(request.getParameter("txtCantidadAleatorios"));
		
		//response.getWriter().write("Cantidad de Aleatorios a generar:"+cantidadAleatorios);
		
		int[] pseudoaleatoriosGenerados = new int[cantidadAleatorios];
		pseudoaleatoriosGenerados = OperacionesAritmeticas.generacionPseudoaleatorios(cantidadAleatorios);
		for(int i=0;i<pseudoaleatoriosGenerados.length;i++)
		{
			System.out.println("Elemento ["+i+"]="+pseudoaleatoriosGenerados[i]);
		}
		
		response.getWriter().write("<html>");
		response.getWriter().write("<head>");
		response.getWriter().write("<meta charset=\"UTF-8\">");
		response.getWriter().write("<title>");
		response.getWriter().write("Pseudoaleatorios");
		response.getWriter().write("</title>");
		response.getWriter().write("</head>");
		response.getWriter().write("<body>");
		response.getWriter().write("<table>");
		response.getWriter().write("<thead>");
		response.getWriter().write("<tr>");
		response.getWriter().write("<th>");
		response.getWriter().write("Elemento");
		response.getWriter().write("</th>");
		response.getWriter().write("<th>");
		response.getWriter().write("Aleatorio");
		response.getWriter().write("</th>");
		response.getWriter().write("<th>");
		response.getWriter().write("Acciones");
		response.getWriter().write("</th>");
		response.getWriter().write("</tr>");
		response.getWriter().write("</thead>");
		response.getWriter().write("<tbody>");
		
		for(int i=0;i<pseudoaleatoriosGenerados.length;i++)
		{
			response.getWriter().write("<tr>");
			response.getWriter().write("<td>");
			response.getWriter().write(" "+i);
			response.getWriter().write("</td>");
			response.getWriter().write("<td>");
			response.getWriter().write("<input type=\"text\" value=\""+pseudoaleatoriosGenerados[i]+"\">");
			response.getWriter().write("</td>");
			response.getWriter().write("<td>");
			response.getWriter().write("<a href=\"\"><input type=\"button\" value=\"Editar\"></a>");
			response.getWriter().write("<a href=\"\"><input type=\"button\" value=\"Borrar\"></a>");
			response.getWriter().write("<a href=\"\"><input type=\"button\" value=\"Cancelar\"></a>");
			response.getWriter().write("</td>");
			response.getWriter().write("</tr>");
		}
		
		response.getWriter().write("</tbody>");
		response.getWriter().write("</table>");
		response.getWriter().write("</body>");
		response.getWriter().write("</html>");
	}

}
