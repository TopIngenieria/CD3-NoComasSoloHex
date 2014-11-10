package co.edu.eafit.nocomasolo.post.data.dao.mongo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import co.edu.eafit.nocomasolo.application.to.PostTO;
import co.edu.eafit.nocomasolo.post.data.dao.PostDAO;

/**
 * Clase que realiza la gestión de datos con Mongo.
 */
public class MongoPostDAO implements PostDAO {

	private Connection connection;

	@Override
	public List<PostTO> verPosts() {
		List<PostTO> posts = Collections.emptyList();
		Statement stmt;
		try {
			stmt = this.connection.createStatement();
			String sql = "SELECT * FROM post";
			ResultSet resultSet = stmt.executeQuery(sql);
			posts = new ArrayList<PostTO>();
			while (resultSet.next()) {
				PostTO aPost = new PostTO();
				aPost.setId(resultSet.getString("id"));
				aPost.setLugar(resultSet.getString("lugar"));
				aPost.setComentarios(resultSet.getString("comentarios"));
				aPost.setHora(resultSet.getString("hora"));
				aPost.setpReferencia(resultSet.getString("pReferencia"));
				aPost.setBono(resultSet.getBoolean("bono")); //Este es un booleano. El get es isBool
				posts.add(aPost);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return posts;
	}

	@Override
	public void setConexion(Connection conexion) {
		this.connection = conexion;
		System.out.println("Conexion configurada...");
	}

	@Override
	public int insert(PostTO post) {
		int retorno = 0;
		String sql = "INSERT INTO post(id, lugar, comentarios, hora, pReferencia, bono) VALUES(?,?,?,?,?,?)"; //EL 6 valor es un bool
		try {
			PreparedStatement pstmt = this.connection.prepareStatement(sql);
			pstmt.setString(1, post.getId());
			pstmt.setString(2, post.getLugar());
			pstmt.setString(3, post.getComentarios());
			pstmt.setString(4, post.getHora());
			pstmt.setString(5, post.getpReferencia());
			pstmt.setBoolean(6, post.isBono());
			retorno = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return retorno;
	}

	@Override
	public int delete(PostTO post) {
		return 0;
	}

}