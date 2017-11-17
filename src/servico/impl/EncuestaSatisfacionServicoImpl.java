package servico.impl;

import java.util.List;

import dao.EncuestaSatisfacionDao;
import dao.DaoFactory;
import dao.jpa.EM;
import dominio.EncuestaSatisfacion;
import servico.EncuestaSatisfacionServico;

public class EncuestaSatisfacionServicoImpl implements EncuestaSatisfacionServico{

	private EncuestaSatisfacionDao dao;
	public EncuestaSatisfacionServicoImpl() {
		dao = DaoFactory.criarEncuestaSatisfacionDao();
	}
	
	@Override
	public EncuestaSatisfacion buscar (int cod) {
		return dao.buscar(cod);
	}
	
	@Override
	public List<EncuestaSatisfacion>buscarTodos(){
		return dao.buscarTodos();
	}
	
	@Override
	public void inserir(EncuestaSatisfacion x ) {
		EM.getLocalEm().getTransaction().begin();
		dao.inserir(x);
		EM.getLocalEm().getTransaction().commit();
	}
	
	
}