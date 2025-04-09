package tema7_parte2.streams;

import java.util.Comparator;
import java.util.List;

public class EjemplosResumen {
    public static void main(String[] args) {

        long total = List.of(234,22,1,234,546,55,67676,77,58,2,900)
                .stream()
                .count();

        System.out.println(total);

        //Mínimo
        long min = List.of(234,22,1,234,546,55,67676,77,58,2,900)
                .stream()
                .min(Comparator.naturalOrder())
                .orElseThrow(); //Lanza excepción si no lo encuentra

        System.out.println(min);

        long max = List.of(67676,234,22,1,234,546,55,67676,77,58,2,900)
                .stream()
                .max(Comparator.naturalOrder())
                .orElseThrow(); //Lanza excepción si no lo encuentra

        System.out.println(max);

        String menor = List.of("uno","dos","tres","cuatro","cinco").stream()
                .min(Comparator.comparing(String::length))
                .orElseThrow();
        System.out.println(menor);





    }
}
