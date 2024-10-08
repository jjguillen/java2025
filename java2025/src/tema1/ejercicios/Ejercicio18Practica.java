package tema1.ejercicios;

public class Ejercicio18Practica {

    public static void main(String[] args) {

        int a = 10, b = 3 , c = 1, d, e; //La e estaba repetida

        float x, y;
        x= a / b;
        //c = (a < b) && c;  //No puedo comparar un boolean con un entero
                           //Ni asignarle el resultado de una operación lógica
                           //a un entero. Quitamos esa línea
        d = a + b++;
        e = ++a - b;
        y = (float)a / b;
    }
}
