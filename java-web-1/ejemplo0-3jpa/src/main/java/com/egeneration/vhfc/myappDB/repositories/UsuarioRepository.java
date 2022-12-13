package com.egeneration.vhfc.myappDB.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.egeneration.vhfc.myappDB.models.UsuarioModel;

@Repository
public interface UsuarioRepository extends  CrudRepository<UsuarioModel, Long> {

}
