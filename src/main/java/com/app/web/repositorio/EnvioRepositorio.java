package com.app.web.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.web.entidad.Envio;



@Repository
public interface EnvioRepositorio extends JpaRepository<Envio, Long>  {

}