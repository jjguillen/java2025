package tema3.strings.practica2;

public class Ejercicio8 {
    public static void main(String[] args) {
        String url = "http://www.iesjaroso/noticias";

        StringBuffer sb = new StringBuffer(url);
        sb.deleteCharAt(4);
        //sb.deleteCharAt(5);

        url = sb.toString();

        String cadenas[] = url.split("/");
        for(int i=0; i < cadenas.length; i++) {
            System.out.println(cadenas[i]);
        }

        //Contando las posiciones
        System.out.println(url.substring(0,4));
        System.out.println(url.substring(6,19));
        System.out.println(url.substring(20,28));

        //Sin contar las posiciones
        // substring( posicionInicial, posicionInicial + longitud )
        System.out.println(url.substring(url.indexOf("http"), "http".length() + url.indexOf("http")));
        System.out.println(url.substring(url.indexOf("www.iesjaroso"), "www.iesjaroso".length() + url.indexOf("www.iesjaroso")));
        System.out.println(url.substring(url.indexOf("noticias"), url.indexOf("noticias") + "noticias".length()));
    }
}
