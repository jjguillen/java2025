package tema2.bucles;

public class EjemploContador {
    public static void main(String[] args) {
        //Cuenta el número de veces que sale el 6 al tirar un dado 1000 veces
        int contador = 0;
        int tirada;
        for(int i=0; i < 1000; i++) {
            tirada = (int) (Math.random() * 6) + 1;
            if (tirada == 6) {
                contador++;
            }
        }
        System.out.println(contador);

    }
}
