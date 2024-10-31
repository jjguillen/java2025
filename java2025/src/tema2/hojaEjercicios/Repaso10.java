package tema2.hojaEjercicios;

public class Repaso10 {

    public static String generarFila(){
        //Genera un número aleatorio entre 1 y 3
        int numero = (int)(Math.random()*3)+1;

        switch (numero) {
            case 1: return "1";
            case 2: return " X";
            case 3: return "  2";
        }

        return "";
    }

    public static void main(String[] args) {
        //Quiniela
        //1.    1
        //2.     X
        //3.     X
        //...
        //14.     2

        for(int i=0; i<14; i++) {
            System.out.println(generarFila());
        }

    }

}
