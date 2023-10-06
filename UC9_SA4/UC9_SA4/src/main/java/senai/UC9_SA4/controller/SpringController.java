package senai.UC9_SA4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import senai.UC9_SA4.services.CategoriaServico;

@Controller
public class SpringController
{
	@Autowired
	private CategoriaServico servico;
	
	@GetMapping({"/"})
	public String path()
	{
		return "index";
	}
	@GetMapping({"/categorias"})
	public String listarCategorias(Model modelo)
	{
		modelo.addAttribute("categoria", servico.listarCategorias());
		return "categorias";
	}
	
}
