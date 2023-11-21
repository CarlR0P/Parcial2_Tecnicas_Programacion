import java.time.LocalDateTime;

public class Vuelo {

    private int numeroVuelo;
    private String origen;
    private String destino;
    private LocalDateTime fechaHoraSalida;

    private int CapMaximaPasajeros;

    public Vuelo(int numeroVuelo, String origen, String destino, int year, int month, int day, int hour, int min, int capMaximaPasajeros) {
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.fechaHoraSalida = LocalDateTime.of (year, month, day, hour, min);
        CapMaximaPasajeros = capMaximaPasajeros;

    }

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDateTime getFechaHoraSalida() {
        return fechaHoraSalida;
    }

    public void setFechaHoraSalida(LocalDateTime fechaHoraSalida) {
        this.fechaHoraSalida = fechaHoraSalida;
    }

    public int getCapMaximaPasajeros() {
        return CapMaximaPasajeros;
    }

    public void setCapMaximaPasajeros(int capMaximaPasajeros) {
        CapMaximaPasajeros = capMaximaPasajeros;
    }

    public String getFechaHoraSalida2() {
        return fechaHoraSalida ();
    }

    private String fechaHoraSalida() {
        return null;
    }

}
