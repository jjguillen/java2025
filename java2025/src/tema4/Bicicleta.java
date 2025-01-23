package tema4;

public class Bicicleta {

    //PROPIEDADES
    public String color;
    public int numMarchas;
    public int numRuedas;
    public boolean tieneCesta;

    //CONSTRUCTOR
    public Bicicleta(String color, int numMarchas, int numRuedas, boolean tieneCesta) {
        this.color = color;
        this.numMarchas = numMarchas;
        this.numRuedas = numRuedas;
        this.tieneCesta = tieneCesta;
    }

    //MÉTODOS
    public String consultarColor() {
        return this.color;
    }

    public void pintar() {
        System.out.println(this.color);
        System.out.println(this.numMarchas);
        System.out.println(this.numRuedas);
        System.out.println(this.tieneCesta);

    }

    //...

}
