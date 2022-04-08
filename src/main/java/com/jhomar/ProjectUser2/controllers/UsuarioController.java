package com.jhomar.ProjectUser2.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jhomar.ProjectUser2.modelos.Usuario;
import com.jhomar.ProjectUser2.repositorios.RepositorioUsuarios;
import com.jhomar.ProjectUser2.servicios.ServicioUsuarios;

@Controller
public class UsuarioController {
	
	private final ServicioUsuarios servicio_user;
	
	public UsuarioController(ServicioUsuarios servicio_user) {
		super();
		this.servicio_user = servicio_user;
	}

	@RequestMapping("/")
	public String index(Model model) {
		List<Usuario> usuarios = servicio_user.get_all_users();
		model.addAttribute("usuarios",usuarios);
		return "index.jsp";
	}
}
