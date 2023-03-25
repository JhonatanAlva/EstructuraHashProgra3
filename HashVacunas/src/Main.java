import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Vacuna> vacunas = Vacunas.leerArchivo(); // Leemos el archivo de texto y guardamos los datos en un HashMap

        Scanner scanner = new Scanner(System.in);

        // Ciclo para ingresar el CUI y buscar las vacunas correspondientes
        while (true) {
            System.out.print("Ingrese el CUI (o 'salir' para terminar): ");
            String cui = scanner.nextLine();

            if (cui.equals("salir")) {
                break;
            }

            Vacuna vacuna = vacunas.get(cui);
            Vacuna dosis = vacunas.get(cui);
            Vacuna fecha = vacunas.get(cui);
            Vacuna dosis2 = vacunas.get(cui);
            Vacuna fecha2 = vacunas.get(cui);

            if (vacuna == null) {
                System.out.println("No se encontraron vacunas para el CUI ingresado.");
            } else {
                System.out.println("Las vacunas para el CUI " + cui + " son: " + vacuna + dosis + fecha + vacuna + dosis2 + fecha2);
            }
        }

        Vacunas.guardarArchivo(vacunas); // Guardamos los datos en el archivo de texto al salir del ciclo
    }
}



