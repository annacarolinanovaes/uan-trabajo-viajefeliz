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
/*@Override
	public MotoTaxista buscar(int cod) {
		return em.find(MotoTaxista.class, cod);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MotoTaxista> buscarTodos() {
		String jpql = "SELECT x FROM MotoTaxista x";
		Query query = em.createQuery(jpql);
		return query.getResultList();
	}*/

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

}
