import classes.Calculadora;
import classes.Leitura;

public class Main {
    public static void main(String[] args) {
        //int n = Leitura.lerInt();
        //System.out.println("Valor de n: " + n);
        //double d = Leitura.lerDouble();
        //System.out.println("Valor de d: " + d);
        double a = Leitura.lerDouble();
        double b = Leitura.lerDouble();
        double c = Leitura.lerDouble();
        try{
             Calculadora.eqSegundoGrau(a, b, c);
        }catch (IllegalArgumentException e){
            System.out.println();
        }

    }
}