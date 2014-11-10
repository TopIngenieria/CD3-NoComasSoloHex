package co.edu.eafit.nocomasolo.post.data.dao;

import java.sql.Connection;
import java.util.List;

import co.edu.eafit.nocomasolo.application.to.PostTO;



public interface PostDAO {

	public int insert(PostTO post);

	public List<PostTO> verPosts();

	public void setConexion(Connection conexion);

	public int delete(PostTO post);

}
