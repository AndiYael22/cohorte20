package com.egeneration.vhfc.myappDB.services;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.egeneration.vhfc.myappDB.models.UsuarioModel;
import com.egeneration.vhfc.myappDB.repositories.UsuarioRepository;

@Service
public class UsuarioServices {
	@Autowired
UsuarioRepository usuarioRepositorio;
	public ArrayList <UsuarioModel> obtenerUsuarios() {
		return  (ArrayList<UsuarioModel>) usuarioRepositorio.findAll();
		
	}
	public UsuarioModel guardarUsuario(UsuarioModel usuario) {
		return usuarioRepositorio.save(usuario);
	}
}
