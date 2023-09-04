
public class Ejercicio4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arreglo = {12,50,60,40};
		Ejercicio4 procesos = new Ejercicio4();
		System.out.println("el mayor numero de arreglo es: " + procesos.verificarMayor(arreglo));
	}
	
	int mayor = 0;
	public int verificarMayor(int[] entero) {
		for (int i = 0; i < entero.length; i++) {
			if(entero[i] > mayor ) {
				mayor = entero[i];
			}
		} 
	return mayor;
	}
}
