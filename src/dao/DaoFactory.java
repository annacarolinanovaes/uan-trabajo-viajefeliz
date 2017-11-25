package dao;

import dao.jpa.AlquilerDaoImpl;
import dao.jpa.ArrendatarioDaoImpl;
import dao.jpa.CabanaOCasaDaoImpl;
import dao.jpa.EncuestaSatisfacionDaoImpl;
import dao.jpa.UsuarioDaoImpl;


public class DaoFactory {
	
	public static CabanaOCasaDao criarCabanaOCasaDao(){
		return new CabanaOCasaDaoImpl();
	}
	
	public static ArrendatarioDao criarArrendatarioDao(){
		return new ArrendatarioDaoImpl();
	}

	public static AlquilerDao criarAlquilerDao() {
		return new AlquilerDaoImpl();
	}
	
	public static UsuarioDao criarUsuarioDao(){
		return new UsuarioDaoImpl();
	}
	
	public static EncuestaSatisfacionDao criarEncuestaSatisfacionDao(){
		return new EncuestaSatisfacionDaoImpl();
	}
}
