import javax.swing.JOptionPane;

public class Ejercicio2 {
	public static void main(String arg[]) {
        Ejercicio2 misprocesos= new Ejercicio2();
        misprocesos.numeroEntero(Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero")));
    }
	
	public void numeroEntero(int a) {
        if (a>=10) {
            JOptionPane.showMessageDialog(null,a + " el numero es mayor que 10");
        }else {
        	JOptionPane.showMessageDialog(null,a + " el numero es menor que 10");
        }
    }
}
