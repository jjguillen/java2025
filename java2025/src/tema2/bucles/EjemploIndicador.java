package tema2.bucles;

public class EjemploIndicador {

    public static void main(String[] args) {

        //Si tiramos un dado 20 veces y queremos saber si ha salido algún 6
        int tirada;
        boolean haSalido6 = false; //No ha pasado

        for(int i=0; i<10; i++) {
            tirada = (int) (Math.random() * 6) + 1;
            if (tirada == 6) {
                haSalido6 = true;
            }
            System.out.println(tirada);
        }

        //Al finalizar el bucle puedo comprobar la variable booleana para saber si ha ocurrido
        System.out.println("Ha salido algún seis: " + haSalido6);

    }

}
