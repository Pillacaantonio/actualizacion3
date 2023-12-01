package com.app.web.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.web.entidad.Equipo;
import com.app.web.servicio.EquipoServicio;

@Controller
public class EquipoControlador {
	@Autowired
	private EquipoServicio servicio;
	@GetMapping("/equipo")
	public String listarEquipo(Model modelo) {
		modelo.addAttribute("equipo",servicio.listarEquipo());
		return "equipo";
	}
	@GetMapping("/equipo/nuevo")
	public String mostrarFormularioDeRegistrarEquipo(Model modelo) {
		Equipo equipo = new Equipo();
		modelo.addAttribute("equipo", equipo);
		return "crear_equipo";
	}
	@PostMapping("/equipo")
	public String guardarEquipo(@ModelAttribute("equipo")Equipo equipo ) {
		System.out.println(equipo.toString());
		servicio.guardarequipo(equipo);
		System.out.println("GURADADO");
		return "redirect:/equipo";
		
	}
	
	@GetMapping("/equipo/editar/{id}")
	public String mostrarFormularioDeEditar(@PathVariable Long id,Model modelo) {
		modelo.addAttribute("equipo",servicio.obtenerEquipo(id));
		return"editar_equipo";
	}


	@PostMapping("/Equipo/{id}")
	public String actualizarEquipo(@PathVariable Long id,@ModelAttribute("equipo")Equipo equipo,Model Equipo ) {

		servicio.ActualizarEquipo(equipo);


		return "redirect:/equipo";
		
	}
	
	@GetMapping("/equipo/{id}")
	public String eliminarEquipo(@PathVariable Long id) {
		servicio.elimiarEquipo(id);
		return "redirect:/equipo";
		
	}

}