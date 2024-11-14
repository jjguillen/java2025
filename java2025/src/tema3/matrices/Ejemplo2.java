package tema3.matrices;

public class Ejemplo2 {
    public static void main(String[] args) {

        double temps[][] = { {10.3, 30.4, 29.5}, {22.4, 26.9, 0}, {23.1, 33.2, 44.1}};

        for(int i=0; i < temps.length; i++) {
            for(int j=0; j < temps[i].length; j++) {
                System.out.print(temps[i][j] + " ");
            }
            System.out.println();
        }
    }
}
