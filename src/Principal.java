import java.time.LocalDateTime;
import java.util.Date;

public class Principal {
    public static void main(String[] args) {

        Date fechaHoraSalida = new Date(2000, 0, 1);

        System.out.println("\nPrograma de Reservas de vuelo");
        System.out.println();


        Vuelo miami = new Vuelo(10, "Bogota", "Miami", 2023, 12, 24, 06, 00, 100);
        Vuelo madrid = new Vuelo(15, "Bogota", "Madrid", 2023, 12, 31, 15, 30, 150);
        Vuelo buenosa = new Vuelo(20, "Bogota","Buenos Aires", 2023, 12, 29, 22, 15, 200 );

        System.out.println("Vuelos disponibles:");
        System.out.println();

        String origen = miami.getOrigen();
        String destino = miami.getDestino();
        String fechaHs = String.valueOf(miami.getFechaHoraSalida());
        System.out.println("Vuelo: " + origen + " - " + destino + " - " + fechaHs );

        origen = madrid.getOrigen();
        destino = madrid.getDestino();
        fechaHs = String.valueOf(madrid.getFechaHoraSalida());
        System.out.println("Vuelo: " + origen + " - " + destino + " - " + fechaHs );

        origen = buenosa.getOrigen();
        destino = buenosa.getDestino();
        fechaHs = String.valueOf(buenosa.getFechaHoraSalida());
        System.out.println("Vuelo: " + origen + " - " + destino + " - " + fechaHs );

        Pasajero carlos = new Pasajero("Carlos Rodriguez",1013661, 28, "De todo, excepto pesacado" );
        Pasajero sofia = new Pasajero("Sofia Cortes", 100200, 18, "De todo, pero frio");

    }

}
