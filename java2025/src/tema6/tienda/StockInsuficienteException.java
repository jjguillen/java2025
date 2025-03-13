package tema6.tienda;

public class StockInsuficienteException extends Exception {

    public StockInsuficienteException(String message) {
        super("Exception: " + message);
    }
}
