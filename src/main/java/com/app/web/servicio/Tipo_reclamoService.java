package com.app.web.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entidad.Tipo_reclamo;
import com.app.web.interfaceService.ITipo_reclamoService;
import com.app.web.interfaces.ITipo_reclamo;



@Service
public class Tipo_reclamoService implements ITipo_reclamoService {
	
	@Autowired
	private ITipo_reclamo datos;
	
	@Override
	public List<Tipo_reclamo> listarTipo_reclamo() {		
		return (List<Tipo_reclamo>)datos.findAll();
	}

}