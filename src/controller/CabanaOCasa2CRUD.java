package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dominio.CabanaOCasa;
import servico.CabanaOCasaServico;
import servico.ServicoFactory;

@WebServlet("/cliente/CabanaOCasa2CRUD")
public class CabanaOCasa2CRUD extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static String LISTARPORFECHA = "/busqueda.jsp";
	private static String ERRO = "/publico/erro.jsp";
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
			CabanaOCasaServico cabanaocasaServico = ServicoFactory.criarCabanaOCasaServico();
			String forward = "";
					
			String fechaInicio = request.getParameter("fechaInicio");
			String fechaFin = request.getParameter("fechaFin");
			String ciudadCabanaOCasa = request.getParameter("ciudadCabanaOCasa");
			
			try {
				
				List<CabanaOCasa> cabanaocasa = cabanaocasaServico.busquedaPorFechas(fechaInicio, fechaFin, ciudadCabanaOCasa);
	
				request.setAttribute("lista", cabanaocasa);
				forward = LISTARPORFECHA;
			} 
			catch (RuntimeException e) {
				request.setAttribute("erro", "Erro de execucao: " + e.getMessage());
				forward = ERRO;
			}
			RequestDispatcher rd = request.getRequestDispatcher(forward);
			rd.forward(request, response);
		}
}