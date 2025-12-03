import excecoes.DeltaNegativoException;
import excecoes.DivisorInvalidoException;
import excecoes.ValorInvalidoException;
import funcionalidades.Divisao;
import funcionalidades.EqSegGrau;
import funcionalidades.Media;

public class Main {
    public static void main(String[] args) {
        Divisao d;
        EqSegGrau eq;

        try{
            d = new Divisao(2.0, 0.6);

        } catch (DivisorInvalidoException e) {
            throw new RuntimeException(e);
        }
        System.out.println(d.dividir());
        System.out.println(Divisao.dividir(4.7,2.0));

        try {
            eq = new EqSegGrau(1, 2);
        } catch (ValorInvalidoException e) {
            throw new RuntimeException(e);
        }
        try {
            eq.calcularRaizes();
        } catch (DeltaNegativoException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Raiz 1: " + eq.getX1() + ", Raiz 2: " + eq.getX2());

        Media m = new Media();
        System.out.println(m.getMedia());
    }


}