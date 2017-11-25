package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dominio.Arrendatario;
import servico.ArrendatarioServico;
import servico.ServicoException;
import servico.ServicoFactory;

@WebServlet("/cliente/ArrendatarioCRUD")
public class ArrendatarioCRUD extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static String INSERIR_OU_ALTERAR = "/registroArrendatario.jsp";
	private static String LISTAR = "/arrendatariosRegistrados.jsp";
	private static String VISUALIZAR = "/visualizarArrendatario.jsp";
	private static String ERRO = "/publico/erro.jsp";

	public ArrendatarioCRUD() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ArrendatarioServico arrendatarioServico = ServicoFactory.criarArrendatarioServico();

		String forward = "";
		String cmd = request.getParameter("cmd");

		if (cmd == null || cmd.equalsIgnoreCase(""))
			cmd = "listar";

		if (cmd.equalsIgnoreCase("novo")) {
			try {
				Arrendatario arrendatario = new Arrendatario();
				request.setAttribute("arrendatario", arrendatario);
				forward = INSERIR_OU_ALTERAR;
			} catch (RuntimeException e) {
				request.setAttribute("erro", "Erro de execução: " + e.getMessage());
				forward = ERRO;
			}
		}
		
		else if (cmd.equalsIgnoreCase("visualizar")) {
			int cod = Integer.parseInt(request.getParameter("cod"));
			try {
				Arrendatario arrendatario = arrendatarioServico.buscar(cod);
				if (arrendatario != null) {
					request.setAttribute("arrendatario", arrendatario);
					forward = VISUALIZAR;
				} 
			} catch (RuntimeException e) {
				request.setAttribute("Erro de execução: ", e.getMessage());
				forward = ERRO;
			}
		}
		
		else if (cmd.equalsIgnoreCase("listar")) {
			try {				
				request.setAttribute("lista", arrendatarioServico.buscarTodos());
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
		
		
		ArrendatarioServico arrendatarioServico = ServicoFactory.criarArrendatarioServico();
		String forward = "";
		
		try {
			Arrendatario arrendatario = instanciar(request);
			if (arrendatario.getCodArrendatario() == null) {
				arrendatarioServico.inserir(arrendatario);
			} else {
				arrendatarioServico.atualizar(arrendatario);
			}
			request.setAttribute("lista", arrendatarioServico.buscarTodos());
			forward = LISTAR;
		} 
		catch (RuntimeException | ServicoException e) {
			request.setAttribute("erro", e.getMessage());
			forward = ERRO;
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(forward);
		rd.forward(request, response);
	}

	
	private Arrendatario instanciar(HttpServletRequest req) throws ServletException, IOException, ServicoException{
		
		String aux;
		Arrendatario x = new Arrendatario();
		
		aux = req.getParameter("codArrendatario");		
		if (aux != null && !aux.isEmpty())
				x.setCodArrendatario(Integer.parseInt(aux));
			
				aux = req.getParameter("nombreArrendatario");
				x.setNombreArrendatario(aux);
				aux = req.getParameter("cedulaCuidadania");
				x.setCedulaCuidadania(aux);
				aux = req.getParameter("nacionalidadArrendatario");
				x.setNacionalidadArrendatario(aux);
				aux = req.getParameter("direccionResidenciaArrendatario");
				x.setDireccionResidenciaArrendatario(aux);
				aux = req.getParameter("telefono");
				x.setTelefono(aux);
				aux = req.getParameter("correoElectronicoArrendatario");
				x.setCorreoElectronicoArrendatario(aux);
				aux = req.getParameter("contrasenhaArrendatario");
				x.setContrasenhaArrendatario(aux);
				
				return x;
			}
}
