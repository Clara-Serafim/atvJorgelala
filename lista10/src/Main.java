public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int media = 0;
        double max;
        double min;
        int[]vetor;             // declaração
        vetor = new int [10];   // alocação de espaço
        int vetor2 [];
        vetor2 = new int[10];
        double d [] = {- 9.0, 1.0, 2.0, 3.0,- 12.0,  2.4, 6.5};
        String [] s = new String [10];
        int tam = d.length;
        int i;
        for (i = 0; i < tam; i++ ){
            System.out.println(i);
            sum += d[i];
            media = sum / d.length;
        }
        System.out.println("A soma dos valores é: " + sum);
        System.out.println("A media dos valores é: " + media);
        max = d[0];
        for (i = 0; i < tam; i++){
            if(max < d[i]){
                max = d[i];
            }
        }
        min = d[0];
        for (i = 0; i < tam; i++){
            if(min > d[i]){
                min = d[i];
            }
        }
        System.out.println("O maior valor é: " + max);
        System.out.println("O menor valor é: " + min);
    }
}