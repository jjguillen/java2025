package tema6.pruebaEscrita2EV;

import java.time.LocalDate;
import java.util.ArrayList;

public class Agencia {

    private ArrayList<Coche> coches;
    private ArrayList<Alquiler> alquileres;

    public Agencia() {
        this.coches = new ArrayList<>();
        this.alquileres = new ArrayList<>();
    }

    public void addCoche(Coche coche) {
        if (!this.coches.contains(coche)) { // Si no está ya en la lista}
            this.coches.add(coche);
        }
    }

    public void removeCoche(Coche coche) {
        this.coches.remove(coche);
    }

    public ArrayList<Coche> getCoches() {
        return coches;
    }

    public ArrayList<Alquiler> getAlquileres() {
        return alquileres;
    }

    public void listarCochesDisponibles() {
        System.out.println("Coches disponibles para alquilar:");
        for(Coche coche: this.coches) {
            if (coche.isDisponible()) {
                System.out.println(coche);
            }
        }
    }

    public void listarAlquileresActivos() {
        System.out.println("Alquileres activos:");
        for(Alquiler alquiler: this.alquileres) {
            if (alquiler.getFechaInicio().isBefore(LocalDate.now()) &&
                    alquiler.getFechaFin().isAfter(LocalDate.now())) {
                System.out.println(alquiler.getCoche());
            }
        }
    }

    public Coche buscarCocheDisponible(TipoCoche tipo) throws NoHayCochesDisponiblesException {
        for(Coche coche: this.coches) {
            if (coche.isDisponible() && coche.getTipo().equals(tipo)) {
                return coche;
            }
        }

        throw new NoHayCochesDisponiblesException("No hay coches disponibles para alquilar de tipo " + tipo);
    }

    /**
     * Versión 2 del método buscarCocheDisponible
     * Sacamos una lista de todos los coches que están en un alquiler activo y que son del mismo tipo
     * Comparamos con la lista de coches, y si hay alguno que no está en la lista de coches en alquiler, lo devolvemos
     * @param tipo
     * @return
     * @throws NoHayCochesDisponiblesException
     */
    public Coche buscarCocheDisponibleV2(TipoCoche tipo) throws NoHayCochesDisponiblesException {

        //Lista de coches que están ahora en alquiler activo que son de ese tipo
        ArrayList<Coche> cochesEnAlquiler = new ArrayList<>();
        for (Alquiler alquiler : this.alquileres) {
            if (alquiler.getCoche().getTipo().equals(tipo) &&
                    alquiler.getFechaInicio().isBefore(LocalDate.now()) &&
                    alquiler.getFechaFin().isAfter(LocalDate.now())) {
                cochesEnAlquiler.add(alquiler.getCoche());
            }
        }

        for (Coche coche : this.coches) {
            if (coche.getTipo().equals(tipo) && coche.isDisponible() && !cochesEnAlquiler.contains(coche)) {
                return coche;
            }
        }

        throw new NoHayCochesDisponiblesException("No hay coches disponibles para alquilar de tipo " + tipo);

    }

    /**
     * Método para entregar un coche
     * @param alquilerId
     */
    public void entregarCoche(Long alquilerId) {
        Alquiler alquilerAEntregar = null;
        for (Alquiler alquiler : this.alquileres) {
            if (alquiler.getId().equals(alquilerId)) {
                alquilerAEntregar = alquiler;
                break;
            }
        }

        if (alquilerAEntregar != null) {
            alquilerAEntregar.getCoche().setDisponible(true);
            //Podríamos tener dos listas de alquileres, los activos y los finalizados
            //this.alquileres.remove(alquilerAEntregar);
            System.out.println("El coche con matrícula " + alquilerAEntregar.getCoche().getMatricula() + " ha sido entregado.");
        } else {
            System.out.println("No se encontró un alquiler con el ID proporcionado.");
        }
    }

    public Alquiler realizarAlquiler(Cliente cliente, TipoCoche tipo, LocalDate fechaInicio, LocalDate fechaFin) {
        try {
            Coche coche = this.buscarCocheDisponible(tipo);
            coche.setDisponible(false); //Se podría poner en el constructor de Alquiler
            Alquiler alquiler = new Alquiler(cliente, coche, fechaInicio, fechaFin);
            this.alquileres.add(alquiler);
            return alquiler;
        } catch (NoHayCochesDisponiblesException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }



}
