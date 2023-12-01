package com.app.web.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.web.entidad.Solicitante;
import com.app.web.servicio.SolicitanteServicio;

@Controller
public class SolicitanteControlador {
	
	@Autowired
	private SolicitanteServicio servicio;
	@GetMapping("/solicitante")
	public String listarSolicitante(Model modelo) {
		modelo.addAttribute("solicitante",servicio.listarSolicitante());
		return "solicitante";
	}
	@GetMapping("/solicitante/nuevo")
	public String mostrarFormularioDeRegistrarSolicitante(Model modelo) {
		Solicitante solicitante = new Solicitante();
		modelo.addAttribute("solicitante", solicitante);
		return "crear_solicitante";
	}
	@PostMapping("/solicitante")
	public String guardarSolicitante(@ModelAttribute("solicitante")Solicitante solicitante ) {
		servicio.guardarSolicitante(solicitante);
		return "redirect:/solicitante";
		
	}
	
	@GetMapping("/solicitante/editar/{id}")
	public String mostrarFormularioDeEditar(@PathVariable Long id,Model modelo) {
		modelo.addAttribute("solicitante",servicio.obtenerSolicitante(id));
		return"editar_solicitante";
	}


	@PostMapping("/solicitante/{id}")
	public String actualizarSolicitante(@PathVariable Long id,@ModelAttribute("solicitante")Solicitante solicitante,Model modelo ) {
		Solicitante solicitanteExistente = servicio.obtenerSolicitante(id);
		solicitanteExistente.setId(id);
		solicitante.setApellido(solicitante.getApellido());
		solicitante.setNombre(solicitante.getNombre());
		solicitante.setCargo(solicitante.getCargo());
		solicitante.setDireccion(solicitante.getDireccion());
		solicitante.setDepartamento(solicitante.getDepartamento());
		solicitante.setEstadoCivil(solicitante.getEstadoCivil());
		solicitante.setFechaNacimiento(solicitante.getFechaNacimiento());
		solicitante.setTelefono(solicitante.getTelefono());
		
		servicio.ActualizarSolicitante(solicitanteExistente);


		return "redirect:/solicitante";
		
	}
	
	@GetMapping("/solicitante/{id}")
	public String eliminarSolicitante(@PathVariable Long id) {
		servicio.elimiarSolicitante(id);
		return "redirect:/solicitante";
		
	}

}
