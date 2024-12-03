package tema3.strings.practica2;

public class Ejercicio10 {
    public static void main(String[] args) {

        //equals, equaslIgnoreCase, compareTo, compareToIganoreCase, for char a char

        String c1 = "Esta tarde no voy";
        String c2 = "esta tarde nO VOY";

        String c1Minus = c1.toLowerCase();
        String c2Minus = c2.toLowerCase();
        System.out.println(c1Minus.compareTo(c2Minus));

        System.out.println(c1.toLowerCase().compareTo(c2.toLowerCase()));

        //Comparar directamente dos cadenas ignorando mayúsculas
        //Igual, mayor, menor -> 0, +, -
        System.out.println(c1.compareToIgnoreCase(c2));

        //Comparar directamente dos cadenas ignorando mayúsculas
        //true o false
        System.out.println(c1.equalsIgnoreCase(c2));

        //Comparar caracter a caracter hasta encontrar uno diferente
        //Primero lo paso a minúsuculas todo
        boolean iguales = true;
        for(int i=0; i < c1Minus.length(); i++) {
            if (c1Minus.charAt(i) != c2Minus.charAt(i)) {
                iguales = false;
                break;
            }
        }
        System.out.println(iguales);
    }
}
