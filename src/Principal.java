import java.util.Scanner;
import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        String nombre;
        int numPasaporte;
        int edad;
        String prefAlimenticias;
        String preferenciaVuelo;

        Date fechaHoraSalida = new Date(2000, 0, 1);

        System.out.println("\nPrograma de Reservas de vuelo");
        System.out.println();


        Vuelo miami = new Vuelo(10, "Bogota", "Miami", 2023, 12, 24, 06, 00, 100);
        Vuelo madrid = new Vuelo(15, "Bogota", "Madrid", 2023, 12, 31, 15, 30, 150);
        Vuelo buenosa = new Vuelo(20, "Bogota", "Buenos Aires", 2023, 12, 29, 22, 15, 200);

        System.out.println("Vuelos disponibles:");
        System.out.println();

        String origen = miami.getOrigen();
        String destino = miami.getDestino();
        String fechaHs = String.valueOf(miami.getFechaHoraSalida());
        System.out.println("Vuelo: " + origen + " - " + destino + " - " + fechaHs);

        origen = madrid.getOrigen();
        destino = madrid.getDestino();
        fechaHs = String.valueOf(madrid.getFechaHoraSalida());
        System.out.println("Vuelo: " + origen + " - " + destino + " - " + fechaHs);

        origen = buenosa.getOrigen();
        destino = buenosa.getDestino();
        fechaHs = String.valueOf(buenosa.getFechaHoraSalida());
        System.out.println("Vuelo: " + origen + " - " + destino + " - " + fechaHs);



        System.out.print("\nDesea reservar vuelos (si/no): ");
        String respuesta = lector.nextLine().toLowerCase();
        if (respuesta.equals("si")) {
            System.out.print("Ingrese su nombre: ");
            nombre = lector.nextLine();
            System.out.print("Ingrese su numero de pasaporte: ");
            numPasaporte = lector.nextInt();
            System.out.print("Ingrese su edad: ");
            edad = lector.nextInt();
            System.out.print("Ingrese sus preferencias alimenticias: ");
            prefAlimenticias = lector.next();
            System.out.print("Que vuelo quiere reservar: ");
            preferenciaVuelo = lector.next();

        } else if (respuesta.equals("no")) {
            System.out.println("Hasta Pronto!!");
            return;
        }

    }
}

/**
 * Pasajero carlos = new Pasajero("Carlos Rodriguez",1013661, 28, "De todo, excepto pesacado" );
 *         Pasajero sofia = new Pasajero("Sofia Cortes", 100200, 18, "De todo, pero frio");
 */