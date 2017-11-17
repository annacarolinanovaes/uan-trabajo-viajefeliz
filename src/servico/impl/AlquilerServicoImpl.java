package servico.impl;

import java.util.List;

import dao.AlquilerDao;
import dao.DaoFactory;
import dao.jpa.EM;
import dominio.Alquiler;
import servico.AlquilerServico;

public class AlquilerServicoImpl implements AlquilerServico{

	private AlquilerDao dao;
	public AlquilerServicoImpl() {
		dao= DaoFactory.criarAlquilerDao();
	}
	
	@Override
	public Alquiler buscar (int cod) {
		return dao.buscar(cod);
	}
	
	@Override
	public List<Alquiler>buscarTodos(){
		return dao.buscarTodos();
	}
	
	@Override
	public void inserir(Alquiler x ) {
		EM.getLocalEm().getTransaction().begin();
		dao.inserir(x);
		EM.getLocalEm().getTransaction().commit();
	}
	
	
}