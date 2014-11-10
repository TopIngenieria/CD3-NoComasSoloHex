package co.edu.eafit.nocomasolo.application;


import java.util.List;

import co.edu.eafit.nocomasolo.application.to.PostTO;

public interface PostService {

	public PostTO nuevoPost(PostTO post);

	public List<PostTO> verPosts();

}