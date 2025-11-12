import java.util.Scanner;

public class Limpeza extends Funcionario{
    public Limpeza(String nome, int idade, String matricula, String cargo) {
        super(nome, idade, matricula, cargo);
    }
    public void limparEspacos() {
        System.out.println("Meu nome é " + getNome() + " e eu limpei os espaços");
    }


}
