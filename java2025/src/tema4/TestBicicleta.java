package tema4;

public class TestBicicleta {

    public static void main(String[] args) {
        Bicicleta mibici = new Bicicleta("roja",1,2,true);
        Bicicleta otrabici = new Bicicleta("blanca",5,2,false);
        Bicicleta biciProfe = new Bicicleta("roja",1,2,true);

        Bicicleta b1; //Definición de objeto, pero el objeto no está creado
        b1 = new Bicicleta("roja",1,2,true); //objeto

        System.out.println(mibici);
        System.out.println(biciProfe);
        System.out.println(otrabici);

        mibici.pintar();
        mibici.tieneCesta = false;
        mibici.pintar();

        System.out.println(otrabici.consultarColor().length());

        b1 = null; //Referencia nula, ya el objeto no apunta a nada, no es nada




    }
}
