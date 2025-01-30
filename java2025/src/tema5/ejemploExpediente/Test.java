package tema5.ejemploExpediente;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        Expediente ex1 = new Expediente("Manolo", "García", 'H',
                Expediente.Modalidad.FPSUPERIOR, LocalDate.of(2000,10,13),
                1);

        Expediente ex2 = new Expediente("Isabel", "Pérez", 'M',
                Expediente.Modalidad.FPSUPERIOR, LocalDate.of(2001,2,1),
                1);

        NotasCurso nc1 = new NotasCurso("Programación", 1, 5.2, 4.5, 6.75);
        NotasCurso nc2 = new NotasCurso("Programación", 1, 7.2, 8.5, 6.75);
        NotasCurso nc3 = new NotasCurso("BBDD", 1, 3.2, 4.5, 4.75);
        NotasCurso nc4 = new NotasCurso("BBDD", 1, 5.2, 5.5, 5.75);

        ex1.addNotas(List.of(nc1, nc3));
        ex2.addNotas(List.of(nc2, nc4));

        System.out.println(ex1);
        System.out.println(ex2);

        System.out.println(ex1.titula());
        System.out.println(ex2.titula());
    }
}
