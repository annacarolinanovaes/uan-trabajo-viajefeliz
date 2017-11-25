package dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

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
		return em.find(CabanaOCasa.class, cod);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CabanaOCasa> buscarTodos() {
		String jpql = "SELECT x FROM CabanaOCasa x";
		Query query = em.createQuery(jpql);		
		return query.getResultList();
	}
	
	@Override
	public List<CabanaOCasa> buscarPorNome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<CabanaOCasa> busquedaPorFecha(String fechaInicio, String fechaFin, String ciudadCabanaOCasa) {
		String hql = "SELECT cc FROM CabanaOCasa as cc LEFT JOIN cc.alquileres as a WHERE cc.ciudadCabanaOCasa = :ciudadCabanaOCasa  AND ((a.fechaInicio NOT BETWEEN '" + fechaInicio + "' AND '" + fechaFin + "')"
				+ " AND (a.fechaFin NOT BETWEEN '" + fechaInicio + "' AND '" + fechaFin + "'))";
		Query query = em.createQuery(hql);
		query.setParameter("ciudadCabanaOCasa", ciudadCabanaOCasa);
		
		return query.getResultList();
	}

}
