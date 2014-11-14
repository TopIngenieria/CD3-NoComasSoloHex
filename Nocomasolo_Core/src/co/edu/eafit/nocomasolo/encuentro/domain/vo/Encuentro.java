package co.edu.eafit.nocomasolo.encuentro.domain.vo;

public class Encuentro {

		public String getLugar(){
			return lugar;
		}
		
		public int getHora(){
			return hora;
		}
		
		public String getpReferencia() {
			return pReferencia;
		}
		
		public Encuentro(String lugar, int hora, String pReferencia) {
			super();
			this.hora = hora;
			this.lugar= lugar;
			this.pReferencia= pReferencia;
		}
		
		private String pReferencia;
		private String lugar;
		private int hora;

	}
