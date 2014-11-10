package co.edu.eafit.post.domain.repository;

import java.util.List;

import co.edu.eafit.post.domain.entities.Post;

public interface PostRepository {

	public Post buscarPorId(String id);
	public List<Post> traerTodas();
	public int guardar(Post post);
}