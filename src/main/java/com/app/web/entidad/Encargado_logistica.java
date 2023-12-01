package com.app.web.entidad;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "encargado_logistica")
public class Encargado_logistica {
	@Id
	@Column(columnDefinition = "char(8)")
	private String cod_Enc_Log;
	@Column(length = 75)
	private String nom_Enc_Log;
	@Column(length = 75)
	private String ape_Enc_Log;
	@Column(length = 75)
	private String correo_Enc_Log;
	private LocalDate fec_Nac_Enc_Log;
	@Column(columnDefinition = "char(9)")
	private String tel_Enc_Log;
	@Column(length = 20)
	private String usu_Enc_Log;
	@Column(length = 20)
	private String contra_Enc_Log;
	
	public Encargado_logistica() {}

	public Encargado_logistica(String cod_Enc_Log, String nom_Enc_Log, String ape_Enc_Log, String correo_Enc_Log,
			LocalDate fec_Nac_Enc_Log, String tel_Enc_Log, String usu_Enc_Log, String contra_Enc_Log) {
		super();
		this.cod_Enc_Log = cod_Enc_Log;
		this.nom_Enc_Log = nom_Enc_Log;
		this.ape_Enc_Log = ape_Enc_Log;
		this.correo_Enc_Log = correo_Enc_Log;
		this.fec_Nac_Enc_Log = fec_Nac_Enc_Log;
		this.tel_Enc_Log = tel_Enc_Log;
		this.usu_Enc_Log = usu_Enc_Log;
		this.contra_Enc_Log = contra_Enc_Log;
	}

	public String getCod_Enc_Log() {
		return cod_Enc_Log;
	}

	public void setCod_Enc_Log(String cod_Enc_Log) {
		this.cod_Enc_Log = cod_Enc_Log;
	}

	public String getNom_Enc_Log() {
		return nom_Enc_Log;
	}

	public void setNom_Enc_Log(String nom_Enc_Log) {
		this.nom_Enc_Log = nom_Enc_Log;
	}

	public String getApe_Enc_Log() {
		return ape_Enc_Log;
	}

	public void setApe_Enc_Log(String ape_Enc_Log) {
		this.ape_Enc_Log = ape_Enc_Log;
	}

	public String getCorreo_Enc_Log() {
		return correo_Enc_Log;
	}

	public void setCorreo_Enc_Log(String correo_Enc_Log) {
		this.correo_Enc_Log = correo_Enc_Log;
	}

	public LocalDate getFec_Nac_Enc_Log() {
		return fec_Nac_Enc_Log;
	}

	public void setFec_Nac_Enc_Log(LocalDate fec_Nac_Enc_Log) {
		this.fec_Nac_Enc_Log = fec_Nac_Enc_Log;
	}

	public String getTel_Enc_Log() {
		return tel_Enc_Log;
	}

	public void setTel_Enc_Log(String tel_Enc_Log) {
		this.tel_Enc_Log = tel_Enc_Log;
	}

	public String getUsu_Enc_Log() {
		return usu_Enc_Log;
	}

	public void setUsu_Enc_Log(String usu_Enc_Log) {
		this.usu_Enc_Log = usu_Enc_Log;
	}

	public String getContra_Enc_Log() {
		return contra_Enc_Log;
	}

	public void setContra_Enc_Log(String contra_Enc_Log) {
		this.contra_Enc_Log = contra_Enc_Log;
	}
	
	
	
}