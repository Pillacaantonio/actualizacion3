package com.app.web.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.web.entidad.Solicitante;

@Repository
public interface SolictanteRepositorio extends JpaRepository<Solicitante, Long>  {

}

