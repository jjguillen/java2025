package tema2.bucles;

public class CubitusHumerus2 {
    public static void main(String[] args) {
        //Nuestros dos romanos favoritos juegan a los dados de 12 caras
        //Cada uno tira dos dados
        //Gana aquel de los dos cuya suma de sus dados sea mayor, o
        //aquel cuyos dos dados sean iguales
        //Juega 20 rondas y dime quién gana

        int tiradaC1, tiradaC2;
        int tiradaH1, tiradaH2;
        int contadorVC=0, contadorVH=0;

        for(int i=0; i < 20; i++) {
            tiradaC1 = (int) (Math.random() * 12) + 1;
            tiradaC2 = (int) (Math.random() * 12) + 1;
            tiradaH1 = (int) (Math.random() * 12) + 1;
            tiradaH2 = (int) (Math.random() * 12) + 1;

            System.out.println("Cubitus: " + tiradaC1 + ", " + tiradaC2);
            System.out.println("Humerus: " + tiradaH1 + ", " + tiradaH2);

            //1. Cubitus 2 dados iguales -> gana C
            //2. Humeros 2 dados iguales -> gana H
            //3. Los dos sacan los dados iguales -> empate
            //4. Suma de dados mayor C -> C
            //5. Suma de dados mayor H -> H
            //6. Suma de dados igual en los dos -> empate

            if (tiradaC1 == tiradaC2 && tiradaH1 == tiradaH2) {
                System.out.println("Empate");
            } else if (tiradaC1 == tiradaC2) {
                System.out.println("Gana Cubitus");
                contadorVC++;
            } else if (tiradaH1 == tiradaH2) {
                System.out.println("Gana Humerus");
                contadorVH++;
            } else if (tiradaC1+tiradaC2 > tiradaH1+tiradaH2) {
                System.out.println("Gana Cubitus");
                contadorVC++;
            } else if (tiradaC1+tiradaC2 < tiradaH1+tiradaH2) {
                System.out.println("Gana Humerus");
                contadorVH++;
                //} else if (tiradaC1+tiradaC2 == tiradaH1+tiradaH2) {
            } else {
                System.out.println("Empate");
            }
        }

        System.out.println("Victorias de Cubitus " + contadorVC);
        System.out.println("Victorias de Humerus " + contadorVH);

        if (contadorVH > contadorVC) {
            System.out.println("Gana Humerus, invita Cubitus");
        } else if (contadorVH < contadorVC) {
            System.out.println("Gana Cubitus, invita Humerus");
        } else {
            System.out.println("Empate y lo celebran juntos");
        }


    }
}
