package com.app.web.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entidad.Equipo;
import com.app.web.repositorio.EquipoRepositorio;

@Service
public class EquipoServicioImpl implements EquipoServicio {

	@Autowired
	private EquipoRepositorio repositorio;

	@Override
	public Equipo guardarequipo(Equipo equipo) {
		return repositorio.save(equipo);
	
	}

	@Override
	public Equipo obtenerEquipo(Long id) {
		return repositorio.findById(id).get();
	
	}

	@Override
	public Equipo ActualizarEquipo(Equipo equipo) {
		return repositorio.save(equipo);
		
	}
	@Override
	public void elimiarEquipo(Long id) {
		repositorio.deleteById(id);

	}

	@Override
	public List<Equipo> listarEquipo() {
		return repositorio.findAll();
	
	}

}
