package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import dao.ArrendatarioDao;
import dominio.Arrendatario;
import dominio.CabanaOCasa;



class ArrendatarioDaoTest {

	@Autowired
	private ArrendatarioDao arrendatarioDAO;

	@Test
	public void testBuscarArrendatario() {
		List<Arrendatario> arrendatario = arrendatarioDAO.buscarTodos();
		assertNotNull(arrendatario);
	}
	@Test
	public void testBuscarArrendatarioPorid() {
		Arrendatario arrendatario = arrendatarioDAO.buscar(1);
		assertNotNull(arrendatario);
	}
	@Test
	public void testInsertarArrendatario() {
		Arrendatario arrendatario = new Arrendatario(1,"Alan Moore", 2321323, "5655465",
				"fgfgkdf@dfsdf", "Callefalsa 123",
				"Colombiano", "1234");
		
		arrendatarioDAO.inserir(arrendatario);

		assertEquals("Alan Moore",arrendatario.getNombreArrendatario());
	}

}
