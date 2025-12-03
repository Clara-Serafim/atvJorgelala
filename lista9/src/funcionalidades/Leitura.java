package funcionalidades;

import excecoes.ValorInvalidoException;

import java.util.Scanner;

public class Leitura {
    public static double LerReal(){
        double real;
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Digite um numero real");
                real = Double.parseDouble(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Digite um numero real");
            }

        }
        return real;
    }


    public static double lerRealEntre(double limiteInferior, double limiteSuperior){
        double real;
        Scanner sc = new Scanner(System.in);
        while (true){
            try {
                real = Leitura.LerReal();
                if (real<limiteInferior || real>limiteSuperior){
                    throw new ValorInvalidoException("Valor invalido");
                }
                break;
            } catch (ValorInvalidoException e){
                System.out.println("digite um numero entre" + limiteInferior + "e" + limiteSuperior);

            }

        }
        return real;

    }
}
