package Ejercicio12Lavadoras;
public class Lavadoras {
    private int tipo; // 1 para lavadora grande, 2 para lavadora pequeña
    private int horas;

    public Lavadoras(int tipo, int horas) {
        this.tipo = tipo;
        this.horas = horas;
    }

    public double calcularCosto() {
        double costoPorHora;
        if (tipo == 1) {
            costoPorHora = 4000;
        } else {
            costoPorHora = 3000;
        }

        double costoTotal = costoPorHora * horas;

        // Aplicar descuento del 3% si se alquilan más de 3 lavadoras
        if (horas > 3) {
            costoTotal *= 0.97; // 3% de descuento
        }

        return costoTotal;
    }
}
