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
	private String tributacao;
	
	public Integer getId()
	{
		return id;
	}
	public String getDescricao()
	{
		return descricao;
	}
	public String getAtivo()
	{
		return ativo;
	}
	public String getTributacao()
	{
		return tributacao;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public void setDescricao(String descricao)
	{
		this.descricao = descricao;
	}
	public void setAtivo(String ativo)
	{
		this.ativo = ativo;
	}
	public void setTributacao(String tributacao)
	{
		this.tributacao = tributacao;
	}
}
