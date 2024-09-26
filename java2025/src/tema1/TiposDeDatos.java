package tema1;

public class TiposDeDatos {

    public static void main(String[] args) {

        //Enteros -> int o long
        int numero = 10000000;
        int total = 100;

        total = (total * numero);

        System.out.println(total);

        char caracter = 'a';

        System.out.println(caracter);

        caracter = 74;

        System.out.println(caracter);  //Pinta representación ASCII del número 74 -> J

        long numeroLargo = 10L;

        double n1 = 1;
        double n2 = 2;
        double division = n1 / n2;

        division = 10.0 / 5;
        division = 10F / 5;

        System.out.println(division);

        double aburrimiento = 10e7;
        System.out.println(aburrimiento);

        aburrimiento = aburrimiento * 809.1234;
        System.out.println(aburrimiento);






    }

}
