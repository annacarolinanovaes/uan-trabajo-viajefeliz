package dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;

import dao.CabanaOCasaDao;
import dominio.CabanaOCasa;

public class CabanaOCasaDaoImpl implements CabanaOCasaDao {
	
	private EntityManager em;
	
	public CabanaOCasaDaoImpl(){
		this.em = EM.getLocalEm();
	}

	@Override
	public void inserir(CabanaOCasa x) {
		if(x.getCodCabanaOCasa() != null){
			x = em.merge(x);
		}
		em.persist(x);

		
	}

	@Override
	public void alterar(CabanaOCasa x) {
		if(x.getCodCabanaOCasa() != null){
			x = em.merge(x);
		}
		em.persist(x);	
	}


	@Override
	public CabanaOCasa buscar(int cod) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CabanaOCasa> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CabanaOCasa> buscarPorNome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

}
