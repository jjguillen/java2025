package tema3.arrays;

public class Ejemplo2 {
    public static void main(String[] args) {

        //Crea un array con los días de la semana, y muestra aquellos cuya
        // longitud tengas más de 5 caracteres

        String dias[] = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes",
                            "Sábado", "Domingo"};

        for(int i=0; i < dias.length; i++) {
            if (dias[i].length() > 5)
                System.out.println(dias[i]);
        }


    }
}
