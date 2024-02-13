package Ejercicio15Mayor;

public class Mayor {
    public int encontrarMayor(int num1, int num2, int num3) {
        int mayor = num1;

        if (num2 > mayor) {
            mayor = num2;
        }

        if (num3 > mayor) {
            mayor = num3;
        }

        return mayor;
    }
}
