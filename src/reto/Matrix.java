package reto;

public class Matrix {

	public static void main(String[] args) {
		Personaje neo = new Personaje ("Neo",true);
		Personaje trinity = new Personaje ("Trinity", true);
		Personaje agente = new Personaje ("Agente Smith",false);
		
		trinity.recibeDisparo();
		agente.recibeDisparo();
		
		System.out.println(neo);
		System.out.println(trinity);
		System.out.println(agente);
	}
}
