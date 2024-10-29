package tema2.hojaEjercicios;

public class Ejercicio4 {

    public static void numBilletes(int importe) {

        int bill200=0, bill100=0, bill50=0, bill20=0, bill10=0, bill5=0, monedas=0;

        bill200 = importe / 200;
        importe = (importe % 200); //Se actualiza el importe con lo que sobra
        bill100 =  importe / 100;
        importe = (importe % 100);
        bill50 = importe / 50;
        importe = (importe % 50);
        bill20 = importe / 20;
        importe = (importe % 20);
        bill10 = importe / 10;
        importe = (importe % 10);
        bill5 = importe / 5;
        importe = (importe % 5);

        System.out.println("Billetes de 200 -> " + bill200);
        System.out.println("Billetes de 100 -> " + bill100);
        System.out.println("Billetes de 50 -> " + bill50);
        System.out.println("Billetes de 20 -> " + bill20);
        System.out.println("Billetes de 10 -> " + bill10);
        System.out.println("Billetes de 5 -> " + bill5);
        System.out.println(importe + " euros en monedas");
    }

    public static void main(String[] args) {

        numBilletes(362);

    }
}
