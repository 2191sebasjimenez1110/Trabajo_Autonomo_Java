import java.util.ArrayList;

public class Ejercicio5 {
	public static void main(String[] args) {
		ArrayList<Integer> ListaNumeros = new ArrayList<Integer>();
		ListaNumeros.add(15);
		ListaNumeros.add(40);
		ListaNumeros.add(60);
		ListaNumeros.add(70);
		ListaNumeros.add(52);
		ListaNumeros.add(10);
		Ejercicio5 procesos = new Ejercicio5();
		System.out.println("el mayor numero del ArrayList es: " + procesos.verificarMayor(ListaNumeros));
	}
	
	int mayor = 0;
	public int verificarMayor(ArrayList<Integer> ListaNumeros) {
		for (int i = 0; i < ListaNumeros.size(); i++) {
			if(ListaNumeros.get(i) > mayor ) {
				mayor = ListaNumeros.get(i);
			}
		} 
	return mayor;
	}
}
