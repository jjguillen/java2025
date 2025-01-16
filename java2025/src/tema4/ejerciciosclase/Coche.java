package tema4.ejerciciosclase;

public class Coche {

    private Integer velocidad;

    public Coche() {
        this.velocidad = 0;
    }

    public Coche(Integer velocidad) {
        this.velocidad = velocidad;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void acelera(Integer mas) {
        this.velocidad += mas;
    }

    public void frena(Integer menos) {
        this.velocidad -= menos;
        //Si la velocidad al restar me sale negativa, la pongo a cero
        if (this.velocidad < 0) {
            this.velocidad = 0;
        }
    }
}
