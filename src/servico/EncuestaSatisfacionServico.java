package servico;

import java.util.List;

import dominio.EncuestaSatisfacion;

public interface EncuestaSatisfacionServico {
	public void inserir(EncuestaSatisfacion x);
	public EncuestaSatisfacion buscar(int cod);
	public List<EncuestaSatisfacion> buscarTodos();
}
