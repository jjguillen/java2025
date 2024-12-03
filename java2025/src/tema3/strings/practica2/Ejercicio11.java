package tema3.strings.practica2;

public class Ejercicio11 {
    public static void main(String[] args) {

        String texto = "  Hola mundo    cruel     ";
        System.out.println(texto.trim() + ".");

        //StringBuffer delete
        StringBuffer sb = new StringBuffer(texto);
        while (sb.indexOf(" ") != -1) {
            sb.deleteCharAt(sb.indexOf(" "));
        }

        System.out.println(sb.toString() + ".");

    }
}
