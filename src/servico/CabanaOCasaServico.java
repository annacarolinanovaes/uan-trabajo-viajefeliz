package servico;

import java.util.Date;
import java.util.List;

import dominio.CabanaOCasa;

public interface CabanaOCasaServico {
	public void inserir(CabanaOCasa x);
	public void atualizar(CabanaOCasa x);
	public CabanaOCasa buscar(int cod);
	public List<CabanaOCasa> buscarTodos();
	public List<CabanaOCasa> busquedaPorFechas(Date fechaInicio, Date fechaFin, String ciudad);
	public List<CabanaOCasa> buscarPorNome(String nome);
}
