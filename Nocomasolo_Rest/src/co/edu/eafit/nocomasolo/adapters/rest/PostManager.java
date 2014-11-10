package co.edu.eafit.nocomasolo.adapters.rest;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import co.edu.eafit.nocomasolo.application.PostService;
import co.edu.eafit.nocomasolo.application.PostServiceDefault;
import co.edu.eafit.nocomasolo.application.to.PostTO;


/*
 * Clase que se encarga de la conexión entre el front-end
 * y el back-end para crear nuevos post.
 */

@ManagedBean
public class PostManager implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private PostTO postData;

	public PostManager() {
		postData = new PostTO();
	}
	
	/*
	 * Obtiene los datos de post de la interfaz y los guarda
	 * 
	 * */
	
	public void salvar(ActionEvent evento) {
		PostService postPS = new PostServiceDefault();
		PostTO post = new PostTO();
		post.setLugar(postData.getLugar());
		post.setComentarios(postData.getComentarios());
		post.setHora(postData.getHora());
		post.setpReferencia(postData.getpReferencia());
		post.setBono(postData.isBono());
		postPS.nuevoPost(post);
	}

	public PostTO getPostData() {
		return postData;
	}

	public void setPostData(PostTO postData) {
		this.postData = postData;
	}
	

	/* Notificación de que el post se ha creado */
	public void execute() {
		FacesContext.getCurrentInstance()
				.addMessage(
						null,
						new FacesMessage(FacesMessage.SEVERITY_INFO,
								"Post Creado", ""));}

}
