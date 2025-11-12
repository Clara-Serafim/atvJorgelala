package classes;

import java.util.Scanner;

public class Leitura {
    public static int lerInt (){
        int n;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Digite um numero inteiro");
            try {
                n = Integer.parseInt(sc.nextLine());
                System.out.println("Numero lido");
                break;
            } catch (Exception e) {
                System.out.println("Valor invalido!");
            }
        }
        return n;

    }

    public static double lerDouble (){
        double d;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Digite um numero real");
            try {
                d = Double.parseDouble(sc.nextLine());
                System.out.println("Numero lido" );
                break;
            } catch (Exception e) {
                System.out.println("Valor invalido!");
            }
        }
        return d;

    }
}
