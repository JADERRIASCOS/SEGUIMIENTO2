package Ejercicio24Juego21;

import javax.swing.JOptionPane;

public class PrincipalJuego {
    public static void main(String[] args) {
        Juego juego = new Juego();

        JOptionPane.showMessageDialog(null, "¡Welcome to 21 Game!");

        // Repartir dos cartas al usuario y a la computadora
        juego.sacarCartaUsuario();
        juego.sacarCartaUsuario();
        juego.sacarCartaComputadora();
        juego.sacarCartaComputadora();

        // Mostrar una carta de la computadora
        JOptionPane.showMessageDialog(null, "One cart.");

        // Jugar hasta que el usuario decida plantarse o se pase de 21
        while (true) {
            int opcion = JOptionPane.showOptionDialog(null, "Your actual points: " + juego.getPuntajeUsuario() +
                            "\n¿Another card or stand?", "User turn",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                    new String[]{"Another card", "Stand"}, null);

            if (opcion == JOptionPane.YES_OPTION) {
                juego.sacarCartaUsuario();
                if (juego.getPuntajeUsuario() > 21) {
                    break;
                }
            } else {
                break;
            }
        }

        // Turno de la computadora
        while (juego.getPuntajeComputadora() < 17) {
            juego.sacarCartaComputadora();
        }

        // Determinar el resultado del juego y mostrarlo
        if (juego.usuarioGana()) {
            JOptionPane.showMessageDialog(null, "¡Congratulations! ¡You win!");
        } else if (juego.computadoraGana()) {
            JOptionPane.showMessageDialog(null, "¡I'm sorry! You loss.");
        } else {
            JOptionPane.showMessageDialog(null, "¡It's a tie!");
        }

        // Mostrar los puntajes finales
        JOptionPane.showMessageDialog(null, "Final points:\nUser: " + juego.getPuntajeUsuario() +
                "\nMachine: " + juego.getPuntajeComputadora());
    }
}
