package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import dao.CabanaOCasaDao;
import dominio.CabanaOCasa;

class CabanaDaoTest {

	@Autowired
	private CabanaOCasaDao cabanaDAO;

	@Test
	public void testBuscarCabana() {
		List<CabanaOCasa> cabana = cabanaDAO.buscarTodos();
		assertNotNull(cabana);
	}
	@Test
	public void testBuscarCabanaPorid() {
		CabanaOCasa cabana = cabanaDAO.buscar(2);
		assertNotNull(cabana);
	}
	@Test
	public void testInsertarCabana() {
		CabanaOCasa cabana = new CabanaOCasa();
		cabana.setNombreCabanaOCasa("Playa rio");
		cabanaDAO.inserir(cabana);

		assertEquals("Playa rio",cabana.getNombreCabanaOCasa());
	}

}
