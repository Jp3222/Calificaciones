package Principal;

import java.util.Scanner;
import Logica.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        /*
        15 Alumnos
        Nombre
        No. de control
        Calficacion
         */
        ////////////////  Variables  ////////////////
        Scanner V = new Scanner(System.in);
        String Nombre[] = {
            "ARIAGNA ACEVEDO CAMPOS",
            "MICHAEL HAZIEL AMBROCIO PEREZMICHAEL HAZIEL AMBROCIO PEREZ",
            "VIANEY CELERINA AMBROSIO HERNANDEZVIANEY CELERINA AMBROSIO",
            "JUAN PABLO CAMPOS CASASANEROJUAN PABLO CAMPOS CASASANERO",
            "MARIANA DAZZLING DIAZ DE JESUSMARIANA DAZZLING DIAZ DE JESUS",
            "ALEXIS EFREN DIAZ ROSASALEXIS EFREN DIAZ ROSAS	Estudiante",
            "JENNIFER IRLANDA DOMINGUEZ CAZALESJENNIFER IRLANDA DOMINGUEZ CAZALES",
            "MONSERRAT ELIGIO RAMOSMONSERRAT ELIGIO RAMOS",
            "LILIANA FLORES MALDONADOLILIANA FLORES MALDONADO",
            "EDGAR OMAR GOMEZ ARAGONEDGAR OMAR GOMEZ ARAGON",
            "SAMARA GUTIERREZ VALLESAMARA GUTIERREZ VALLE",
            "ALEXIS MANUEL JUAREZ RAMOSALEXIS MANUEL JUAREZ RAMOS",
            "ROGELIO JESUS LEYVA SILVAROGELIO JESUS LEYVA SILVA",
            "ISABEL MARTINEZ DE LOS SANTOSISABEL MARTINEZ DE LOS SANTOS",
            "IRIS MADAI MARTINEZ RAYOIRIS MADAI MARTINEZ RAYO",
            "VICENTE ANGEL MELENDEZ MENDOZAVICENTE ANGEL MELENDEZ MENDOZA"

        };
        int NoControl[] = {
            18680056,
            19680091,
            19680092,
            19680113,
            19680133,
            17680136,
            18680108,
            19680957,
            19680144,
            19680156,
            19680162,
            19680958,
            19680177,
            18680163,
            18680165,
            18680172
        };
        double Calificacion[] = new double[Nombre.length];

        ////////////////  Variables  ////////////////
        for (int i = 0; i < Calificacion.length; i++) {
            do { //Esto se va a repetir
                System.out.print("[" + (i + 1) + "] Numero de control: " + NoControl[i]
                        + "\nAlumno: " + Nombre[i] + "\nCalificacion: ");
                Calificacion[i] = V.nextDouble();
                System.out.println("");
                //Mientras calificacion en la posicion i sea menor a 0 o calificacion en la posicion i sea mayor a 100
            } while (Calificacion[i] < 0 || Calificacion[i] > 100);
        }
        ////////////////  Menu  ////////////////
        /*
        Que el codigo se repida hasta que el salga del programa
         */
        Logica metodos = new Logica();
        Busqueda metodo = new Busqueda();
        int opc;
        double x;
        do {//Esto se va a repetir
            System.out.println("Usuario: User@123"
                    + "\n¿Que desea hacer?"
                    + "\n[1]Promedio general"
                    + "\n[2]Ver los primeros 5 datos"
                    + "\n[3]Ver los ultimos 5 datos"
                    + "\n[4]Datos de un alumno"
                    + "\n[5]Buscar por numero de control"
                    + "\n[6]Ver todos los datos"
                    + "\n[7]Buscar un promedio"
                    + "\n[8]salir");
            opc = V.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Promedio Grupal: " + metodos.PromedioGrupal(Calificacion));
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Ver los primeros 5 datos");
                    metodos.VerPrimerosDatos(Nombre, NoControl, Calificacion);
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Verclos ultimos 5 datos");
                    metodos.VerUltimosDatos(Nombre, NoControl, Calificacion);
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Introduzca el indice de el alumno");
                    opc = V.nextInt();
                    System.out.println(metodo.Datos(opc, Nombre, NoControl, Calificacion));
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("Introduzca el No de control de el alumno");
                    opc = V.nextInt();
                    System.out.println(metodo.Secuencial(opc, Nombre, NoControl, Calificacion));
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("Mostrar Datos\n");
                    metodos.VerDatos(Nombre, NoControl, Calificacion);
                    System.out.println("");
                    break;
                case 7:
                    System.out.println("Introduce un Promedio");
                    x = V.nextDouble();
                    metodo.BusquedaPromedio(x, Nombre, NoControl, Calificacion);
                    break;
                case 8:
                    for (int i = 0; i <= 5; i++) {
                        System.out.println("Saliendo...");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    System.out.println("Salida exitosa");
                    break;
                default:
                    System.out.println("Opcion erronea");
            }
            System.out.println("");
            //Mientras nuestra opcion sea diferente de la opcion 4
        } while (opc != 8);

    }

}
