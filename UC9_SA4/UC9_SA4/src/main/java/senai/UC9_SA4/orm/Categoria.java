package senai.UC9_SA4.orm;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name = "categorias")

public class Categoria
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer id;
	private String descricao;
	private String ativo;
	
	public Integer getId()
	{
		return id;
	}
	public String getDescrição()
	{
		return descricao;
	}
	public String getAtivo()
	{
		return ativo;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public void setDescrição(String descricao)
	{
		this.descricao = descricao;
	}
	public void setAtivo(String ativo)
	{
		this.ativo = ativo;
	}
}
