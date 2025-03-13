package tema6.pruebaEscrita2EV;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Principal {

    public static void alquilar(Scanner sc, Agencia agencia) {
        Cliente cliente = null;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Introduce el tipo de vehículo: (SEDAN, SUV, FURGONETA, DEPORTIVO)");
        TipoCoche tipo = TipoCoche.valueOf(sc.nextLine());

        LocalDate fechaInicio=null, fechaFin=null;
        boolean fechaCorrecta=false;
        while (!fechaCorrecta) {
            try {
                System.out.println("Introduce la fecha de inicio del alquiler (dd/MM/yyyy): ");
                String strFechaInicio = sc.nextLine();
                fechaInicio = LocalDate.parse(strFechaInicio,dtf);
                System.out.println("Introduce la fecha de fin del alquiler (dd/MM/yyyy): ");
                String strFechaFin = sc.nextLine();
                fechaFin = LocalDate.parse(strFechaFin,dtf);

                fechaCorrecta = true;
            } catch (Exception e){
                System.out.println("Fecha incorrecta, introduce de nuevo las dos fechas (dd/MM/yyyy): ");
            }
        }

        //Realizamos el alquiler
        Alquiler alquiler = agencia.realizarAlquiler(cliente, tipo, fechaInicio, fechaFin);

        //Si no hay coches disponibles, no se puede realizar el alquiler y salimos
        if (alquiler == null) {
            System.out.println("No se ha podido realizar el alquiler");
            return;
        }

        //Si se ha podido realizar el alquiler, pedimos los datos del cliente y luego asignamos el alquiler al cliente
        System.out.println("Introduce datos del cliente: ");
        System.out.println("Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Apellidos: ");
        String apellidos = sc.nextLine();
        System.out.println("DNI: ");
        String dni = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.nextLine();
        System.out.println("Dirección: ");
        String direccion = sc.nextLine();
        System.out.println("Teléfono: ");
        String telefono = sc.nextLine();
        System.out.println("Licencia de conducir: ");
        String licenciaConducir = sc.nextLine();

        LocalDate fechaObtencion=null;

        fechaCorrecta = false;
        while (!fechaCorrecta) {
            try {
                System.out.println("Fecha de obtención de la licencia (dd/MM/yyyy): ");
                String strFechaObtencion = sc.nextLine();

                fechaObtencion = LocalDate.parse(strFechaObtencion, dtf);
                fechaCorrecta = true;
            } catch (Exception e){
                System.out.println("Fecha incorrecta, introduce de nuevo la fecha de obtención de la licencia (dd/MM/yyyy): ");
            }
        }

        //Creamos el cliente con los datos
        cliente = new Cliente(nombre, apellidos, dni, email, direccion, telefono, licenciaConducir, fechaObtencion);

        //Ahora le ponemos al alquiler este cliente
        alquiler.setCliente(cliente);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion=-1;

        Agencia agencia = new Agencia();

        for(int i=0; i < 10; i++) {
            Coche coche = new CocheEstandar((long) i, "Marca"+i, "Modelo"+i, "Matricula"+i,
                    2020, TipoCombustible.HIBRIDO, 100.0, true);
            agencia.addCoche(coche);
        }
        for(int i=10; i < 20; i++) {
            Coche coche = new CochePremium((long) i, "Marca"+i, "Modelo"+i, "Matricula"+i,
                    2020, TipoCombustible.ELECTRICO, 150.0, true, true);
            agencia.addCoche(coche);
        }

        //MENU ---------------------
        while(opcion!=5) {
            System.out.println("1. Listar coches disponibles");
            System.out.println("2. Listar alquileres activos");
            System.out.println("3. Alquilar coche");
            System.out.println("4. Mostrar ingresos");
            System.out.println("5. Salir");
            System.out.print("Introduce una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch(opcion) {
                case 1:
                    agencia.listarCochesDisponibles();
                    break;
                case 2:
                    agencia.listarAlquileresActivos();
                    break;
                case 3:
                    Principal.alquilar(sc, agencia);
                    break;
                case 4:
                    Double total=0.0;
                    for(Alquiler alquiler: agencia.getAlquileres()) {
                        if (alquiler.getFechaFin().isBefore(LocalDate.now()) &&
                            alquiler.getFechaFin().getYear() == LocalDate.now().getYear()) {
                            total += alquiler.getPrecioTotal();
                        }
                    }
                    System.out.println("Ingresos totales de los alquileres terminados este año: " + total + " €");
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    sc.close();
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }



    }
}
