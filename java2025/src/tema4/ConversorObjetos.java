package tema4;

public class ConversorObjetos {

    private static final double CAMBIO_EURO_DOLAR = 1.10;

    public static double convertirEurosADolares(double cantidEuros) {
        return CAMBIO_EURO_DOLAR * cantidEuros;
    }

    public static void main(String[] args) {
        System.out.println(ConversorObjetos.convertirEurosADolares(235));
    }
}
