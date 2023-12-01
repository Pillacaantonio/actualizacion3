package com.app.web.entidad;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "solicitud_equipo")
public class Solicitud_equipo {
	@Id
	@Column(columnDefinition = "char(6)")
	private String cod_Soli_Eq;
	@Column(columnDefinition = "char(8)")
	private String cod_Sol;
	@Column(columnDefinition = "char(6)")
	private String cod_Equipo;
	@Column(columnDefinition = "char(8)")
	private String cod_Enc_Log;
	@Column(length = 50)
	private String estado_Soli_Eq;
	
	@ManyToOne
	@JoinColumn(name = "cod_Sol", insertable = false, updatable = false)
	private Solicitante objSol;
	
	@ManyToOne
	@JoinColumn(name = "cod_Equipo", insertable = false, updatable = false)
	private Equipo objEquipo; 
	
	@ManyToOne
	@JoinColumn(name = "cod_Enc_Log", insertable = false, updatable = false)
	private Encargado_logistica objEncLog;

	public Solicitud_equipo() {}

	public Solicitud_equipo(String cod_Soli_Eq, String cod_Sol, String cod_Equipo, String cod_Enc_Log,
			String estado_Soli_Eq, Solicitante objSol, Equipo objEquipo, Encargado_logistica objEncLog) {
		super();
		this.cod_Soli_Eq = cod_Soli_Eq;
		this.cod_Sol = cod_Sol;
		this.cod_Equipo = cod_Equipo;
		this.cod_Enc_Log = cod_Enc_Log;
		this.estado_Soli_Eq = estado_Soli_Eq;
		this.objSol = objSol;
		this.objEquipo = objEquipo;
		this.objEncLog = objEncLog;
	}

	public String getCod_Soli_Eq() {
		return cod_Soli_Eq;
	}

	public void setCod_Soli_Eq(String cod_Soli_Eq) {
		this.cod_Soli_Eq = cod_Soli_Eq;
	}

	public String getCod_Sol() {
		return cod_Sol;
	}

	public void setCod_Sol(String cod_Sol) {
		this.cod_Sol = cod_Sol;
	}

	public String getCod_Equipo() {
		return cod_Equipo;
	}

	public void setCod_Equipo(String cod_Equipo) {
		this.cod_Equipo = cod_Equipo;
	}

	public String getCod_Enc_Log() {
		return cod_Enc_Log;
	}

	public void setCod_Enc_Log(String cod_Enc_Log) {
		this.cod_Enc_Log = cod_Enc_Log;
	}

	public String getEstado_Soli_Eq() {
		return estado_Soli_Eq;
	}

	public void setEstado_Soli_Eq(String estado_Soli_Eq) {
		this.estado_Soli_Eq = estado_Soli_Eq;
	}

	public Solicitante getObjSol() {
		return objSol;
	}

	public void setObjSol(Solicitante objSol) {
		this.objSol = objSol;
	}

	public Equipo getObjEquipo() {
		return objEquipo;
	}

	public void setObjEquipo(Equipo objEquipo) {
		this.objEquipo = objEquipo;
	}

	public Encargado_logistica getObjEncLog() {
		return objEncLog;
	}

	public void setObjEncLog(Encargado_logistica objEncLog) {
		this.objEncLog = objEncLog;
	}

	
	
}