public class Pasajero {

    private String nombre;
    private int numPasaporte;
    private int edad;
    private String prefAlimenticias;

    public Pasajero(String nombre, int numPasaporte, int edad, String prefAlimenticias) {
        this.nombre = nombre;
        this.numPasaporte = numPasaporte;
        this.edad = edad;
        this.prefAlimenticias = prefAlimenticias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumPasaporte() {
        return numPasaporte;
    }

    public void setNumPasaporte(int numPasaporte) {
        this.numPasaporte = numPasaporte;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPrefAlimenticias() {
        return prefAlimenticias;
    }

    public void setPrefAlimenticias(String prefAlimenticias) {
        this.prefAlimenticias = prefAlimenticias;
    }

}
