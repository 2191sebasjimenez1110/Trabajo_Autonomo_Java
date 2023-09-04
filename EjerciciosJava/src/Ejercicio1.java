import javax.swing.JOptionPane;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		/*
		 * 1. Realice un algoritmo que use un método 
		 * sin parámetros y sin retorno que imprime en 
		 * pantalla tu nombre completo:
		 */
		
		Ejercicio1 MostrarNombre = new Ejercicio1();
		MostrarNombre.imprimirNombre();
	}

	public void imprimirNombre(){
		String nombre = JOptionPane.showInputDialog("ingrese su nombre completo");
		System.out.println("hola " + nombre);
	}
}
