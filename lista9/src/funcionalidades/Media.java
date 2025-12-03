package funcionalidades;

import excecoes.ValorInvalidoException;

public class Media {
    private double n1;
    private double n2;
    private double n3;
    private double media;
    public Media() {
        setN1();
        setN2();
        setN3();

    }

    public void setN1()  {
        this.n1 = Leitura.lerRealEntre(0, 10);
    }

    public void setN2() {
        this.n2 = Leitura.lerRealEntre(0, 10);
    }

    public void setN3() {
        this.n3 = Leitura.lerRealEntre(0, 10);
    }

    public double getN1() {
        return n1;
    }

    public double getN2() {
        return n2;
    }

    public double getN3() {
        return n3;
    }

    public double calcMedia(double n1, double n2, double n3){
        this.media = n1 + n2 + n3;
        this.media = this.media/3;
        return media;
    }

    public double getMedia(){
        return media;
    }

}
