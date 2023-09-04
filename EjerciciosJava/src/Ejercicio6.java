
public class Ejercicio6 {
	public static void main(String[] args) {
		int arreglo1[] = new int[10];
		int arreglo2[] = new int[arreglo1.length];
		for (int i = 0; i < arreglo1.length; i++) {
			arreglo1[i] = i+1;
		}
		for (int i = 0; i < arreglo2.length; i++) {
			arreglo2[i] = i+1;
		}
		Ejercicio6 procesos = new Ejercicio6();
		int [] suma = procesos.sumarArreglos(arreglo1, arreglo2);
		for (int i = 0; i < suma.length; i++) {
			System.out.println("la suma de los dos arreglos es: " + suma[i]);
		}
	}
	
	int sum[];
	public int[] sumarArreglos(int[] arreglo1, int[] arreglo2) {
		sum = new int [arreglo1.length];
		for (int i = 0; i < arreglo2.length; i++) {
			sum[i] = arreglo1[i]+arreglo2[i];
		}
		return sum;
		
	}
}
