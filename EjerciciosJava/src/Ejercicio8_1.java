import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class Ejercicio8_1 {
	public static void main(String[] args) {
		Ejercicio8_1 misProcesos = new Ejercicio8_1();
	}
	
	HashMap<String, ArrayList<Double>> notasEstudiantesMap;
	int cantEst;
	
	public Ejercicio8_1(){
		notasEstudiantesMap=new HashMap<String, ArrayList<Double>>();
		iniciar();	
		}
	
	public void iniciar() {
		cantEst=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes"));
		llenarMapa();
		imprimirMapa();
		consultarEstudiante();
	}
	
	private void consultarEstudiante() {
		String nombreConsulta=JOptionPane.showInputDialog("Ingrese el nombre del estudiante a consultar");
		if (notasEstudiantesMap.containsKey(nombreConsulta)) {
			ArrayList<Double> listaNotasTemp=notasEstudiantesMap.get(nombreConsulta);
			System.out.println("Nombre: "+nombreConsulta);
			
			double sum=0;
			System.out.println("Lista de notas: ");
			for (int i = 0; i < listaNotasTemp.size(); i++) {
				System.out.print(listaNotasTemp.get(i)+",");
				sum+=listaNotasTemp.get(i);
			}
			
			double prom=sum/listaNotasTemp.size();
			System.out.println("\nEl Promedio es: "+prom);
		}else {
			System.out.println("No encuentra el estudiante: "+nombreConsulta);
		}
	
	}

	private void imprimirMapa() {
		System.out.println(notasEstudiantesMap);
	}

	private void llenarMapa() {
		ArrayList<Double> notasList;
		String nombre;
		for (int i = 0; i < cantEst; i++) {
			nombre=JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
			notasList=new ArrayList<Double>();
			double nota;
			for (int j = 0; j < 3; j++) {
				nota=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota "+(j+1)+" Para "+nombre));
				notasList.add(nota);
			}
			System.out.println(nombre+"="+notasList);
			notasEstudiantesMap.put(nombre, notasList);
		}
	}
}
