package dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import dao.EncuestaSatisfacionDao;
import dominio.EncuestaSatisfacion;

public class EncuestaSatisfacionDaoImpl implements EncuestaSatisfacionDao {
	
	private EntityManager em;
	
	public EncuestaSatisfacionDaoImpl(){
		this.em = EM.getLocalEm();
	}

	@Override
	public void inserir(EncuestaSatisfacion x) {
		if(x.getCodAvaliacion() != null){
			x = em.merge(x);
		}
		em.persist(x);
	}

	@Override
	public void alterar(EncuestaSatisfacion x) {
		if(x.getCodAvaliacion() != null){
			x = em.merge(x);
		}
		em.persist(x);	
	}

	@Override
	public EncuestaSatisfacion buscar(int cod) {
		return em.find(EncuestaSatisfacion.class, cod);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<EncuestaSatisfacion> buscarTodos() {
		String jpql = "SELECT x FROM EncuestaSatisfacion x";
		Query query = em.createQuery(jpql);		
		return query.getResultList();
	}


}
