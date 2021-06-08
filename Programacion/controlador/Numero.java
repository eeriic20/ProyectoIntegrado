package controlador;

public class Numero {

	public static boolean esNumero(String n) {

		try {

			Integer.parseInt(n);

			return true;

		} catch (NumberFormatException nfe) {

			return false;
		}
	}

}
