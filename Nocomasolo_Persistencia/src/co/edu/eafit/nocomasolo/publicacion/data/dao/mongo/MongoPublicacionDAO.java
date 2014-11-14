package co.edu.eafit.nocomasolo.publicacion.data.dao.mongo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collections;
import java.util.List;

import co.edu.eafit.nocomasolo.publicacion.domain.entities.Publicacion;
/**
 * Clase que realiza la gestión de datos con Mongo.
 */

public class MongoPublicacionDAO implements PublicacionDAO {

	private Connection connection;
	
	@Override
	public int insert(Publicacion publicacion) {
		int retorno = 0;
		String sql = "INSERT INTO post(id, comentarios, bono) VALUES(?,?,?)";
		try {
			PreparedStatement pstmt = this.connection.prepareStatement(sql);pstmt.setString(1, publicacion.getId());
			pstmt.setString(2, publicacion.getComentarios());
			pstmt.setBoolean(3, publicacion.isBono());
			retorno = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return retorno;
	}

	@Override
	public int delete(Publicacion publicacion) {
		return 0;
	}

	@Override
	public List<Publicacion> verPublicaciones() {
		return null;
	}

	@Override
	public void setConexion(Connection con) {
		// TODO Auto-generated method stub
		
	}

}