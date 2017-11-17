package dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import dao.AlquilerDao;
import dominio.Alquiler;

public class AlquilerDaoImpl implements AlquilerDao {
private EntityManager em;

public AlquilerDaoImpl() {
	this.em= EM.getLocalEm();
}

@Override
public void inserir(Alquiler x) {
	if(x.getCodAlquiler()!=null) {
		x= em.merge(x);
	}
	em.persist(x);
}

@Override 
public Alquiler buscar(int cod) {
	return em.find(Alquiler.class, cod);
}

@SuppressWarnings("unchecked")
@Override
public List<Alquiler> buscarTodos(){

	String jpql= "SELECT x FROM alquiler x";
	Query query = em.createQuery(jpql);
	return query.getResultList();
}

/*@SuppressWarnings("unchecked")
@Override
public List<CabanaOCasa> busquedaPorFechas(Date fechainicio, Date fechafin, String ciudad) {

	String jpql = "SELECT x FROM cabanaocasa, alquiler WHERE alquiler.fechaInicio <= " + fechainicio + " AND alquiler.fechaFin >= " + fechafin + "AND cabanaocasa.cuidadCabanaOCasa = " + cuidad;
	Query query = em.createQuery(jpql);
	return query.getResultList();
}
*/
}