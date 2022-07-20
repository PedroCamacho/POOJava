package ejemplo2;

public class Texto {
	private String cadena ;

	public Texto(String cadena) {
		this.cadena = cadena;
	}
	
	public Texto () {
		this.cadena="";
	}

	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}
	
	public String letras (int una) {
		return String.valueOf(cadena.charAt(una));
	}
	
	public String letras (int una, int dos) {
		return cadena.charAt(una) + " " + cadena.charAt(dos);
	}

}
