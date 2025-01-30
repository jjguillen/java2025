package tema5.introObjetos;

public class Test {
    public static void main(String[] args) {

        Cuadrado c1 = new Cuadrado("rojo", 10.0);
        Rectangulo r1 = new Rectangulo("verde", 5.0, 4.0);

        System.out.println(c1);
        System.out.println(r1);

        System.out.println(c1.area());
        System.out.println(r1.area());
    }
}
