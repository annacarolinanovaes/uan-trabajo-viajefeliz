package servico.impl;

import java.util.List;

import dao.ArrendatarioDao;
import dao.DaoFactory;
import dao.jpa.EM;
import dominio.Arrendatario;
import servico.ArrendatarioServico;

public class ArrendatarioServicoImpl implements ArrendatarioServico{

	private ArrendatarioDao dao;
	public ArrendatarioServicoImpl() {
		dao = DaoFactory.criarArrendatarioDao();
	}
	
	@Override
	public Arrendatario buscar (int cod) {
		return dao.buscar(cod);
	}
	
	@Override
	public List<Arrendatario>buscarTodos(){
		return dao.buscarTodos();
	}
	
	@Override
	public void inserir(Arrendatario x ) {
		EM.getLocalEm().getTransaction().begin();
		dao.inserir(x);
		EM.getLocalEm().getTransaction().commit();
	}

	@Override
	public void atualizar(Arrendatario x) {
		EM.getLocalEm().getTransaction().begin();
		dao.atualizar(x);
		EM.getLocalEm().getTransaction().commit();
	}
	
	
}