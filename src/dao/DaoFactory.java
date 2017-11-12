package dao;

import dao.jpa.ArrendatarioDaoImpl;
import dao.jpa.CabanaOCasaDaoImpl;


public class DaoFactory {
	
	public static CabanaOCasaDao criarCabanaOCasaDao(){
		return new CabanaOCasaDaoImpl();
	}
	
	public static ArrendatarioDao criarArrendatarioDao(){
		return new ArrendatarioDaoImpl();
	}
	
	
}
