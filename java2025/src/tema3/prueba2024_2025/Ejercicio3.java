package tema3.prueba2024_2025;

public class Ejercicio3 {

    public static void cryptVocales(StringBuffer sb, boolean encriptar) {
        if (encriptar) {
            /*
            String str = sb.toString();
            str.replace("a","@")
                    .replace("e","&")
                    .replace("i","$")
                    .replace("o","º")
                    .replace("u","#");
            */

            for(int i=0; i < sb.length(); i++) {
                switch (sb.charAt(i)) {
                    case 'a': sb.setCharAt(i, '@'); break;
                    case 'e': sb.setCharAt(i, '&'); break;
                    case 'i': sb.setCharAt(i, '$'); break;
                    case 'o': sb.setCharAt(i, 'º'); break;
                    case 'u': sb.setCharAt(i, '#'); break;
                }
            }
        } else {
            for(int i=0; i < sb.length(); i++) {
                switch (sb.charAt(i)) {
                    case '@': sb.setCharAt(i, 'a'); break;
                    case '&': sb.setCharAt(i, 'e'); break;
                    case '$': sb.setCharAt(i, 'i'); break;
                    case 'º': sb.setCharAt(i, 'o'); break;
                    case '#': sb.setCharAt(i, 'u'); break;
                }
            }
        }
    }

    /**
     * Pone la primera letra al final del StringBuffer
     * @param sb
     */
    public static void primeraAlFinal(StringBuffer sb) {
        //Mover la primera al final
        String primeraLetra = sb.substring(0,1); //Primera letra
        sb.deleteCharAt(0);
        sb.append(primeraLetra); //Añade por el final

        //Intercambiando
        /*
        String ultima = sb.substring(sb.length()-1);
        sb.setCharAt(sb.length()-1, sb.charAt(0));
        sb.setCharAt(0, ultima.charAt(0));
        */
    }

    /**
     * Pone la última letra al principio
     * @param sb
     */
    public static void ultimaAlPrincipio(StringBuffer sb) {
        String ultimaLetra = sb.substring(sb.length()-1);
        sb.deleteCharAt(sb.length()-1);
        sb.insert(0,ultimaLetra); //Añade por el principio

        //Intercambiando
        /*
        String ultima = sb.substring(sb.length()-1);
        sb.setCharAt(sb.length()-1, sb.charAt(0));
        sb.setCharAt(0, ultima.charAt(0));
        */
    }

    /**
     * Invertir las palabras impares
     * @param sb
     */
    public static void invertirPalabras(StringBuffer sb) {
        String palabras[] = sb.toString().split(" ");
        for(int i=0; i < palabras.length; i++) {
            if (palabras[i].length() % 2 != 0) {
                palabras[i] = new StringBuffer(palabras[i]).reverse().toString();            }
        }

        //Limpiar StringBuffer
        sb.setLength(0);

        //Unir las palabras
        for(int i=0; i < palabras.length; i++) {
            sb.append(palabras[i]).append(" ");
        }

        //Eliminamos el último espacio
        sb.deleteCharAt(sb.length()-1);
    }

    public static String encriptar(String text) {
        StringBuffer sb = new StringBuffer(text.toLowerCase());

        //Intercambiar primera y última letra
        primeraAlFinal(sb);

        //Reemplazar vocales
        cryptVocales(sb, true);

        //Invertir palabras de longitud impar
        invertirPalabras(sb);

        return sb.toString().trim();
    }

    public static String desencriptar(String text) {
        StringBuffer sb = new StringBuffer(text.toLowerCase());

        //Invertir palabras de longitud impar
        invertirPalabras(sb);

        //Reemplazar vocales
        cryptVocales(sb, false);

        //Última al principio
        ultimaAlPrincipio(sb);

        return sb.toString();
    }

    public static void main(String[] args) {

        String mensaje = "Esto va a ser un mensaje encriptado, password holamundo";
        System.out.println(mensaje);

        String mensajeEncriptado = encriptar(mensaje);
        System.out.println(mensajeEncriptado);

        System.out.println(desencriptar(mensajeEncriptado));
    }
}
