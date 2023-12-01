package com.app.web.interfaceService;

import java.util.List;
import java.util.Optional;

import com.app.web.entidad.Reclamos;


public interface IReclamosService {
	public List<Reclamos>listarReclamos();
	public Optional<Reclamos> buscarCodRec(int cod);
	public int registrarReclamo(Reclamos r);
	public void eliminarReclamo(int cod);
}
