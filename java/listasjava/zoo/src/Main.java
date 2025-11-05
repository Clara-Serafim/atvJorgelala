import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        Mamifero leao = new Mamifero("Leozinho", "mamifero", 4);
        Mamifero macaco = new Mamifero("Mico", "mamifero", 2);
        Ave papagaio = new Ave("Pipo", "ave", 2);
        Ave pavao = new Ave("Plumo", "ave", 2);
        Peixe tilapia = new Peixe("Glubglub", "peixe", 0);
        Peixe beta = new Peixe("Brutal", "peixe", 0);
        Guia f = new Guia("Jose",21, "1234", "Guia");
        pessoa p = new pessoa("Cleiton", 16);
        Tratador t = new Tratador("Joao",21, "1234", "Tratador");
        Limpeza l = new Limpeza("Jetson",21, "1234", "Limpeza");

        System.out.println("Você deseja passear com os animais, alimentar os animais ou ovir os sons deles? (Insira 1, 2 ou 3)");
        int opc = sc.nextInt();
        switch (opc) {
            case 1:
                f.fazerPasseioAnimais();
                f.realizarPasseio();
            case 2:
                t.alimentarAnimais();
            case 3:
                pavao.emitirSom();

            default:
                System.out.println("Opção invalida");
                break;
        }
    }
}