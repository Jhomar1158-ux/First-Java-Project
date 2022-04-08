package com.jhomar.ProjectUser2.repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jhomar.ProjectUser2.modelos.Usuario;


//Conexión a la base de datos

//Debo agregarlo para que reconozca las clases!
@Repository
public interface RepositorioUsuarios extends CrudRepository<Usuario, Long>{
	List<Usuario> findAll();//SELECT * FROM users
	List<Usuario> findByEmail(String email);
	List<Usuario> findById(long id);
	
	//INSERT into...
	Usuario save(Usuario nuevoUsuario);
	
	void deleteById(Long id);
	
	//SELECT * FROM users WHERE email= '<EMAIL>' AND password = '<PASSWORD>'
	List<Usuario> findByEmailAndPassword(String email, String password); 

	List<Usuario> findByDireccionIdIsNull();

}
