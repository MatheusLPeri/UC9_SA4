package senai.UC9_SA4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import senai.UC9_SA4.orm.Categoria;
import senai.UC9_SA4.services.CategoriaServico;

@Controller
public class SpringController
{
	@Autowired
	private CategoriaServico servico;

	@GetMapping({ "/" })
	public String path()
	{
		return "index";
	}

	@GetMapping({ "/categorias" })
	public String listarCategorias(Model modelo)
	{
		modelo.addAttribute("categoria", servico.listarCategorias());
		return "categorias";
	}

	@GetMapping("/categorias/adicionar")
	public String adicionarCategorias(Model modelo)
	{
		Categoria categoria = new Categoria();
		modelo.addAttribute("categoria", categoria);
		return "categoriaform";
	}

	@PostMapping("/categoria")
	public String salvarCategorias(@ModelAttribute("categoria") Categoria categoria)
	{
		servico.salvarCategorias(categoria);
		return "redirect:/categorias";
	}
}
