package Ejercicio24Juego21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Juego {
    private static class Baraja {
        private final List<Integer> cartas;

        public Baraja() {
            cartas = new ArrayList<>();
            for (int i = 1; i <= 10; i++) {
                for (int j = 0; j < 4; j++) {
                    cartas.add(i);
                }
            }
            Collections.shuffle(cartas);
        }

        public int sacarCarta() {
            if (!cartas.isEmpty()) {
                return cartas.remove(0);
            } else {
                return -1; // No quedan cartas en la baraja
            }
        }
    }

    private final Baraja baraja;
    private int puntajeUsuario;
    private int puntajeComputadora;
    private boolean turnoUsuario;

    public Juego() {
        this.baraja = new Baraja();
        this.puntajeUsuario = 0;
        this.puntajeComputadora = 0;
        this.turnoUsuario = true;
    }

    public int getPuntajeUsuario() {
        return puntajeUsuario;
    }

    public int getPuntajeComputadora() {
        return puntajeComputadora;
    }

    public void sacarCartaUsuario() {
        if (turnoUsuario) {
            int carta = baraja.sacarCarta();
            if (carta != -1) {
                puntajeUsuario += carta;
            }
        }
    }

    public void sacarCartaComputadora() {
        if (!turnoUsuario) {
            int carta = baraja.sacarCarta();
            if (carta != -1) {
                puntajeComputadora += carta;
            }
        }
    }

    public void cambiarTurno() {
        turnoUsuario = !turnoUsuario;
    }

    public boolean usuarioGana() {
        return puntajeUsuario <= 21 && (puntajeUsuario > puntajeComputadora || puntajeComputadora > 21);
    }

    public boolean computadoraGana() {
        return puntajeComputadora <= 21 && (puntajeComputadora > puntajeUsuario || puntajeUsuario > 21);
    }
}
