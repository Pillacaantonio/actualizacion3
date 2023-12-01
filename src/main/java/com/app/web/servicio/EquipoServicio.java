package com.app.web.servicio;

import java.util.List;

import com.app.web.entidad.Equipo;


public interface EquipoServicio {
	
	public List<Equipo> listarEquipo();
	public Equipo guardarequipo (Equipo equipo);
	
	public Equipo obtenerEquipo(Long id);
	
	public Equipo ActualizarEquipo(Equipo equipo);
	
	public void elimiarEquipo(Long id);

}