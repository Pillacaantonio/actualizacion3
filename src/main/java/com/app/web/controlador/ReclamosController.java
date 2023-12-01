package com.app.web.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.app.web.entidad.Cargo_recepcion;
import com.app.web.entidad.Encargado_logistica;
import com.app.web.entidad.Reclamos;
import com.app.web.entidad.Tipo_reclamo;
import com.app.web.interfaceService.ICargo_recepcionService;
import com.app.web.interfaceService.IEncargado_logisticaService;
import com.app.web.interfaceService.IReclamosService;
import com.app.web.interfaceService.ITipo_reclamoService;

@Controller
@RequestMapping
public class ReclamosController {
	@Autowired
	private IReclamosService recService;
	@Autowired
	private ITipo_reclamoService tipRecService;
	@Autowired
	private ICargo_recepcionService carRecepService;
	@Autowired
	private IEncargado_logisticaService encLogService;
	
	//almacena el último código de reclamo registrado
	private int ultimoCod;
	
	@GetMapping("/listarReclamos")
	public String listarRec(Model modelo) {
		List<Reclamos> reclamos = recService.listarReclamos();
		modelo.addAttribute("reclamosListado", reclamos);
		
		//obtener el último código
		Reclamos ultimo= reclamos.get(reclamos.size()-1);
		ultimoCod = ultimo.getCod_Rec() + 1;
		
		return "ListadoReclamos";
	}
	
	//nuevo reclamo 
	@GetMapping("/nuevoreclamo")
	public String formCrear(Model modelo) {
		Reclamos reclamo = new Reclamos();
		reclamo.setCod_Rec(ultimoCod);
		modelo.addAttribute("reclamo",reclamo);
		
		//listados para los combobox
		List<Tipo_reclamo> tiposReclamos = tipRecService.listarTipo_reclamo();
		modelo.addAttribute("tipos_reclamos", tiposReclamos);
		
		List<Cargo_recepcion> cargosRecep = carRecepService.listarCargo_recepcion();
		modelo.addAttribute("cargos_recepcion", cargosRecep);
		
		List<Encargado_logistica> encargadosLog = encLogService.listarEncargado_logistica();
		modelo.addAttribute("encargados_logistica", encargadosLog);
		
		return "formularioReclamos";
	}
		
	//registrar/guardar
	@PostMapping("/registrarRec")
	public String registrarRec( Reclamos rec) {
		recService.registrarReclamo(rec);
		return "redirect:/listarReclamos";
	}


	//editar
	@GetMapping("/editar/{cod}")
	public String editarReclamo(@PathVariable int cod,Model modelo) {
		Optional<Reclamos> reclamo = recService.buscarCodRec(cod);
		modelo.addAttribute("reclamo", reclamo);
		
		//listados para los combobox
		List<Tipo_reclamo> tiposReclamos = tipRecService.listarTipo_reclamo();
		modelo.addAttribute("tipos_reclamos", tiposReclamos);
		
		List<Cargo_recepcion> cargosRecep = carRecepService.listarCargo_recepcion();
		modelo.addAttribute("cargos_recepcion", cargosRecep);
		
		List<Encargado_logistica> encargadosLog = encLogService.listarEncargado_logistica();
		modelo.addAttribute("encargados_logistica", encargadosLog);
		
		return "formularioReclamos";
	}
	
	//editar
		@GetMapping("/detalle/{cod}")
		public String detalleReclamo(@PathVariable int cod,Model modelo) {
			Optional<Reclamos> reclamo = recService.buscarCodRec(cod);
			
			String nombrecompleto = reclamo.get().getObjEncLog().getNom_Enc_Log()+" "+reclamo.get().getObjEncLog().getApe_Enc_Log();
			modelo.addAttribute("nombreEncargado", nombrecompleto);			
			modelo.addAttribute("reclamo", reclamo);
			
			return "formDetalleRec";
		}
	

	//eliminar
	@GetMapping("/eliminar/{cod}")
	public String elimnarReclamo(@PathVariable int cod) {
		recService.eliminarReclamo(cod);
		return "redirect:/listarReclamos";
	}
}

