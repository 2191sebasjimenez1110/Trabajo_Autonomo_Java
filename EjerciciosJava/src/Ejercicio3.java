import java.util.Random;

public class Ejercicio3 {
	
    public static void main(String arg[]) {
        Ejercicio3 procesos= new Ejercicio3();
        System.out.println(procesos.numero());
    }
	
	public int numero(){ 
        Random numero = new Random();
        int valor = numero.nextInt(1,101);
        return valor;
    }
}
