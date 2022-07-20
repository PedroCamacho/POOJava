package ejemplo2;

public class PruebaTexto {

	public static void main(String[] args) {
		Texto palabra1 = new Texto("Hola");
		Texto palabra2 = new Texto();
		palabra2.setCadena("Mundo");
		System.out.println(palabra1.letras(1));
		System.out.println(palabra2.letras (2,3));
	}
}
