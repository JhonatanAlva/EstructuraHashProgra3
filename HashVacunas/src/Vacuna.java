public class Vacuna {
    private String nombre;
    private String dosis;
    private String nombre2;
    private String dosis2;
    private String fecha2;

    public Vacuna(String nombre, String dosis, String nombre2, String dosis2, String fecha2) {
        this.nombre = nombre;
        this.dosis = dosis;
        this.nombre2 = nombre2;
        this.dosis2 = dosis2;
        this.fecha2 = fecha2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getDosis2() {
        return dosis2;
    }

    public void setDosis2(String dosis2) {
        this.dosis2 = dosis2;
    }

    public String getFecha2() {
        return fecha2;
    }

    public void setFecha2(String fecha2) {
        this.fecha2 = fecha2;
    }
}

