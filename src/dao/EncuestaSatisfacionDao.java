package dao;

import java.util.List;

import dominio.EncuestaSatisfacion;

public interface EncuestaSatisfacionDao {
	public void inserir(EncuestaSatisfacion x);
	public void alterar(EncuestaSatisfacion x);
	public EncuestaSatisfacion buscar(int cod);
	public List<EncuestaSatisfacion> buscarTodos();
}
