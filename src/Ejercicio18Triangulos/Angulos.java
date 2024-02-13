package Ejercicio18Triangulos;

import javax.swing.*;

public class Angulos {
    private int a1; private int a2; private int a3;
    public Angulos(int a1Initial, int a2Initial, int a3Initial) {
        this.a1 = a1Initial; this.a2 = a2Initial; this.a3 = a3Initial;
    }
    public int getA1(){return this.a1; } public int getA2(){return  this.a2; } public int getA3(){return this.a3; }
    public void setA1(int newA1){this.a1 = newA1; } public void setA2(int newA2){this.a2 = newA2; } public void setA3(int newA3){this.a3 = newA3; }
    public void resultado(){
        if (a1 + a2 + a3 == 180){
            JOptionPane.showMessageDialog(null, "¡The angle is valid :)!");
        } else {
            JOptionPane.showMessageDialog(null, "The angle is invalid :(");
        }
    }
}
