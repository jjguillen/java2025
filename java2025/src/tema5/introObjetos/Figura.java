package tema5.introObjetos;

/**
 * La clase Figura es 'abstract', puesto que hay un metodo compartido por todas
 * las figuras que es "area()", pero que en la clase Figura no sabemos qué codigo
 * ponerle, puesto que no hay lados ni nadas para saber el área.
 * Lo que hacemos es definir el metodo "area()" como abstract, sin código
 * public abstract area();
 * Ya en las clases hijas se sobreescribe, y si tiene código.
 * El hecho de crear la clase Figura como abstract nos impedirá crear objetos
 * de tipo Figura (podría llamarse a un metodo que no tiene código :( )
 */
public abstract class Figura {

    protected String color; //Privado para todos, publico para clases hijas

    public Figura(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Figura{");
        sb.append("color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }

    //Como no tiene código este método será abstracto
    public abstract Double area();
}
