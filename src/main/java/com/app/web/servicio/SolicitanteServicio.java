package com.app.web.servicio;

import java.util.List;

import com.app.web.entidad.Solicitante;

public interface SolicitanteServicio {
	
	public List<Solicitante> listarSolicitante();
	public Solicitante guardarSolicitante (Solicitante solicitante);
	
	public Solicitante obtenerSolicitante(Long id);
	
	public Solicitante ActualizarSolicitante(Solicitante solicitante);
	
	public void elimiarSolicitante(Long id);

}
