package co.edu.eafit.nocomasolo.adapters.rest;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.ViewScoped;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import co.edu.eafit.nocomasolo.application.PostService;
import co.edu.eafit.nocomasolo.application.PostServiceDefault;
import co.edu.eafit.nocomasolo.application.to.PostTO;


//import co.edu.eafit.nocomasolo.business.bc.PostBusiness;
//import co.edu.eafit.nocomasolo.business.bc.impl.PostBusinessDefault;

/*
 * Clase que se encarga de la conexión entre el front-end
 * y el back-end para listar los post existentes.
 */

@ManagedBean
@ViewScoped

public class PostView implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private List<PostTO> posts;

    @PostConstruct
    public void init() {
    	PostService ps = new PostServiceDefault();
    	setPosts(ps.verPosts());
    }

	public List<PostTO> getPosts() {
		return posts;
	}

	public void setPosts(List<PostTO> posts) {
		this.posts = posts;
	}

}


