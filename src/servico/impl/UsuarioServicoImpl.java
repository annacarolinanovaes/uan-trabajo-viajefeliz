package servico.impl;

import java.util.List;

import dao.UsuarioDao;
import dao.DaoFactory;
import dao.jpa.EM;
import dominio.Usuario;
import servico.UsuarioServico;

public class UsuarioServicoImpl implements UsuarioServico{

	private UsuarioDao dao;
	public UsuarioServicoImpl() {
		dao = DaoFactory.criarUsuarioDao();
	}
	
	@Override
	public Usuario buscar (int cod) {
		return dao.buscar(cod);
	}
	
	@Override
	public List<Usuario>buscarTodos(){
		return dao.buscarTodos();
	}
	
	@Override
	public void inserir(Usuario x ) {
		EM.getLocalEm().getTransaction().begin();
		dao.inserir(x);
		EM.getLocalEm().getTransaction().commit();
	}
	
	
}