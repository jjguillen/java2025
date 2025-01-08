package tema4;

public class Bicicleta {

    //PROPIEDADES
    private String color;
    private int numMarchas;
    private int numRuedas;
    private boolean tieneCesta;

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

    //...

}
