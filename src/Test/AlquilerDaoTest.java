package Test;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import dao.AlquilerDao;
import dao.ArrendatarioDao;
import dominio.Alquiler;
import dominio.Arrendatario;

class AlquilerDaoTest {

	@Autowired
	private AlquilerDao alquilerDAO;

	@Test
	public void testBuscarCabana() {
		List<Alquiler> alquiler = alquilerDAO.buscarTodos();
		assertNotNull(alquiler);
	}
	@Test
	public void testBuscarCabanaPorid() {
		Alquiler alquiler = alquilerDAO.buscar(1);
		assertNotNull(alquiler);
	}
	@Test
	public void testInsertarCabana() {
		Alquiler alquiler = new Alquiler();
		alquiler.setCodAlquiler(1);
		
		alquiler.setCantidadPersonas(2);
		alquilerDAO.inserir(alquiler);

		assertNotNull(alquilerDAO);
	}


}
