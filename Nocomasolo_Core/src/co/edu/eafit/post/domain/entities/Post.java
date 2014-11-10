package co.edu.eafit.post.domain.entities;

/**
 * Bean que almacena información del Post 
 **/
public class Post {
	
	private String id;
	private String lugar;
	private String comentarios;
	private String hora;
	private String pReferencia;
	private boolean bono;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getpReferencia() {
		return pReferencia;
	}

	public void setpReferencia(String pReferencia) {
		this.pReferencia = pReferencia;
	}

	public boolean isBono() {
		return bono;
	}

	public void setBono(boolean bono) {
		this.bono = bono;
	}

}