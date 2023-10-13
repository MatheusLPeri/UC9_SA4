package senai.UC9_SA4.services;

import java.security.PublicKey;
import java.util.List;

import senai.UC9_SA4.orm.Categoria;

public interface CategoriaServico
{
	public List<Categoria> listarCategorias();

	public Categoria salvarCategorias(Categoria categoria);
	
	public void apagarCategoria(Integer id);
	
	public Categoria consultarCategoriaID(Integer id);
	
	public Categoria atualizarCategoria(Categoria categoria);
}
