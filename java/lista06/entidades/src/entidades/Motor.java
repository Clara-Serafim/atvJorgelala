package entidades;

public class Motor {
    private int cilindros;
    private double cilindradas;
    private int potencia;
    public Motor(int cilindros, double cilindradas, int potencia){
        this.cilindradas = cilindradas;
        this.cilindros = cilindros;
        this.potencia = potencia;
    }


    public double getCilindradas() {
        return cilindradas;
    }

    public int getCilindros() {
        return cilindros;
    }

    public int getPotencia() {
        return potencia;
    }
}
