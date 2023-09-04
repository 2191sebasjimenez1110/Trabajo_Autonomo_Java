import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JOptionPane;


public class Ejercicio8 {
	public static void main(String[] args) {
		Ejercicio8 run = new Ejercicio8();
		run.iniciar();
	}
	String menu, opc, nombre, lista, titulo;
	Double nota;
	Integer count = 0;
	HashMap<String, Double> listaNotas = new HashMap<String, Double>();
	public void iniciar() {
		menu();
	}
	
	public void menu() {
		do {
			menu = "------- Menu Principal ------";
			menu += "\n1.Ingresar Alumnos y Asignar Notas";
			menu += "\n2. Imprimir Lista Alumnos";
			menu += "\n3.Consultar Notas";
			menu += "\n4.Eliminar Estudiante";
			menu += "\n5.Salir";
			menu += "\nIngrese una opcion";	
			opc = JOptionPane.showInputDialog(menu);
			acciones(opc);
		} while (!opc.equals("5"));
		
	}

	private void acciones(String opcion) {
		switch (opcion) {
		case "1":
			int opc2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de alumnos"));
			for (int i = 0; i < opc2 ; i++) {
				nombre = JOptionPane.showInputDialog("ingrese el nombre del alumno(a)");
				nota = Double.parseDouble(JOptionPane.showInputDialog("ingrese la nota del alumno(a): " + nombre));
				ingresoAlumno(listaNotas, nombre);
			}
			count = 1;
			break;
		case "2":if (count >0) {
				imprimirLista(listaNotas);
			}else {
				System.out.println("Tiene que ingresar un alumno(a) antes de realizar cuanlquier accion "
						+ "en el programa");
			}
			break;
		case "3":if (count >0) {
				nombre = JOptionPane.showInputDialog("ingrese al alumno(a) que desea consultar la nota");
				consultarAlumno(listaNotas, nombre);
			}else {
				System.out.println("Tiene que ingresar un alumno(a) antes de realizar cuanlquier accion "
						+ "en el programa");
			}
			break;
		case "4":if (count >0) {
				nombre = JOptionPane.showInputDialog("ingrese el alumno que desea eliminar de la lista");
				eliminarAlumno(listaNotas, nombre);
			}else {
				System.out.println("Tiene que ingresar un alumno(a) antes de realizar cuanlquier accion "
						+ "en el programa");
			}
			break;
		case "5": break;
		default:
			System.out.println("ingrese una opcion valida");
			break;
		}
		
	}
	
	private void imprimirLista(HashMap<String, Double> listaNotas) {
		titulo = "-------- lista Alumnos ---------";
		System.out.println(titulo);
		
		Iterator iterador = listaNotas.keySet().iterator();
		
		while (iterador.hasNext()) {
			String llave = (String) iterador.next();
			lista ="-alumno(a): " + llave + " - nota: " + listaNotas.get(llave);
			System.out.println(lista);
		}
	}

	public void ingresoAlumno(HashMap<String, Double> listaNotas,String alumno){
		titulo = "-------- Ingreso De Alumnos ---------";
		System.out.println(titulo);
		listaNotas.put(nombre, nota);
		System.out.println("ingreso de alumno(a) exitoso");
	}
		
	public void eliminarAlumno(HashMap<String, Double> listaNotas,String alumno){
		titulo = "-------- Eliminar De La Lista ---------";
		System.out.println(titulo);
		if (listaNotas.containsKey(alumno)) {
			listaNotas.remove(alumno);
			System.out.println("elimino de la lista con exito al alumno(a)");
		}else {
			System.out.println("el alumno(a) no existe en la lista por lo tanto no se puede eliminar");
		}
	}
		
	public void consultarAlumno(HashMap<String, Double> listaNotas,String alumno){
		titulo = "-------- Consulta ---------";
		System.out.println(titulo);
		if (listaNotas.containsKey(alumno)) {
				System.out.println("-alumno(a): " + alumno + " - nota: " + listaNotas.get(alumno));
		}else {
			System.out.println("alumno(a)" + alumno + " no se encontro, ingrese al alumno(a) o "
					+ "verifique cual es el alumno(a) que quiere consultar");
		}		
					
	}
}
