import java.util.Scanner;

public class Tratador extends Funcionario {
    String animalAlimentado;
    Scanner sc = new Scanner(System.in);
    public Tratador(String nome, int idade, String matricula, String cargo) {
        super(nome, idade, matricula, cargo);
    }
    public void alimentarAnimais() {
        System.out.println("Meu nome é " + getNome() + " e eu alimentei o animal: " + animalAlimentado);
    }


    public void fazerPasseioAnimais() {
        System.out.println("Escolha um desses animais para realizar um passeio: ");
        for (String nome : Animal.getListaAnimais()) {
            System.out.println("- " + nome);
        }

        System.out.print("Digite o nome do animal escolhido: ");

        animalAlimentado = sc.nextLine();

        System.out.println("Você escolheu o animal: " + animalAlimentado);

    }

}
