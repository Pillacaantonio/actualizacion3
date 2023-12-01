package com.app.web.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.web.entidad.Envio;
import com.app.web.entidad.Equipo;
import com.app.web.entidad.Solicitante;
import com.app.web.servicio.EnvioServicio;
import com.app.web.servicio.EquipoServicio;
import com.app.web.servicio.SolicitanteServicio;

@Controller
public class EnvioControlador {
	@Autowired
	private EnvioServicio servicio;
	@Autowired
	private SolicitanteServicio solicitanteservicio;
	@Autowired
	private EquipoServicio equiposervicio;
	
	@GetMapping("/envio")
	public String listarEnvio(Model modelo) {
	    List<Envio> envios = servicio.listarEnvio();
	    modelo.addAttribute("envios", envios); 
	    return "envio";
	}

	@GetMapping("/envio/nuevo")
	public String mostrarFormularioDeRegistrarEnvio(Model modelo) {
		Envio envio = new Envio();
	    modelo.addAttribute("envio", envio);

	    List<Solicitante> nombresSolicitantes = solicitanteservicio.listarSolicitante();
	    modelo.addAttribute("nombresSolicitantes", nombresSolicitantes);
	    List<Equipo> marcaEquipo = equiposervicio.listarEquipo();
	    modelo.addAttribute("marcaEquipo", marcaEquipo);

	    return "crear_envio";}
	

 @PostMapping("/envio")
	public String guardarEnvio(@ModelAttribute("envio")Envio envio ) {
		servicio.guardarEnvio(envio);
		return "redirect:/envio";
		
	}

 @GetMapping("/envio/editar/{id}")
 public String mostrarFormularioDeEditar(@PathVariable Long id, Model modelo) {
     Envio envio = servicio.obtenerEnvio(id);
     List<Solicitante> nombresSolicitantes = solicitanteservicio.listarSolicitante();
     List<Equipo> marcaEquipo = equiposervicio.listarEquipo();

     modelo.addAttribute("envio", envio);
     modelo.addAttribute("nombresSolicitantes", nombresSolicitantes);
     modelo.addAttribute("marcaEquipo", marcaEquipo);

     return "editar_envio";
 }


	@PostMapping("/envio/{id}")
	public String actualizarEnvio(@PathVariable Long id,@ModelAttribute("envio")Envio envio,Model Envio ) {

		servicio.ActualizarEnvio(envio);


		return "redirect:/envio";
		
	}
	
	@GetMapping("/envio/{id}")
	public String eliminarEnvio(@PathVariable Long id) {
		servicio.eliminarEnvio(id);
		return "redirect:/envio";
		
	}

}