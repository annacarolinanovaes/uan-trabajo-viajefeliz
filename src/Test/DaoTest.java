package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import dao.CabanaOCasaDao;
import dominio.CabanaOCasa;

class DaoTest {

	@Autowired
	private CabanaOCasaDao cabanaDAO;

	@Test
	public void testBuscarCabanaPorId() {
		CabanaOCasa cabana = cabanaDAO.buscar(1);
		assertNotNull(cabana);
	}
	@Test
	public void testBuscarCabanaPorNombre() {
		List<CabanaOCasa> cabana = cabanaDAO.buscarPorNome("Playa");
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
