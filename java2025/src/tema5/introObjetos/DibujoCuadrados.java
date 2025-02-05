package tema5.introObjetos;

public class DibujoCuadrados extends Dibujo {

    @Override
    public void addFigura(Figura figura) throws Exception {
        if (figura instanceof Cuadrado)
            super.addFigura(figura);
        else
            throw new Exception("La figura no es un cuadrado");
    }
}
