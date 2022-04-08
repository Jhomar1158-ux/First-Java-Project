package com.jhomar.ProjectUser2.repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jhomar.ProjectUser2.modelos.Direccion;

@Repository
public interface RepositorioDirecciones extends CrudRepository<Direccion, Long>{
	List<Direccion> findAll();
	Direccion save(Direccion nuevaDireccion);

}
