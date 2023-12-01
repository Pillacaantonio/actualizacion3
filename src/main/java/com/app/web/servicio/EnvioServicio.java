package com.app.web.servicio;

import java.util.List;

import com.app.web.entidad.Envio;


public interface EnvioServicio {
	
	public List<Envio> listarEnvio();
	public Envio guardarEnvio (Envio envio);
	
	public Envio obtenerEnvio(Long id);
	
	public Envio ActualizarEnvio(Envio envio);
	
	public void eliminarEnvio(Long id);

}