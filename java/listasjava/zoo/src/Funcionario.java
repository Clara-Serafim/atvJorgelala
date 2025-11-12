import java.util.Scanner;

public class Funcionario extends pessoa{

    private String matricula;
    private String cargo;

    public Funcionario(String nome, int idade, String matricula, String cargo) {
        super(nome, idade);
        int c = 0;
        while (true) {
            if (cargo.equalsIgnoreCase("tratador") ||
                    cargo.equalsIgnoreCase("guia") ||
                    cargo.equalsIgnoreCase("limpeza")) {
                this.cargo = cargo;
                break;
            } else{
                System.out.println("Cargo inválido. Digite um novo cargo:");
                Scanner sc = new Scanner(System.in);
                cargo = sc.nextLine();
                c++;
                if (c >= 5) {
                    System.out.println("Número de tentativas maximas excedido. Novas tentativas serão bloqueadas");
                    break;
                }
            }
        }
    }

    public String getMatricula(){
        return this.matricula;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(){
            int c = 0;
            while (true) {
                if (cargo.equalsIgnoreCase("tratador") ||
                        cargo.equalsIgnoreCase("guia") ||
                        cargo.equalsIgnoreCase("limpeza")) {
                    this.cargo = cargo;
                    break;
                } else {
                    System.out.println("Cargo inválido. Digite um novo cargo:");
                    Scanner sc = new Scanner(System.in);
                    cargo = sc.nextLine();
                    c++;
                    if (c >= 5) {
                        System.out.println("Número de tentativas maximas excedido. Novas tentativas serão bloqueadas");
                        break;

                }
            }
        }
    }


    public void trabalhar () {
        System.out.println("oi trabalho");
    }
}