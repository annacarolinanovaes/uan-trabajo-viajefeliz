package dao;

import java.util.List;

import dominio.Usuario;

public interface UsuarioDao {
	public void inserir(Usuario x);
	public void alterar(Usuario x);
	public Usuario buscar(int cod);
	public List<Usuario> buscarTodos();
}
