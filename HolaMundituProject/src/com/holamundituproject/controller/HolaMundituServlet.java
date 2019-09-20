package com.holamundituproject.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.holamunditu.model.HolaMunditu;

/**
 * Servlet implementation class HolaMundituServlet
 */
@WebServlet("/HolaMundituServlet")
public class HolaMundituServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HolaMundituServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sTesto=request.getParameter("txtTesto");
		String sTesto2=request.getParameter("txtTesto2");
		response.getWriter().write("<html>");
		response.getWriter().write("<head>");
		response.getWriter().write("<title>Esta es mi respuesta</title>");
		response.getWriter().write("</head>");
		response.getWriter().write("<body>");
		response.getWriter().write("<h1>La Respuesta del servidor </h1>");
		response.getWriter().write("<p>");
		response.getWriter().write("Primer  Testo:"+sTesto);
		response.getWriter().write("</p>");
		response.getWriter().write("<p>");
		response.getWriter().write("<br/>Segundo  Testo:"+sTesto2);
		response.getWriter().write("</p>");
		response.getWriter().write("<p>");
		HolaMunditu objHolamunditu = new HolaMunditu();
		response.getWriter().write("Mi Mensajitu es:"+objHolamunditu.diHolaMunditu() );
		response.getWriter().write("</p>");
		response.getWriter().write("</body>");
		response.getWriter().write("</html>");
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doHead(HttpServletRequest, HttpServletResponse)
	 */
	protected void doHead(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
