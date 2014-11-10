package co.edu.eafit.nocomasolo.application;
import java.util.Collections;
import java.util.List;

import co.edu.eafit.nocomasolo.application.to.PostTO;
import co.edu.eafit.nocomasolo.post.data.dao.PostDAO;
import co.edu.eafit.nocomasolo.post.data.dao.factory.FactoryDAO;

public class PostServiceDefault implements PostService{

	private int result;

	public PostServiceDefault() {
	}
	
	/**
	 * Inserta un nuevo post en la base de datos.
	 **/
		public PostTO nuevoPost(PostTO post) {
		FactoryDAO fabrica = new FactoryDAO();
		fabrica.iniciarContextoConexion();
		System.out.println("FabricaDAO....");
		fabrica.iniciarTransaccion();
		PostDAO postDAO = fabrica.crearPostDAO();
		result = postDAO.insert(post);
		fabrica.finalizarTransaccion();
		fabrica.finalizarContextoConexion();
		return post;
	}
	
	/**
	 * Obtiene una lista de posts de la base de datos.
	 **/
	public List<PostTO> verPosts() {
		List<PostTO> result = Collections.emptyList();
		FactoryDAO fabrica = new FactoryDAO();
		fabrica.iniciarContextoConexion();
		fabrica.iniciarTransaccion();
		PostDAO postDAO = fabrica.crearPostDAO();
		result = postDAO.verPosts();
		fabrica.finalizarTransaccion();
		fabrica.finalizarContextoConexion();
		return result;
	}
}