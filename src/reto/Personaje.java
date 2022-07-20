package reto;

public class Personaje {
	private String nombre;
	private boolean esBueno;
	
	public Personaje(String nombre, boolean esBueno) {
		this.nombre = nombre;
		this.esBueno = esBueno;
	}

	public boolean getEsBueno() {
		return esBueno;
	}

	public void setEsBueno(boolean esBueno) {
		this.esBueno = esBueno;
	}

	public void recibeDisparo() {
		esBueno = !esBueno;
	}
	
	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", esBueno=" + esBueno + "]";
	}
	
}
