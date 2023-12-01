package com.app.web.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entidad.Envio;
import com.app.web.repositorio.EnvioRepositorio;

@Service
public class EnvioServicioImpl implements EnvioServicio {

	@Autowired
	private EnvioRepositorio repositorio;

	@Override
	public List<Envio> listarEnvio() {
		return repositorio.findAll();
	}

	@Override
	public Envio guardarEnvio(Envio envio) {
		return repositorio.save(envio);
	}

	@Override
	public Envio obtenerEnvio(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public Envio ActualizarEnvio(Envio envio) {
		return repositorio.save(envio);
	}

	@Override
	public void eliminarEnvio(Long id) {
		repositorio.deleteById(id);
		
	}

}