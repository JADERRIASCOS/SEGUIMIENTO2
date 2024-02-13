package Ejercicio15Mayor;

import javax.swing.JOptionPane;

public class PrincipalMayor {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número:"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer número:"));

        Mayor mayor = new Mayor();
        int mayorNumero = mayor.encontrarMayor(num1, num2, num3);

        JOptionPane.showMessageDialog(null, "El número mayor es: " + mayorNumero);
    }
}
