package dao;

import java.util.List;

import dominio.Arrendatario;

public interface ArrendatarioDao {
	public void inserir(Arrendatario x);
	public Arrendatario buscar(int cod);
	public List<Arrendatario> buscarTodos();
	void alterar(Arrendatario x);
	void atualizar(Arrendatario x);
}
