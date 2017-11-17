package controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dominio.CabanaOCasa;
import servico.ArrendatarioServico;
import servico.CabanaOCasaServico;
import servico.ServicoException;
import servico.ServicoFactory;

@WebServlet("/cliente/CabanaOCasaCRUD")
public class CabanaOCasaCRUD extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static String INSERIR_OU_ALTERAR = "/casaocabanaregistro.jsp";
	private static String LISTAR = "/busqueda.jsp";
	private static String VISUALIZAR = "/administrador/visualizarAvaliacao.jsp";
	private static String ERRO = "/publico/erro.jsp";

	public CabanaOCasaCRUD() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		CabanaOCasaServico cabanaocasaServico = ServicoFactory.criarCabanaOCasaServico();
		

		String forward = "";
		String cmd = request.getParameter("cmd");

		if (cmd == null || cmd.equalsIgnoreCase(""))
			cmd = "listar";

		if (cmd.equalsIgnoreCase("novo")) {
			try {
				CabanaOCasa cabanaocasa = new CabanaOCasa();
				request.setAttribute("cabanaocasa", cabanaocasa);
				forward = INSERIR_OU_ALTERAR;
			} catch (RuntimeException e) {
				request.setAttribute("erro", "Erro de execução: " + e.getMessage());
				forward = ERRO;
			}
		}
		
		else if (cmd.equalsIgnoreCase("visualizar")) {
			int cod = Integer.parseInt(request.getParameter("cod"));
			try {
				CabanaOCasa cabanaocasa = cabanaocasaServico.buscar(cod);
				if (cabanaocasa != null) {
					request.setAttribute("cabanaocasa", cabanaocasa);
					forward = VISUALIZAR;
				} 
			} catch (RuntimeException e) {
				request.setAttribute("Erro de execução: ", e.getMessage());
				forward = ERRO;
			}
		}
		
		else if (cmd.equalsIgnoreCase("listar")) {
			try {				
				request.setAttribute("lista", cabanaocasaServico.buscarTodos());
				forward = LISTAR;
			} catch (RuntimeException e) {
				request.setAttribute("erro", "Erro de execução: " + e.getMessage());
				forward = ERRO;
			}
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(forward);
		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		CabanaOCasaServico cabanaocasaServico = ServicoFactory.criarCabanaOCasaServico();
		String forward = "";
		
		try {
			CabanaOCasa cabanaocasa = instanciar(request);
			if (cabanaocasa.getCodCabanaOCasa() == null) {
				cabanaocasaServico.inserir(cabanaocasa);
			} else {
				cabanaocasaServico.atualizar(cabanaocasa);
			}
			request.setAttribute("lista", cabanaocasaServico.buscarTodos());
			forward = LISTAR;
		} 
		catch (RuntimeException | ServicoException e) {
			request.setAttribute("erro", e.getMessage());
			forward = ERRO;
		}
		RequestDispatcher rd = request.getRequestDispatcher(forward);
		rd.forward(request, response);
	}

	
	private CabanaOCasa instanciar(HttpServletRequest req) throws ServletException, IOException, ServicoException{
		
		/*CabanaOCasaServico motoServico = ServicoFactory.criarCabanaOCasaServico();*/
		/*dependencia ClienteServico cliServico = ServicoFactory.criarClienteServico();*/
		
		ArrendatarioServico arreServico = ServicoFactory.criarArrendatarioServico();
		
		String aux;
		CabanaOCasa x = new CabanaOCasa();
		
		aux = req.getParameter("codCabanaOCasa");
			
		if (aux != null && !aux.isEmpty())
				x.setCodCabanaOCasa(Integer.parseInt(aux));
			
				aux = req.getParameter("nombreCabanaOCasa");
				x.setNombreCabanaOCasa(aux);
				
				aux = req.getParameter("ciudadCabanaOCasa");
				x.setCiudadCabanaOCasa(aux);
				
				aux = req.getParameter("ubicacionCabanaOCasa");
				x.setUbicacionCabanaOCasa(aux);
				
				aux = req.getParameter("fotoCabanaOCasa");
				x.setFotoCabanaOCasa(aux);

				Integer nroBanosCabanaOCasa = Integer.parseInt(req.getParameter("nroBanosCabanaOCasa"));		
				x.setNroBanosCabanaOCasa(nroBanosCabanaOCasa);
				
				Integer nroHabitacionesCabanaOCasa = Integer.parseInt(req.getParameter("nroHabitacionesCabanaOCasa"));		
				x.setNroBanosCabanaOCasa(nroHabitacionesCabanaOCasa);
				
				Double precioDiaria = Double.parseDouble(req.getParameter("precioDiariaCabanaOCasa"));		
				x.setPrecioDiariaCabanaOCasa(precioDiaria);
				
				aux = req.getParameter("codArrendatario");
				x.setArrendatario(arreServico.buscar(Integer.parseInt(aux)));
				
				return x;
			}
}
