package co.edu.eafit.nocomasolo.to;

public class UsuarioTO {

		private String nombre;
		private int codigo;
		private String correo;
		private String idiomas;
		private String pregrado;
		
		public UsuarioTO() {
			
		}
		
		public UsuarioTO(String nombre, int codigo, String correo, String idiomas, String pregrado) {
			this.nombre=nombre;
			this.setCodigo(codigo);
			this.correo=correo;
			this.idiomas=idiomas;
			this.pregrado=pregrado;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre=nombre;
		}

		public String getCorreo() {
			return correo;
		}

		public void setCorreo(String correo) {
			this.correo=correo;
		}

		public String getIdiomas() {
			return idiomas;
		}

		public void setIdiomas(String idiomas) {
			this.idiomas=idiomas;
		}

		public String getPregrado() {
			return pregrado;
		}

		public void setPregrado(String pregrado) {
			this.pregrado=pregrado;
		}

		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}
}
