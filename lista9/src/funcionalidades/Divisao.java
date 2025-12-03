package funcionalidades;

import excecoes.DivisorInvalidoException;

public class Divisao {
    private double dividendo;
    private double divisor;
    public Divisao (double dividendo, double divisor) throws DivisorInvalidoException{
        setDivisor(divisor);
        setDividendo(dividendo);
    }
    public double getDividendo() {
        return dividendo;
    }
    public void setDividendo(double dividendo) {
        this.dividendo = dividendo;
    }
    public double getDivisor() {
        return divisor;
    }
    public void setDivisor(double divisor) throws DivisorInvalidoException{
        if (divisor == 0) {
            throw new DivisorInvalidoException("Divisor invalido!");
        }
        this.divisor = divisor;
    }
    public double dividir () {
        return dividendo / divisor;
    }
    public static double dividir (double dividendo, double divisor) {
        return dividendo / divisor;
    }
}
