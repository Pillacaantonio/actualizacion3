package com.app.web.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "equipo")
public class Equipo {
	@Id
	@Column(columnDefinition = "char(6)")
	private String cod_Equipo;
	@Column(length = 50)

	private String marca_Equipo;
	@Column(length = 125)
	private String modelo_Equipo;
	
	public Equipo() {}

	@Override
	public String toString() {
		return "Equipo [cod_Equipo=" + cod_Equipo + ", estado_Equipo=" + ", marca_Equipo="
				+ marca_Equipo + ", modelo_Equipo=" + modelo_Equipo + "]";
	}

	public Equipo(String cod_Equipo, String estado_Equipo, String marca_Equipo, String modelo_Equipo) {
		super();
		this.cod_Equipo = cod_Equipo;
		this.marca_Equipo = marca_Equipo;
		this.modelo_Equipo = modelo_Equipo;
	}

	public String getCod_Equipo() {
		return cod_Equipo;
	}

	public void setCod_Equipo(String cod_Equipo) {
		this.cod_Equipo = cod_Equipo;
	}




	public String getMarca_Equipo() {
		return marca_Equipo;
	}

	public void setMarca_Equipo(String marca_Equipo) {
		this.marca_Equipo = marca_Equipo;
	}

	public String getModelo_Equipo() {
		return modelo_Equipo;
	}

	public void setModelo_Equipo(String modelo_Equipo) {
		this.modelo_Equipo = modelo_Equipo;
	}

	
	
}

	
	
	
	
	


