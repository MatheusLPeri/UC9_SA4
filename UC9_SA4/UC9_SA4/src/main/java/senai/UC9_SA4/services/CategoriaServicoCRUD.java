package senai.UC9_SA4.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import senai.UC9_SA4.orm.Categoria;
import senai.UC9_SA4.repository.CategoriaRepository;

@Service
public class CategoriaServicoCRUD implements CategoriaServico
{
	@Autowired
	private CategoriaRepository repositorio;
	
	public List<Categoria> listarCategorias()
	{
		return (List<Categoria>)repositorio.findAll();
	}
	
	public Categoria salvarCategorias(Categoria categoria)
	{
		return repositorio.save(categoria);
	}
}
