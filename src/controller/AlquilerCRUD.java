package controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dominio.Alquiler;
import servico.AlquilerServico;
import servico.CabanaOCasaServico;
import servico.ServicoException;
import servico.ServicoFactory;
import servico.UsuarioServico;

@WebServlet("/cliente/AlquilerCRUD")
public class AlquilerCRUD extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static String INSERIR_OU_ALTERAR = "/realizarAlquiler.jsp";
	private static String LISTAR = "/alquileresRegistrados.jsp";
	private static String VISUALIZAR = "/visualizarCabanaOCasa.jsp";
	private static String ERRO = "/publico/erro.jsp";
	private static String HOME = "/controlUsuario.jsp";

	public AlquilerCRUD() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		CabanaOCasaServico cabanaocasaServico = ServicoFactory.criarCabanaOCasaServico();
		AlquilerServico alquilerServico = ServicoFactory.criarAlquilerServico();

		String forward = "";
		String cmd = request.getParameter("cmd");

		if (cmd == null || cmd.equalsIgnoreCase(""))
			cmd = "listar";

		if (cmd.equalsIgnoreCase("novo")) {
			int cod = Integer.parseInt(request.getParameter("cod"));
			try {
				Alquiler alquiler = new Alquiler();
				alquiler.setCabanaOCasa(cabanaocasaServico.buscar(cod));
				request.setAttribute("alquiler", alquiler);
				forward = INSERIR_OU_ALTERAR;
			} catch (RuntimeException e) {
				request.setAttribute("erro", "Erro de execução: " + e.getMessage());
				forward = ERRO;
			}
		}
		
		else if (cmd.equalsIgnoreCase("visualizar")) {
			int cod = Integer.parseInt(request.getParameter("cod"));
			try {
				Alquiler alquiler = alquilerServico.buscar(cod);
				if (alquiler != null) {
					request.setAttribute("alquiler", alquiler);
					forward = VISUALIZAR;
				} 
			} catch (RuntimeException e) {
				request.setAttribute("Erro de execução: ", e.getMessage());
				forward = ERRO;
			}
		}
		
		else if (cmd.equalsIgnoreCase("listar")) {
			try {				
				request.setAttribute("lista", alquilerServico.buscarTodos());
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
		
		
		AlquilerServico alquilerServico = ServicoFactory.criarAlquilerServico();
		String forward = "";
		
		try {
			Alquiler alquiler = instanciar(request);
			if (alquiler.getCodAlquiler() == null) {
				alquilerServico.inserir(alquiler);
			} else {
				alquilerServico.atualizar(alquiler);
			}
			request.setAttribute("lista", alquilerServico.buscarTodos());
			forward = HOME;
		} 
		catch (RuntimeException | ServicoException e) {
			request.setAttribute("erro", e.getMessage());
			forward = ERRO;
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(forward);
		rd.forward(request, response);
	}

	
	private Alquiler instanciar(HttpServletRequest req) throws ServletException, IOException, ServicoException{

		UsuarioServico usuarioServico = ServicoFactory.criarUsuarioServico();
		CabanaOCasaServico cabanaocasaServico = ServicoFactory.criarCabanaOCasaServico();
		
		String aux;
		//Date aux2 = new Date();
		boolean aux3 = true;
		
		Alquiler x = new Alquiler();
		
		aux = req.getParameter("codAlquiler");
			
		if (aux != null && !aux.isEmpty())
				x.setCodAlquiler(Integer.parseInt(aux));
			
				aux = req.getParameter("fechaInicio");
				x.setFechaInicio(aux);
				aux = req.getParameter("fechaFin");
				x.setFechaFin(aux);
				Integer cantidadPersonas = Integer.parseInt(req.getParameter("cantidadPersonas"));		
				x.setCantidadPersonas(cantidadPersonas);
				aux = req.getParameter("pago");
				x.setPago(aux3);
				aux = req.getParameter("codUsuario");
				x.setUsuarioSeleccionado(usuarioServico.buscar(Integer.parseInt(aux)));
				aux = req.getParameter("codCabanaOCasa");
				x.setCabanaOCasa(cabanaocasaServico.buscar(Integer.parseInt(aux)));

				
				return x;
			}
}
