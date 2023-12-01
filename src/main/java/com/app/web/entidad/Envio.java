package com.app.web.entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "envio")
public class Envio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cod_envio;

    @ManyToOne
    @JoinColumn(name = "id") 
    private Solicitante solicitante;

    @ManyToOne
    @JoinColumn(name = "cod_equipo")
    private Equipo equipo;
    private String destino;
    private String nom_Otro;

    public Envio() {}
   
	public Envio(Long cod_envio, Solicitante solicitante, Equipo equipo, String destino, String nom_Otro) {
		super();
		this.cod_envio = cod_envio;
		this.solicitante = solicitante;
		this.equipo = equipo;
		this.destino = destino;
		this.nom_Otro = nom_Otro;
	}
    
	public Long getCod_envio() {
		return cod_envio;
	}
	public void setCod_envio(Long cod_envio) {
		this.cod_envio = cod_envio;
	}
	public Solicitante getSolicitante() {
		return solicitante;
	}
	public void setSolicitante(Solicitante solicitante) {
		this.solicitante = solicitante;
	}
	public Equipo getEquipo() {
		return equipo;
	}
	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getNom_Otro() {
		return nom_Otro;
	}
	public void setNom_Otro(String nom_Otro) {
		this.nom_Otro = nom_Otro;
	}	
}