package com.G27Tienda.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

import com.G27Tienda.InterfacesServicios.iPersonaService;

@RestController
@RequestMapping
public class Controlador {
	
	@Autowired
	private IPersonaService service;
	
	@GetMapping("/listar")
	public String listar(Model model)
	{
		List<Persona> personas = service.listar();
		model.addAttribubtes("persona", personas);
		return "index";
	}

}
