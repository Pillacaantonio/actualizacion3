package com.app.web.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipo_reclamo")
public class Tipo_reclamo {
	@Id
	@Column(columnDefinition = "char(2)")
	private String cod_Tipo_Rec;
	@Column(length = 50)
	private String desc_Tipo_Rec;
	
	public Tipo_reclamo() {}

	public Tipo_reclamo(String cod_Tipo_Rec, String desc_Tipo_Rec) {
		super();
		this.cod_Tipo_Rec = cod_Tipo_Rec;
		this.desc_Tipo_Rec = desc_Tipo_Rec;
	}

	public String getCod_Tipo_Rec() {
		return cod_Tipo_Rec;
	}

	public void setCod_Tipo_Rec(String cod_Tipo_Rec) {
		this.cod_Tipo_Rec = cod_Tipo_Rec;
	}

	public String getDesc_Tipo_Rec() {
		return desc_Tipo_Rec;
	}

	public void setDesc_Tipo_Rec(String desc_Tipo_Rec) {
		this.desc_Tipo_Rec = desc_Tipo_Rec;
	}
	
	
	
}
