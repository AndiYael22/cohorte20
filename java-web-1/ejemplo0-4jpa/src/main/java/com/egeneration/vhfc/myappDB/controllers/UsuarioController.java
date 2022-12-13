package com.egeneration.vhfc.myappDB.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.egeneration.vhfc.myappDB.models.UsuarioModel;
import com.egeneration.vhfc.myappDB.services.UsuarioServices;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
@Autowired
UsuarioServices usuarioServicio;
@GetMapping()
		public ArrayList<UsuarioModel> obtenerUsuarios() {
			return usuarioServicio.obtenerUsuarios();
		}
}
