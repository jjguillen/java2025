package tema4;

public class TestCoche {
    public static void main(String[] args) {

        Coche c1 = new Coche("BMW", "Serie 3", "Azul", 4.5, 2.8, 1.6);
        Coche c2 = new Coche("BMW", "Serie 5", "Rojo", 4.5, 2.8, 1.6);

        System.out.println(c1);
        System.out.println(c2);

        Concesionario conce = new Concesionario("BMW", "VERA");
        conce.nuevoCoche(c1);
        conce.nuevoCoche(c2);

        System.out.println(conce);
        conce.venderCoche(c1);
        System.out.println(conce);


        ConcesionarioBueno conceB = new ConcesionarioBueno("BMW", "VERA");
        conceB.nuevoCoche(c1);
        conceB.nuevoCoche(c2);

        System.out.println(conceB);
        conceB.venderCoche(c1);
        System.out.println(conceB);


    }
}
