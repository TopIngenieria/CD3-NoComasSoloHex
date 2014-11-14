package co.edu.eafit.nocomasolo.publicacion.domain.entities;

import co.edu.eafit.nocomasolo.encuentro.domain.vo.Encuentro;

/**
 * Bean que almacena información del Post 
 **/

public class Publicacion {
	
	private String id;
	private String comentarios;
	private boolean bono;
	private Encuentro encuentro;
	private Publicacion publicacion;
	public String getId() {
		return id;
	}
	
	public String setComentarios() {
		return comentarios;
	}
	
	public String getComentarios() {
		return comentarios;
	}
	
	public boolean isBono() {
		return bono;
	}

	public Encuentro setEncuentro() {
		return encuentro;
	}

	
	public Encuentro getEncuentro() {
		return encuentro;
	}
	
	public Publicacion getPublicacion() {
		return publicacion;
	}

	public Publicacion(String id, String comentarios, boolean bono, Encuentro encuentro) {
		super();
		this.id=id;
		this.comentarios=comentarios;
		this.bono=bono;
		this.encuentro=encuentro;
	}


	public void setBono(boolean boolean1) {
		// TODO Auto-generated method stub
		
	}
}