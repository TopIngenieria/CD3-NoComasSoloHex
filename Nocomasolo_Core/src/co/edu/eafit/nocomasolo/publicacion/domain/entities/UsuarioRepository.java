package co.edu.eafit.nocomasolo.publicacion.domain.entities;


public interface UsuarioRepository {

		public void crearUsuario(Usuario usuario);
		public void adicionarPublicacion(Usuario usuario, Publicacion publicacion);
		//public Cuidador recuperarCuidador(CuidadorTO cuidadorId);
		//public List<Publicacion> traerPublicacion(List<Publicacion> PublicacionId);
	
}
