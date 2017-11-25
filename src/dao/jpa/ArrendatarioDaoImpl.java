package dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import dao.ArrendatarioDao;
import dominio.Arrendatario;


public class ArrendatarioDaoImpl implements ArrendatarioDao {
	
	private EntityManager em;
	
	public ArrendatarioDaoImpl(){
		this.em = EM.getLocalEm();
	}

	@Override
	public void inserir(Arrendatario x) {
		if(x.getCodArrendatario() != null){
			x = em.merge(x);
		}
		em.persist(x);
	}

	@Override
	public void alterar(Arrendatario x) {
		if(x.getCodArrendatario() != null){
			x = em.merge(x);
		}
		em.persist(x);	
	}

	@Override
	public Arrendatario buscar(int cod) {
		return em.find(Arrendatario.class, cod);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Arrendatario> buscarTodos() {
		String jpql = "SELECT x FROM Arrendatario x";
		Query query = em.createQuery(jpql);		
		return query.getResultList();
	}

	@Override
	public void atualizar(Arrendatario x) {
		// TODO Auto-generated method stub
		
	}

}
