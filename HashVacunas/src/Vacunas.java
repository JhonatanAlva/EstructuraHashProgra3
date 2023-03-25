import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Vacunas {
    private static final String FILE_NAME = "vacunas.txt"; // Archivo de texto donde se guardarán los datos

    public static Map<String, Vacuna> leerArchivo() {
        Map<String, Vacuna> vacunas = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(":");
                String cui = parts[0];
                String vacuna = parts[1];
                String dosis = parts[2];
                String fecha = parts[3];
                String dosis2 = parts[4];
                String fecha2 = parts[5];

                Vacuna v = new Vacuna(vacuna, dosis, fecha, dosis2, fecha2);
                vacunas.put(cui, v);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de texto.");
        }

        return vacunas;
    }


    public static void guardarArchivo(Map<String, Vacuna> vacunas) {
        try (FileWriter fw = new FileWriter(FILE_NAME)) {
            for (Map.Entry<String, Vacuna> entry : vacunas.entrySet()) {
                fw.write(entry.getKey() + ":" + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo de texto.");
        }
    }
}


