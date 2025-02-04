package tema5.introObjetos;

public class TestDibujo {

    public static void main(String[] args) {
        Dibujo dibujo = new Dibujo();

        dibujo.addFigura(new Cuadrado("rojo", 10.0));
        dibujo.addFigura(new Cuadrado("verde", 12.0));
        dibujo.addFigura(new Rectangulo("azul", 5.0, 8.0));
        dibujo.addFigura(new Rectangulo("amarillo", 11.0, 7.0));

        System.out.println(dibujo.calcularAreaTotal());

    }
}
