package com.jhomar.ProjectUser2.servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jhomar.ProjectUser2.modelos.Direccion;
import com.jhomar.ProjectUser2.modelos.Usuario;
import com.jhomar.ProjectUser2.repositorios.RepositorioDirecciones;
import com.jhomar.ProjectUser2.repositorios.RepositorioUsuarios;

//Manipula las Queries con funciones 

@Service
public class ServicioUsuarios {
	private final RepositorioUsuarios repositorio_user;
	private final RepositorioDirecciones repositorio_dir;


	public ServicioUsuarios(RepositorioUsuarios repositorio_user, RepositorioDirecciones repositorio_dir) {
		this.repositorio_user = repositorio_user;
		this.repositorio_dir=repositorio_dir;
	}
	
	//Devolvemos todos los usuarios
	public List<Usuario> get_all_users(){
		return repositorio_user.findAll();
	}
	
	
	public List<Direccion> get_all_dirs(){
		return repositorio_dir.findAll();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
