package com.app.web.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entidad.Encargado_logistica;
import com.app.web.interfaceService.IEncargado_logisticaService;
import com.app.web.interfaces.IEncargado_logistica;



@Service
public class Encargado_logisticaService implements IEncargado_logisticaService {
	@Autowired
	private IEncargado_logistica datos;
	
	@Override
	public List<Encargado_logistica> listarEncargado_logistica() {
		return (List<Encargado_logistica>)datos.findAll();
	}

}
