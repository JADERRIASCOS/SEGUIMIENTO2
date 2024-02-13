package Ejercicio21Autos;

public class Autos {
    public boolean verificarDefecto(int modelo) {
        int[] modelosDefectuosos = {119, 179, 189, 190, 191, 192, 193, 194, 195, 221, 780};
        for (int modeloDefectuoso : modelosDefectuosos) {
            if (modelo == modeloDefectuoso) {
                return true;
            }
        }
        return false;
    }
}
