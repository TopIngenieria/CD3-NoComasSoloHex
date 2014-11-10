package co.edu.eafit.user.domain.repository;

/**
 * Bean que almacena información del Usuario 
 **/

public class User{

	private int codigo;
	private String nombre;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj instanceof User) {
			User compare = (User) obj;
			return this.codigo == compare.codigo;
		} else {
			return false;
		}
	}

}