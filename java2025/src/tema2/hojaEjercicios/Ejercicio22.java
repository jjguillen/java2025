package tema2.hojaEjercicios;

import java.util.Scanner;

public class Ejercicio22 {

    /**
     * Le damos la vuelta al String directamente usando StringBuffer
     * @param numero
     * @return
     */
    public static int darleLaVueltaString(int numero) {
        int numeroReves=0;

        String numeroCadena = String.valueOf(numero); //Pasar de int a String
        StringBuffer strb = new StringBuffer(numeroCadena);
        strb.reverse(); //Le da la vuelta al String
        numeroReves = Integer.parseInt(strb.toString());

        return numeroReves;
    }

    /**
     * Le damos la vuelta al concatenando caracter a caracter el String por delante
     * @param numero
     * @return
     */
    public static int darleLaVueltaStringV2(int numero) {
        int numeroReves=0;
        //4116
        //0123

        String numeroCadena = String.valueOf(numero); //Pasar de int a String
        String numeroCadenaReves = "";
        for(int i=0; i<numeroCadena.length(); i++) {
            numeroCadenaReves = numeroCadena.charAt(i) + numeroCadenaReves;
        }

        return Integer.parseInt(numeroCadenaReves);
    }

    /**
     * Le damos la vuelta sacando cada dígito por separado
     * Y luego multiplicamos y sumamos según la posición
     * @param numero
     * @return
     */
    public static int darleLaVuelta(int numero) {
        //Miles - centenas - decenas - unidades
        // 4        1          1          6
        // 6        1          1          4

        int miles=0, centenas=0, decenas=0, unidades=0;
        int numeroReves;

        miles = numero / 1000;
        centenas = (numero % 1000) / 100;
        decenas = ((numero % 1000) % 100) / 10;
        unidades = ((numero % 1000) % 100) % 10;

        numeroReves = miles + centenas*10 + decenas*100 + unidades*1000;
        return numeroReves;
    }



    public static void main(String[] args) {

        //Capicúa de un número entre 1 y 9999
        //4114 si
        //4116 no
        //Darle la vuelta 4116 - 6114 son diferentes
        //Darle la vuelta 4114 - 4114 son iguales -> capicúa

        int numero, numeroReves;

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Dime un número entre 1 y 9999");
            numero = Integer.parseInt(sc.nextLine());
            //numeroReves = darleLaVueltaString(numero);
            //numeroReves = darleLaVueltaStringV2(numero);
            numeroReves = darleLaVuelta(numero);
            System.out.println(numeroReves);
            if (numero == numeroReves) {
                System.out.println("Es capicúa");
            } else {
                System.out.println("No es capicúa");
            }
        } catch (Exception e) {
            System.out.println("Error en lectura de número");
        }







    }
}
