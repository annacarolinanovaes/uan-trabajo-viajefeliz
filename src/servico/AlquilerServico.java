package servico;

import java.util.List;

import dominio.Alquiler;

public interface AlquilerServico {
	
	public void inserir(Alquiler x);
	public Alquiler buscar(int cod);
	public List<Alquiler> buscarTodos();

}