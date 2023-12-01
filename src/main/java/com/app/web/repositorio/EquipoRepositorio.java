package com.app.web.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.web.entidad.Equipo;



@Repository
public interface EquipoRepositorio extends JpaRepository<Equipo, Long>  {

}