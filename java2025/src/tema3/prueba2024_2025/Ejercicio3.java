package tema3.prueba2024_2025;

public class Ejercicio3 {

    public static String encriptar(String text) {
        char aux;

        StringBuilder resultado = new StringBuilder();
        StringBuffer sb = new StringBuffer(text.toLowerCase());

        //Intercambiar primera y última letra
        aux = sb.charAt(text.length() - 1);
        sb.setCharAt(sb.length() - 1, sb.charAt(0));
        sb.setCharAt(0, aux);

        //Reemplazar vocales
        for(int i=0; i < sb.length(); i++) {
            switch (sb.charAt(i)) {
                case 'a': sb.setCharAt(i, '@'); break;
                case 'e': sb.setCharAt(i, '&'); break;
                case 'i': sb.setCharAt(i, '$'); break;
                case 'o': sb.setCharAt(i, 'º'); break;
                case 'u': sb.setCharAt(i, '#'); break;
            }
        }

        //Invertir palabras de longitud impar
        String palabras[] = sb.toString().split(" ");
        for(int i=0; i < palabras.length; i++) {
            if (palabras[i].length() % 2 != 0) {
                palabras[i] = new StringBuffer(palabras[i]).reverse().toString();            }
        }

        //Unir las palabras
        for(int i=0; i < palabras.length; i++) {
            resultado.append(palabras[i]).append(" ");
        }

        return resultado.toString().trim();
    }

    public static String desencriptar(String text) {
        char aux;

        StringBuilder resultado = new StringBuilder();
        StringBuffer sb = new StringBuffer(text.toLowerCase());

        //Invertir palabras de longitud impar
        String palabras[] = sb.toString().split(" ");
        for(int i=0; i < palabras.length; i++) {
            if (palabras[i].length() % 2 != 0) {
                palabras[i] = new StringBuffer(palabras[i]).reverse().toString();            }
        }

        //Unir las palabras
        for(int i=0; i < palabras.length; i++) {
            resultado.append(palabras[i]).append(" ");
        }
        //Eliminamos el último espacio
        resultado.deleteCharAt(resultado.length()-1);

        //Reemplazar vocales
        for(int i=0; i < resultado.length(); i++) {
            switch (resultado.charAt(i)) {
                case '@': resultado.setCharAt(i, 'a'); break;
                case '&': resultado.setCharAt(i, 'e'); break;
                case '$': resultado.setCharAt(i, 'i'); break;
                case 'º': resultado.setCharAt(i, 'o'); break;
                case '#': resultado.setCharAt(i, 'u'); break;
            }
        }

        //Intercambiar primera y última letra
        aux = resultado.charAt(resultado.length() - 1);
        resultado.setCharAt(resultado.length() - 1, resultado.charAt(0));
        resultado.setCharAt(0, aux);

        return resultado.toString();
    }

    public static void main(String[] args) {

        String mensaje = "Esto va a ser un mensaje encriptado, password holamundo";
        System.out.println(mensaje);

        String mensajeEncriptado = encriptar(mensaje);
        System.out.println(mensajeEncriptado);

        System.out.println(desencriptar(mensajeEncriptado));
    }
}
