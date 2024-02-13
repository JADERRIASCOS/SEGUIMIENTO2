package Ejercicio7AreaRectangulo;

import javax.swing.*;
import java.util.jar.JarOutputStream;

public class AreaRectangulo {
    public int base;
    public int alruta;
    public void ingresarBase(){
        base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la medida de la base del rectangulo en cm: "));
    }
    public void ingresarAltura(){
        alruta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la medida de la altura del rectangulo en cm: "));
    }
    public void calcularArea(){
        System.out.println("El área del rectangulo es " + base*alruta +"cm cuadrados");
    }
} 
