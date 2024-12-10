package tema3.ordenacion;

public class Ejercicio2 {
    public static int generarNumeroAleatorio(int mayor, int menor) {
        return (int) (Math.random() * (mayor - menor + 1)) + menor;
    }

    public static void pintar(int nums[]) {
        for(int i=0; i < nums.length; i++) {
            System.out.print(nums[i]+ " ");
        }
        System.out.println();
    }

    public static void ordenarBurbuja(int nums[]) {
        int aux;
        boolean bandera;

        for(int i=nums.length; i>0; i--) {
            bandera=false;
            for(int j=0; j<i-1; j++) {
                if (nums[j] > nums[j+1]) {
                    bandera=true;
                    aux = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = aux;
                }
            }
            if (bandera==false) {
                System.out.println("Se ha quedado por la " + i);
                break; //Ya está ordenador
            }
            pintar(nums);
        }
    }

    public static void main(String[] args) {

        int numeros[] = new int[10];

        for(int i=0; i < numeros.length; i++) {
            numeros[i] = generarNumeroAleatorio(100, 1);
        }

        pintar(numeros);

        ordenarBurbuja(numeros);

        pintar(numeros);


    }
}
