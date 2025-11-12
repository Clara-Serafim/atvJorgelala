import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Animal {
    Scanner leia = new Scanner(System.in);
    int c = 0;
    private String nome;
    private String especie;
    private int numPatas;
    private static List<String> listaAnimais = new ArrayList<>();


    public Animal(String anome, String especie, int numPatas){
        this.nome = anome;
        listaAnimais.add(nome);

        while (true) {
            if (especie.equalsIgnoreCase("mamifero") ||
                    especie.equalsIgnoreCase("ave") ||
                    especie.equalsIgnoreCase("peixe")) {
                this.especie = especie;
                break;

            } else {
                System.out.println("Especie inválida. Digite uma nova especie:");
                Scanner sc = new Scanner(System.in);
                especie = sc.nextLine();
                c++;
                if (c >= 5) {
                    System.out.println("Número de tentativas maximas excedido. Novas tentativas serão bloqueadas");
                    break;

                }
            }




        while(true){
            if (numPatas == 0 || numPatas == 2 || numPatas == 4){
                this.numPatas = numPatas;
                break;
            }
            else{
                System.out.println("Numero de patas invalido, por favor insira novamente");
                numPatas = leia.nextInt();
                c++;
                if (c >= 5){
                    System.out.println("Numero de tentativas exedido, encerrando aplicação");
                    break;
                }

            }
        }
        }
    }
    public void setNome(String nome) {
        this.nome=nome;
    }

    public void setEspecie(String especie) {
        this.especie=especie;
    }

    public void setNumPatas(int numPatas){
        this.numPatas=numPatas;
    }

    public String getaNome(){
        return this.nome;
    }

    public String getEspecie(){
        return this.especie;
    }

    public int getNumPatas(){
        return this.numPatas;
    }

    public static List<String> getListaAnimais() {
        return listaAnimais;
    }

    public void emitirSom() {
        System.out.println("Cuco");
    }



}


