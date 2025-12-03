import java.util.Arrays;
import java.util.Random;

public class Questoes {
    public static void main(String[] args) {
        int sum = 0;
        int media = 0;
        double max;
        double min;
        Random r = new Random();
        int v1[] = new int[r.nextInt(10)];
        System.out.println("O tamanho do vetor é: " + v1.length);
        for (int i = 0; i < v1.length; i++){
            v1[i] = r.nextInt(100);
        }
        System.out.println(Arrays.toString(v1));

        int tam = v1.length;
        int i;
        for (i = 0; i < tam; i++ ){
            sum += v1[i];
            media = sum / v1.length;
        }

        max = v1[0];
        for (i = 0; i < tam; i++){
            if(max < v1[i]){
                max = v1[i];
            }
        }

        min = v1[0];
        for (i = 0; i < tam; i++){
            if(min > v1[i]){
                min = v1[i];
            }
        }
        int cont = 0;
        for (i = 0; i < tam; i++){
            if(v1[i] % 2 == 0){
                cont = cont + 1;
            }
        }
        int conti = 0;
        for (i = 0; i < tam; i++){
            if(v1[i] % 2 != 0){
                conti = conti + 1;
            }
        }

        int posi = 0;
        int neg = 0;
        for (i = 0; i < tam; i++){
            if (v1[i] > 0){
                posi++;
            }
            else{
                neg++;
            }
        }


        int[] vInvertido = new int[tam];
        for ( i = 0; i < tam; i++) {
            vInvertido[i] = v1[tam - 1 - i];
        }



        boolean ehPalindromo = true;
        for ( i = 0; i < tam / 2; i++) {
            if (v1[i] != v1[tam - 1 - i]) {
                ehPalindromo = false;
                break;
            }
        }



        int[] vMultiplicado = new int[tam];
        for ( i = 0; i < tam; i++) {
            vMultiplicado[i] = v1[i] * 2;
        }


        int[] tempV = new int[tam];
        int k = 0;
        for ( i = 0; i < tam; i++) {
            boolean existe = false;
            for (int j = 0; j < k; j++) {
                if (tempV[j] == v1[i]) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                tempV[k] = v1[i];
                k++;
            }
        }

        int[] vSemDuplicatas = Arrays.copyOf(tempV, k);


        double maior = -99999;
        double segundoMaior = -99999;


        for ( i = 0; i < tam; i++) {
            if (v1[i] > maior) maior = v1[i];
        }

        for ( i = 0; i < tam; i++) {
            if (v1[i] > segundoMaior && v1[i] < maior) {
                segundoMaior = v1[i];
            }
        }


        int[] vOrdenado = Arrays.copyOf(v1, tam);
        int aux;
        for ( i = 0; i < tam; i++) {
            for (int j = 0; j < tam - 1; j++) {
                if (vOrdenado[j] > vOrdenado[j + 1]) {
                    aux = vOrdenado[j];
                    vOrdenado[j] = vOrdenado[j + 1];
                    vOrdenado[j + 1] = aux;
                }
            }
        }


        int valorBusca = 5;
        boolean encontrou = false;
        for ( i = 0; i < tam; i++) {
            if (v1[i] == valorBusca) {
                encontrou = true;
                break;
            }
        }

        int valorContar = v1[0];
        int contador = 0;
        for ( i = 0; i < tam; i++) {
            if (v1[i] == valorContar) {
                contador++;
            }
        }


        int[] v2 = new int[tam];
        for ( i = 0; i < tam; i++) v2[i] = r.nextInt(10);
        System.out.println("v2 para comparações: " + Arrays.toString(v2));

        int produtoEscalar = 0;
        for ( i = 0; i < tam; i++) {
            produtoEscalar += v1[i] * v2[i];
        }



        int[] jaImpresso = new int[tam];
        int countImpresso = 0;


        for ( i = 0; i < tam; i++) {
            boolean noV2 = false;
            for (int j = 0; j < tam; j++) {
                if (v1[i] == v2[j]) {
                    noV2 = true;
                    break;
                }
            }
            if (noV2) {
                boolean jaFoi = false;
                for (int x = 0; x < countImpresso; x++) {
                    if (jaImpresso[x] == v1[i]) jaFoi = true;
                }
                if (!jaFoi) {
                    System.out.print(v1[i] + " ");
                    jaImpresso[countImpresso++] = v1[i];
                }
            }
        }



        int[] vUniao = new int[tam * 2];
        int indiceU = 0;


        for ( i = 0; i < tam; i++) {
            boolean existe = false;
            for (int x = 0; x < indiceU; x++) {
                if (vUniao[x] == v1[i]) existe = true;
            }
            if (!existe) {
                vUniao[indiceU] = v1[i];
                indiceU++;
            }
        }


        for ( i = 0; i < tam; i++) {
            boolean existe = false;
            for (int x = 0; x < indiceU; x++) {
                if (vUniao[x] == v2[i]) existe = true;
            }
            if (!existe) {
                vUniao[indiceU] = v2[i];
                indiceU++;
            }
        }
        int[] resultadoUniao = Arrays.copyOf(vUniao, indiceU);


        // Questao 1
        System.out.println("A soma dos valores é: " + sum);
        // Questao 2
        System.out.println("A media dos valores é: " + media);
        // Questao 3
        System.out.println("O maior valor é: " + max);
        // Quetao 4
        System.out.println("O menor valor é: " + min);
        // Questao 5
        System.out.println("Quantidade de pares: " + cont);
        // Questao 6
        System.out.println("Quantidade de impares: " + conti);
        // Questao 7
        System.out.println("Quantidade de positivos: " + posi);
        System.out.println("Quantidade de negativos: " + neg);
        // Questao 8
        System.out.println(" Vetor Invertido: " + Arrays.toString(vInvertido));
        // Questao 9
        System.out.println(" É palíndromo? " + ehPalindromo);
        // Questao 10
        System.out.println(" Multiplicado por 2: " + Arrays.toString(vMultiplicado));
        // Questao 11
        System.out.println(" Sem duplicatas: " + Arrays.toString(vSemDuplicatas));
        // Questao 12
        System.out.println(" Segundo maior valor: " + segundoMaior);
        // Questao 13
        System.out.println(" Vetor Ordenado: " + Arrays.toString(vOrdenado));
        // Questao 14
        System.out.println(" O valor " + valorBusca + " existe no vetor? " + encontrou);
        // Questao 15
        System.out.println(" O valor " + valorContar + " aparece: " + contador + " vezes");
        // Questao 16
        System.out.println(" Produto Escalar: " + produtoEscalar);
        // Questao 17
        System.out.print("Interseção: ");
        System.out.print("[ ");
        System.out.println("]");
        System.out.println("União: " + Arrays.toString(resultadoUniao));
    }
}