package servico;

import java.util.List;

import dominio.Arrendatario;

public interface ArrendatarioServico {
	
	public void inserir(Arrendatario x);
	public void atualizar(Arrendatario x);
	public Arrendatario buscar(int cod);
	public List<Arrendatario> buscarTodos();

}