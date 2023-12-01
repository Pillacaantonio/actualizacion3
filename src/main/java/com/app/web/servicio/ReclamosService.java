package com.app.web.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entidad.Reclamos;
import com.app.web.interfaceService.IReclamosService;
import com.app.web.interfaces.IReclamos;


@Service
public class ReclamosService implements IReclamosService{
	@Autowired
	private IReclamos datos;
	
	public List<Reclamos> listarReclamos(){
		return (List<Reclamos>)datos.findAll();
	}
	
	public Optional<Reclamos> buscarCodRec(int cod){
		return datos.findById(cod);
	}
	
	public int registrarReclamo(Reclamos r) {
		Reclamos rec = datos.save(r);		
		return !rec.equals(null) ? 1 : 0;
	}

	public void eliminarReclamo(int cod) {
		datos.deleteById(cod);
	}
	
}
