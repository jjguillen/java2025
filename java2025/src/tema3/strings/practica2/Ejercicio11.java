package tema3.strings.practica2;

public class Ejercicio11 {
    public static void main(String[] args) {

        String texto = "  Hola mundo    cruel     ";

        //trim() elimina los espacios del principio y del final de la cadena
        System.out.println(texto.trim() + ".");

        //StringBuffer delete
        StringBuffer sb = new StringBuffer(texto);
        while (sb.indexOf(" ") != -1) {
            sb.deleteCharAt(sb.indexOf(" "));
        }

        System.out.println(sb.toString() + ".");

        //0   5          15
        //hola mundo cruel

        //hola-mundo cruel

        //texto = texto.replace(" ", "");

    }
}
