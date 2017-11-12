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
import servico.impl.ServicoException;

@WebServlet("/cliente/CabanaOCasaCRUD")
public class CabanaOCasaCRUD extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static String INSERIR_OU_ALTERAR = "/administrador/avaliacaoForm.jsp";
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
			CabanaOCasa casaocabana = instanciar(request);
			cabanaocasaServico.atualizar(casaocabana);
			
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
		
		String aux;
		CabanaOCasa x = new CabanaOCasa();
		
		aux = req.getParameter("codCabanaOCasa");
			
		if (aux != null && !aux.isEmpty())
				x.setCodCabanaOCasa(Integer.parseInt(aux));
			
				aux = req.getParameter("nombreCabanaOCasa");
				x.setNombreCabanaOCasa(aux);
				
				aux = req.getParameter("cuidadCabanaOCasa");
				x.setCuidadCabanaOCasa(aux);
				
				aux = req.getParameter("ubicacionCabanaOCasa");
				x.setUbicacionCabanaOCasa(aux);
				
				Double precioDiaria = Double.parseDouble(req.getParameter("precioDiariaCabanaOCasa"));		
				x.setPrecioDiariaCabanaOCasa(precioDiaria);
				
				return x;
			}
		
	}
