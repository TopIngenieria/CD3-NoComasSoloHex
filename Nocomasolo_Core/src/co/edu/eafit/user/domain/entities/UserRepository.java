package co.edu.eafit.user.domain.entities;

import java.util.List;

import co.edu.eafit.nocomasolo.application.to.UserTO;

public interface UserRepository {
	
	public int save(UserTO user);
	public UserTO buscarPersonaPorNombre(String nombre);
	public List<UserTO> buscarPersonas(List<String> usuarios);

}