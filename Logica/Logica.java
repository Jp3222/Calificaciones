package Logica;

public class Logica {

    public double PromedioGrupal(double[] Calif) {
        double Promedio = 0;
        for (int i = 0; i < Calif.length; i++) {
            Promedio += Calif[i];
        }
        Promedio = Promedio / Calif.length;
        return Promedio;
    }

    public void VerDatos(String[] Nombre, int[] NoControl, double[] Calif) {
        for (int i = 0; i < Calif.length; i++) {
            System.out.print("[" + (i + 1) + "] Numero de control: " + NoControl[i]
                    + "\nAlumno: " + Nombre[i] + "\nCalificacion: " + Calif[i]);
            System.out.println("\n");

        }

    }

    //Metodo para Mostrar los primeros 5 promedio de todos
    public void VerPrimerosDatos(String[] Nombre, int[] NoControl, double[] Calif) {
        double Promedio = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("[" + (i + 1) + "] Numero de control: " + NoControl[i]
                    + "\nAlumno: " + Nombre[i] + "\nCalificacion: " + Calif[i]);
            Promedio += Calif[i];
            System.out.println("\n");
        }
        Promedio = Promedio / 5;
        System.out.println("Promedio de los primeros 5: " + Promedio);
    }

    //Metodo para Mostrar los primeros 5 promedio de todos
    public void VerUltimosDatos(String Nombre[], int NoControl[], double Calif[]) {
        double Promedio = 0;
        System.out.println("Ver los ultimos 5 alumnos\n");
        for (int i = Calif.length - 1; i > 10; i--) {
            System.out.print("[" + (i + 1) + "] Numero de control:" + NoControl[i]
                    + "\nAlumno: " + Nombre[i]
                    + "\nCalificacion: " + Calif[i]);
            Promedio += Calif[i];
            System.out.println("\n");
        }
        Promedio = Promedio / 5;
        System.out.println("Promedio de los Ultimos 5: " + Promedio);

    }
}
