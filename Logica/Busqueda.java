package Logica;

public class Busqueda {

    public String Secuencial(int x, String[] Nombre, int[] NoControl, double[] Calif) {
        String res = null;
        for (int i = 0; i < NoControl.length; i++) {
            if (x == NoControl[i]) {
                res = "El numero de control: " + x
                        + " Se encuentra en la posicion: " + (i + 1) + " Y tiene los siguientes datos "
                        + "\n[" + (i + 1) + "] Numero de control: " + NoControl[i]
                        + "\nAlumno: " + Nombre[i]
                        + "\nCalificacion: " + Calif[i];
                return res;
            }
        }
        res = "El numero de control no existe";
        return res;
    }

    public String Datos(int x, String[] Nombre, int[] NoControl, double[] Calif) {
        return "[" + (x) + "] Numero de control: " + NoControl[x - 1]
                + "\nAlumno: " + Nombre[x - 1]
                + "\nCalificacion: " + Calif[x - 1];

    }

    public void BusquedaPromedio(double x, String[] Nombre, int[] NoControl, double[] Calif) {
        System.out.println("Promedio buscado:" + x);
        for (int i = 0; i < Calif.length; i++) {
            if (x == Calif[i]) {
                System.out.print("[" + (i + 1) + "] Numero de control: " + NoControl[i]
                        + "\nAlumno: " + Nombre[i]);
                System.out.println("");
            }
        }
    }

}
