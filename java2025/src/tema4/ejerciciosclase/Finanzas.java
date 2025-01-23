package tema4.ejerciciosclase;

public class Finanzas {

    private Double cambioDolarEuro; // 1 dolar -> 0.97 euros

    public Finanzas() {
        this.cambioDolarEuro = 1.36;
    }

    public Finanzas(Double cambioDolarEuro) {
        this.cambioDolarEuro = cambioDolarEuro;
    }

    public Double getCambioDolarEuro() {
        return cambioDolarEuro;
    }

    public void setCambioDolarEuro(Double cambioDolarEuro) {
        this.cambioDolarEuro = cambioDolarEuro;
    }

    public Double dolaresToEuros(Double cantidadDolares) {
        return cantidadDolares * this.cambioDolarEuro;
    }

    public Double eurosToDolares(Double cantidadEuros) {
        return cantidadEuros / this.cambioDolarEuro;
    }


}
