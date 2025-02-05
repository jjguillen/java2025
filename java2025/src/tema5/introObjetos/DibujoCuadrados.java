package tema5.introObjetos;

/**
 * Esta clase hereda de Dibujo
 * Sería una clase que sólo admite figuras de tipo Cuadrado
 * Para ello sobrescribimos addFigura y preguntamos si la figura a añadir
 * es de tipo Cuadrado. Si es así la añadimos y sino salta una excepción.
 * Esto de preguntar por el tipo con instaceof se cara un poco la POO pura.
 */
public class DibujoCuadrados extends Dibujo {

    @Override
    public void addFigura(Figura figura) throws Exception {
        if (figura instanceof Cuadrado)
            super.addFigura(figura);
        else
            throw new Exception("La figura no es un cuadrado");
    }
}
