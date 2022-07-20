package ejemplo3;

import java.util.Arrays;

class Rueda {
	private int perfil;
	private int anchura;

	public Rueda() {
		perfil = 65;
		anchura = 185;
	}

	public int getPerfil() {
		return perfil;
	}

	public void setPerfil(int perfil) {
		this.perfil = perfil;
	}

	public int getAnchura() {
		return anchura;
	}

	public void setAnchura(int anchura) {
		this.anchura = anchura;
	}

	@Override
	public String toString() {
		return "Rueda [perfil=" + perfil + ", anchura=" + anchura + "]";
	}
	
}

public class Coche {
	private Rueda[] ruedas;
	private int cilindrada;

	public Coche(int numRuedas, int cilindrada) {
		this.cilindrada = cilindrada;
		this.ruedas = new Rueda[numRuedas];
		for (int i = 0; i < numRuedas; i++)
			ruedas[i] = new Rueda();
	}

	@Override
	public String toString() {
		return "Coche [cilindrada=" + cilindrada + ",\nruedas=" + Arrays.toString(ruedas) + "]";
	}
	
}
