package com.app.web.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entidad.Cargo_recepcion;
import com.app.web.interfaceService.ICargo_recepcionService;
import com.app.web.interfaces.ICargo_recepcion;



@Service
public class Cargo_recepcionService implements ICargo_recepcionService{
	
	@Autowired
	private ICargo_recepcion datos;

	@Override
	public List<Cargo_recepcion> listarCargo_recepcion() {
		return (List<Cargo_recepcion>)datos.findAll();
	}
	
	
}