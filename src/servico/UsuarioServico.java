package servico;

import java.util.List;

import dominio.Usuario;

public interface UsuarioServico {
	public void inserir(Usuario x);
	public Usuario buscar(int cod);
	public List<Usuario> buscarTodos();
}
