package co.edu.eafit.nocomasolo.publicacion.data.dao.mongo;

import java.sql.Connection;
import java.util.List;

import co.edu.eafit.nocomasolo.publicacion.domain.entities.Publicacion;


public interface PublicacionDAO {

	public int insert(Publicacion publicacion);
	public List<Publicacion> verPublicaciones();
	public int delete(Publicacion publicacion);
	public void setConexion(Connection con);

}


