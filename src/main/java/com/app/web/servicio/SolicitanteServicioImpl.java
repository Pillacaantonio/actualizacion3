package com.app.web.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entidad.Solicitante;
import com.app.web.repositorio.SolictanteRepositorio;

@Service
public class SolicitanteServicioImpl implements SolicitanteServicio {

	@Autowired
	private SolictanteRepositorio repositorio;

	@Override
	public List<Solicitante> listarSolicitante() {

		return repositorio.findAll();
	}

	@Override
	public Solicitante guardarSolicitante(Solicitante solicitante) {
		return repositorio.save(solicitante);
	}

	@Override
	public Solicitante obtenerSolicitante(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public Solicitante ActualizarSolicitante(Solicitante solicitante) {
		return repositorio.save(solicitante);
	}

	@Override
	public void elimiarSolicitante(Long id) {
		repositorio.deleteById(id);

	}

}
