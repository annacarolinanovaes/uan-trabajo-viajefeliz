package dao;

import dao.jpa.CabanaOCasaDaoImpl;


public class DaoFactory {
	
	public static CabanaOCasaDao criarCabanaOCasaDao(){
		return new CabanaOCasaDaoImpl();
	}
	
	
	
	
}
