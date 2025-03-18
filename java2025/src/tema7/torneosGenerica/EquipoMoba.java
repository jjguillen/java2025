package tema7.torneosGenerica;

public class EquipoMoba extends Equipo {

    private Integer estrategia;

    public EquipoMoba(String nombre, Integer nivel, Integer estrategia) {
        super(nombre, nivel);
        this.estrategia = estrategia;
    }

    public Integer getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(Integer estrategia) {
        this.estrategia = estrategia;
    }

    @Override
    public Integer calcularPuntos() {
        return this.nivel * this.estrategia;
    }
}
