package com.app.web.entidad;

import java.util.Date;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "reclamo")
public class Reclamos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cod_Rec;
	@Column(columnDefinition = "datetime")
	private Date fec_Rec;
	@Column(columnDefinition = "char(2)")
	private String cod_Tipo_Rec;
	private String desc_Rec;
	@Column(columnDefinition = "char(6)")
	private String cod_Car_Recep;
	@Column(columnDefinition = "char(8)")
	private String cod_Enc_Log;

	@ManyToOne
	@JoinColumn(name = "cod_Tipo_Rec", insertable = false, updatable = false)
	private Tipo_reclamo objTipoReclamo;
	
	@ManyToOne
	@JoinColumn(name = "cod_Car_Recep", insertable = false, updatable = false)
	private Cargo_recepcion objCarRecep;
	
	@ManyToOne
	@JoinColumn(name = "cod_Enc_Log", insertable = false, updatable = false)
	private Encargado_logistica objEncLog;
	
	public Reclamos() {
		fec_Rec = new Date();
	}

	public Reclamos(int cod_Rec, Date fec_Rec, String cod_Tipo_Rec, String desc_Rec, String cod_Car_Recep,
			String cod_Enc_Log, Tipo_reclamo objTipoReclamo, Cargo_recepcion objCarRecep,
			Encargado_logistica objEncLog) {
		super();
		this.cod_Rec = cod_Rec;
		this.fec_Rec = fec_Rec;
		this.cod_Tipo_Rec = cod_Tipo_Rec;
		this.desc_Rec = desc_Rec;
		this.cod_Car_Recep = cod_Car_Recep;
		this.cod_Enc_Log = cod_Enc_Log;
		this.objTipoReclamo = objTipoReclamo;
		this.objCarRecep = objCarRecep;
		this.objEncLog = objEncLog;
	}

	public int getCod_Rec() {
		return cod_Rec;
	}

	public void setCod_Rec(int cod_Rec) {
		this.cod_Rec = cod_Rec;
	}

	public Date getFec_Rec() {
		return fec_Rec;
	}

	public void setFec_Rec(Date fec_Rec) {
		this.fec_Rec = fec_Rec;
	}

	public String getCod_Tipo_Rec() {
		return cod_Tipo_Rec;
	}

	public void setCod_Tipo_Rec(String cod_Tipo_Rec) {
		this.cod_Tipo_Rec = cod_Tipo_Rec;
	}

	public String getDesc_Rec() {
		return desc_Rec;
	}

	public void setDesc_Rec(String desc_Rec) {
		this.desc_Rec = desc_Rec;
	}

	public String getCod_Car_Recep() {
		return cod_Car_Recep;
	}

	public void setCod_Car_Recep(String cod_Car_Recep) {
		this.cod_Car_Recep = cod_Car_Recep;
	}

	public String getCod_Enc_Log() {
		return cod_Enc_Log;
	}

	public void setCod_Enc_Log(String cod_Enc_Log) {
		this.cod_Enc_Log = cod_Enc_Log;
	}

	public Tipo_reclamo getObjTipoReclamo() {
		return objTipoReclamo;
	}

	public void setObjTipoReclamo(Tipo_reclamo objTipoReclamo) {
		this.objTipoReclamo = objTipoReclamo;
	}

	public Cargo_recepcion getObjCarRecep() {
		return objCarRecep;
	}

	public void setObjCarRecep(Cargo_recepcion objCarRecep) {
		this.objCarRecep = objCarRecep;
	}

	public Encargado_logistica getObjEncLog() {
		return objEncLog;
	}

	public void setObjEncLog(Encargado_logistica objEncLog) {
		this.objEncLog = objEncLog;
	}
	
	
		
}
