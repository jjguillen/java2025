package tema1;

public class OperadoresRelacionales {
    public static void main(String[] args) {

        //Operadores Relacionales comparan dos valores, devuelven true o false. Son:
        // == -> igual
        // != -> distinto
        // < -> menor
        // > -> mayor
        // <= -> menor o igual
        // >= -> mayor o igual
        // ! -> lo contrario (true -> false, false -> true)

        int edad = 15;
        boolean condicion = ( edad >= 18 ); // (15 >= 18) false
        System.out.println(condicion);

        condicion = (edad == 15); // 15 == 15 comparar el valor de las variables, ver si es igual
        System.out.println(condicion);

        condicion = (edad != 20); // 15 != 20  ¿15 es distinto de 20? SI -> true
        System.out.println(condicion);

        condicion = (edad <= 15);// 15 <= 15 (sería cierto tanto si num < 15 como si num = 15)
        System.out.println(condicion); //true

        condicion = ! (edad >= 20); //! -> Negación    (15 >= 20) false
        System.out.println(condicion); //  true

        condicion = ! (edad != 20); // 15 != 20 -> true
        System.out.println(condicion); //false

    }
}
