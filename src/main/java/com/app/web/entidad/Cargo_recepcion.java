package com.app.web.entidad;

import java.time.LocalDate;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "cargo_recepcion")
public class Cargo_recepcion {
	@Id
	@Column(columnDefinition = "char(6)")
	private String cod_Car_Recep;	
	@Column(columnDefinition = "char(6)")
	private String cod_Soli_Eq;
	private LocalDate fec_Carg_Recep;
	
	@ManyToOne
	@JoinColumn(name = "cod_Soli_Eq", insertable = false, updatable = false)
	private Solicitud_equipo objSoliEq;

	public Cargo_recepcion() {}

	public Cargo_recepcion(String cod_Car_Recep, String cod_Soli_Eq, LocalDate fec_Carg_Recep,
			Solicitud_equipo objSoliEq) {
		super();
		this.cod_Car_Recep = cod_Car_Recep;
		this.cod_Soli_Eq = cod_Soli_Eq;
		this.fec_Carg_Recep = fec_Carg_Recep;
		this.objSoliEq = objSoliEq;
	}

	public String getCod_Car_Recep() {
		return cod_Car_Recep;
	}

	public void setCod_Car_Recep(String cod_Car_Recep) {
		this.cod_Car_Recep = cod_Car_Recep;
	}

	public String getCod_Soli_Eq() {
		return cod_Soli_Eq;
	}

	public void setCod_Soli_Eq(String cod_Soli_Eq) {
		this.cod_Soli_Eq = cod_Soli_Eq;
	}

	public LocalDate getFec_Carg_Recep() {
		return fec_Carg_Recep;
	}

	public void setFec_Carg_Recep(LocalDate fec_Carg_Recep) {
		this.fec_Carg_Recep = fec_Carg_Recep;
	}

	public Solicitud_equipo getObjSoliEq() {
		return objSoliEq;
	}

	public void setObjSoliEq(Solicitud_equipo objSoliEq) {
		this.objSoliEq = objSoliEq;
	}

}

