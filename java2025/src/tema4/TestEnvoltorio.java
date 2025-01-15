package tema4;

import java.util.Scanner;

public class TestEnvoltorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer number = 44;
        Integer otro = Integer.valueOf("444");
        Integer otro2 = Integer.valueOf(sc.nextLine());
        Integer otro3 = Integer.parseInt(sc.nextLine());

        int basico = otro2;

        System.out.println(otro3);

        System.out.println(otro + otro2 + otro3);

    }
}
