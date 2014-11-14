package co.edu.eafit.nocomasolo.publicacion.domain.entities;

import java.util.List;

import co.edu.eafit.nocomasolo.encuentro.domain.vo.Encuentro;


/**
 * Bean que almacena información del Usuario 
 **/

public class Usuario{

	public int codigo;
	private String nombre;
	private String correo;
	private String idiomas;
	private String pregrado;
	private List<Publicacion> post;	

	public int getCodigo() {
		return codigo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getCorreo() {
		return correo;
	}

	public String getIdiomas() {
		return idiomas;
	}

	public String getPregrado() {
		return pregrado;
	}
	public List<Publicacion> getPost() {
		return post;
	}	

	public Usuario (int id, String nombre, String correo, String idiomas, String pregrado, List<Publicacion>post,
			Encuentro encuentro) {
		super();
		this.nombre = nombre;
		this.correo = correo;
		this.idiomas= idiomas;
		this.pregrado =pregrado;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj instanceof Usuario) {	
			Usuario compare = (Usuario) obj;
			return this.codigo == compare.codigo;
		} else {
			return false;
		}
	}

	
}