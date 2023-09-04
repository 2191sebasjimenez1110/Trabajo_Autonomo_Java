import java.util.HashMap;

import javax.swing.JOptionPane;


public class Ejercicio7 {
	public static void main(String[] args) {
		Ejercicio7 run = new Ejercicio7();
		run.iniciar();
	}
	
	String palabra,opcion,eleccion;
	public void iniciar() {
		menu();
	}
	
	public void menu() {
		opcion = "desea ver otra palabra";
		opcion += "\n 1. Si";
		opcion += "\n 2. No";
		opcion += "\nIngrese una opcion:";
		do {
			diccionario();
			eleccion = JOptionPane.showInputDialog(opcion);
		} while (!eleccion.equals("2"));
		System.out.println("gracia por utilizar nuestro diccionario");
	}
	
	public void diccionario() {
		HashMap<String, String> diccionarioIngles = new HashMap<String, String>();
		diccionarioIngles.put("hello","hola");
		diccionarioIngles.put("love","amor");
		diccionarioIngles.put("cat","gato");
		diccionarioIngles.put("dog","perro");
		diccionarioIngles.put("water","agua");
		diccionarioIngles.put("tree","arbol");
		
		palabra = JOptionPane.showInputDialog("ingrese la palabra que desea buscara");
		validarExistencia(diccionarioIngles, palabra);
	}
	
	public void validarExistencia(HashMap<String, String> diccionarioIngles, String palabra) {
		if (diccionarioIngles.containsKey(palabra)) {
			System.out.println("la palabra: " + palabra + " Traduce: " +  diccionarioIngles.get(palabra));
		} else {
			System.out.println("la palabra: " + palabra + " no se necuntra en el diccionario");
		}
	}
}
