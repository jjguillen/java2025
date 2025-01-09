package tema4;

import java.util.Scanner;

public class TestPersona {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime nombre de per2");
        String nombre = sc.nextLine();

        Persona per1 = new Persona("Javier", 21, 1.81);
        Persona per2 = new Persona(nombre, 25, 1.74);
        Persona per3 = new Persona();

        System.out.println("Dime el nombre de per1");
        per1.setNombre(sc.nextLine());

        //per1.setNombre("Pepe");
        per2.setAltura(1.83);

        System.out.println(per1);
        System.out.println(per2);
        System.out.println(per3);

    }
}
