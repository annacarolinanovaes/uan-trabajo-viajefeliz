package dao;

import java.util.Date;
import java.util.List;

import dominio.CabanaOCasa;

public interface CabanaOCasaDao {
	public void inserir(CabanaOCasa x);
	public void alterar(CabanaOCasa x);
	public CabanaOCasa buscar(int cod);
	public List<CabanaOCasa> buscarTodos();
	public List<CabanaOCasa> buscarPorNome(String nome);
	public List<CabanaOCasa> busquedaPorFecha(String fechaInicio, String fechaFin, String ciudad);
}
