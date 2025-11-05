import java.util.Scanner;

public class Guia extends Funcionario{
    String animalPasseio;
    Scanner sc = new Scanner(System.in);
    public Guia(String nome, int idade, String matricula, String cargo) {
        super(nome, idade, matricula, cargo);


    }

    public void realizarPasseio() {
        System.out.println("Meu nome é " + getNome() + " e eu realizei um passeio com o animal: " + animalPasseio);
    }


    public void fazerPasseioAnimais() {
        System.out.println("Escolha um desses animais para realizar um passeio: ");
        for (String nome : Animal.getListaAnimais()) {
        System.out.println("- " + nome);
    }

        System.out.print("Digite o nome do animal escolhido: ");
        animalPasseio = sc.nextLine();

        System.out.println("Você escolheu o animal: " + animalPasseio);

    }
}
