package classes;

public class Calculadora {

    public static double dividir(double a, double b){
        double n = a;
        double n2 = b;
        if (n2 == 0){
            throw new IllegalArgumentException("erro de argumento! Divisao por 0 nao permitida");
        }
        return n/n2;
    }

    public static  void eqSegundoGrau(double a, double b, double c){
        double delta = b * b - 4 * a * c;
        if (delta == 0){
            throw new IllegalArgumentException("o A nao pode ser 0");
        }
        if (delta < 0){
            throw new IllegalArgumentException("sem raizes reais");
        }
        if (delta == 0){
            System.out.println("Raiz unica: " + -b/2*a);
        }
        else{
            System.out.println("Raiz 1:" + (-b + Math.sqrt(delta))/2*a);
            System.out.println("Raiz 1:" + (-b - Math.sqrt(delta))/2*a);
        }
    }

}
