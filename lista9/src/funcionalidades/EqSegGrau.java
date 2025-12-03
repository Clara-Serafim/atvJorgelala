package funcionalidades;

import excecoes.DeltaNegativoException;
import excecoes.ValorInvalidoException;

public class EqSegGrau {
    private double a;
    private double b;
    private double c;
    private double delta;
    private double x1;
    private double x2;
    public EqSegGrau(double a) throws ValorInvalidoException {
        setA(a);
        setB(0);
        setC(0);
    }

    public EqSegGrau(double a, double b) throws ValorInvalidoException {
        setA(a);
        setB(b);
    }

    public double getA() {
        return a;
    }
    public void setA(double a) throws ValorInvalidoException{
        if(a == 0) {
            throw new ValorInvalidoException("o A não pode ser zero!");
        }
        this.a = a;
    }
    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }
    public void calcularDelta () {
        this.delta = (b*b)-4*a*c;
    }

    public void calcularRaizes() throws DeltaNegativoException{
        if(delta > 0){
            this.x1 = (-b + (Math.sqrt(delta)))/2 * a;
            this.x2 = (-b - (Math.sqrt(delta)))/2 * a;
        }

         else if (delta == 0){
            this.x1 = (-b/2*a);
            this.x2 = 0;
        }

        else {
            throw new DeltaNegativoException("Valor de delta é negativo");
        }
    }

    public double getDelta() {
        return delta;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }
}
