package servico.impl;

import java.util.Date;
import java.util.List;

import dao.CabanaOCasaDao;
import dao.DaoFactory;
import dao.jpa.EM;
import dominio.CabanaOCasa;
import servico.CabanaOCasaServico;

public class CabanaOCasaServicoImpl implements CabanaOCasaServico{
private CabanaOCasaDao dao;
	
	public CabanaOCasaServicoImpl(){
		dao = DaoFactory.criarCabanaOCasaDao();
	}

	@Override
	public CabanaOCasa buscar(int cod) {
		return dao.buscar(cod);
	}

	@Override
	public List<CabanaOCasa> buscarTodos() {
		return dao.buscarTodos();
	}

	@Override
	public List<CabanaOCasa> buscarPorNome(String nome){
		return dao.buscarPorNome(nome);
	}

	@Override
	public void inserir(CabanaOCasa x) {
		EM.getLocalEm().getTransaction().begin();
		dao.inserir(x);
		EM.getLocalEm().getTransaction().commit();

	}
	
	@Override
	public void atualizar(CabanaOCasa x) {
		EM.getLocalEm().getTransaction().begin();
		dao.alterar(x);
		EM.getLocalEm().getTransaction().commit();

	}

	@Override
	public List<CabanaOCasa> busquedaPorFechas(String fechaInicio, String fechaFin, String ciudad) {
		return dao.busquedaPorFecha(fechaInicio, fechaFin, ciudad);
	}
	

}