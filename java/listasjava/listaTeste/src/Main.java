/*import java.util.Scanner;
public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
       //questao 1
        byte n1 = 1;
        short n2 = 2;
        int n3 = 3;
        long n4 = 4;
        float n5 = 5.0f;
        double n6 = 6.00;
        char n7 = '7';
        boolean n8 = true;


        //questao 2

        System.out.println("Digite um valor: ");
        int v1 = leia.nextInt();
        System.out.println("Digite um valor: ");
        int v2 = leia.nextInt();
        System.out.println("Soma: " + (v1 + v2));
        System.out.println("Subtração: " + (v1 - v2));
        System.out.println("Multiplicação: " + (v1 * v2));
        System.out.println("Divisão: " + (v1 / v2));

        //questao 3
        System.out.println("Digite uma frase:");
        char frase = leia.next().charAt(0);
        System.out.println("Unicode: " + (int)frase);

        //questao 4

        System.out.println("Digite um numero: ");
        int n = leia.nextInt();
        boolean positivo = n > 0;
        System.out.println("É positivo? " + positivo);

        //questao 5
        double n9 = leia.nextDouble();
        int n10 = (int)n9;
        System.out.println(n10);

        //questao 6
        System.out.println("Insira um valor");
        int numero = leia.nextInt();
        double numero2 = (double)numero;
        System.out.println("a divisao de: " + numero + " do tipo int por 2 é: " + numero / 2 + " e a divisao do tipo double é: " + numero2 / 2);

        //questao 7
        int n11 = 200;
        byte b = (byte)n;
        System.out.println("int: " + n11);
        System.out.println("byte: " + b);
        System.out.println("Ocorreu perda de informação pois o byte só vai de -128 a 127.");


        //questao 8
        int n12 = 12;
        if(true) {
            int n13 = 13;
            System.out.println("dentro do if " + n12);
        }
        //System.out.println(n13); //o n13 nao existe fora do if

        //questao 9
        for(int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        //System.out.println(i); // i nao existe fora do for


        //questao 10
        int n14 = leia.nextInt();
        int n15 = leia.nextInt();
        System.out.println(n14 > n15);
        System.out.println(n14 < n15);
        System.out.println(n14 == n15);
        System.out.println(n14 != n15);
        System.out.println(n14 >= n15);
        System.out.println(n14 <= n15);



        //questao 11
        System.out.println("vamos verificar um valor");
        int n16 = leia.nextInt();
        if (n16 % 2 == 0 && n16 > 0) {
            System.out.println("O munero é positivo e par");
        }



        //questao 12
        System.out.println("vamos verificar um valor");
        int n17 = leia.nextInt();
        if (n17 > 100 || n17 < 0) {
            System.out.println("sim");
        }


        //questao 13
        int n18 = leia.nextInt();
        String res = (n18 % 2 == 0) ? "Par" : "Ímpar";
        System.out.println(res);



        //questao 14
        System.out.println("vamos verificar um valor");
        int n19 = leia.nextInt();
        if (n19 > 0) {
            System.out.println("É positivo");
        }
        else if (n19 < 0) {
            System.out.println("É negativo");
        }
        else {
            System.out.println("É zero");



            //questao 15
            System.out.println("vamos verificar um valor");
            double n20 = leia.nextDouble();
            if (n20 >= 7) {
                System.out.println("Aprovado");
            }
            else if (n20 >= 5) {
                System.out.println("Recuperação");
            }
            else {
                System.out.println("Reprovado");
            }




            //questao 16
            int dia = leia.nextInt();
            switch (dia) {
                case 1: System.out.println("Domingo"); break;
                case 2: System.out.println("Segunda"); break;
                case 3: System.out.println("Terça"); break;
                case 4: System.out.println("Quarta"); break;
                case 5: System.out.println("Quinta"); break;
                case 6: System.out.println("Sexta"); break;
                case 7: System.out.println("Sábado"); break;
                default: System.out.println("Inválido");
            }





            //questao 17
            int n21 = leia.nextInt();
            for (int i = 0; i <= n21; i++) {
                System.out.println(i);
            }



            //questao 18
            int n22;
            while ((n22 = leia.nextInt()) != 0) {
                System.out.println("Digitou: " + n);
                break;
            }


            //questao 19
            int n23;
            do {
                n23 = leia.nextInt();
                System.out.println("Digitou: " + n23);
            } while (n23 >= 0);


            //questao 20
            int n24 = leia.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + (n24 * i));
            }


            //1uestao 21
            for (int i = 2; i <= 100; i += 2) {
                System.out.print(i + " ");
            }

            //questao 22

            int soma = 0;
            int n25 = 1;
            while (n25 <= 50) soma += n25++;
            System.out.println("Soma = " + soma);



            //questao 23
            int n26 = leia.nextInt();
            long fat = 1;
            for (int i = 1; i <= n25; i++) fat *= i;
            System.out.println("Fatorial = " + fat);



            //questao 24
            int limite = leia.nextInt();
            int n27 = 0;
            int n28 = 1;
            while (n27 <= limite) {
                System.out.print(n27 + " ");
                int temp = n27 + n28;
                n27 = n28;
                n28 = temp;
            }

            //questao 25
            int n29 = 0;
            for (int i = 0; i < 5; i++) {
                n29 += leia.nextInt();
                System.out.println("Média = " + (n29 / 5.0));
            }


            //questao 26
            int n30, maior = Integer.MIN_VALUE;
            do {
                n30 = leia.nextInt();
                if (n30 != -1 && n30 > maior) maior = n30;
            } while (n30 != -1);
            System.out.println("Maior = " + maior);



            //questao 27
            int n31 = 0;
            for (int i = 1; i <= 100; i += 2) n31 += i;
            System.out.println("Soma = " + n31);



            //questao 28
            int i = 10;
            while (i >= 0) System.out.println(i--);


            //questao 29

            int n32 = leia.nextInt();
            for (int i1 = 1; i1 <= n32; i1++) {
                for (int j = 1; j <= i1; j++) System.out.print("*");
                System.out.println();
            }

            //questao 30
            String senha;
            do {
                System.out.print("Digite a senha: ");
                senha = leia.next();
            } while (!senha.equals("1234"));
            System.out.println("Senha correta!");


            
        }
}
*/