
public class BancoRun {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(0.0);
        //conta1.setSaldo(10.0);
        // mensagem de erro:
        // java: cannot find symbol
        //  symbol:   method setSaldo(double)
        //  location: variable conta1 of type ContaBancaria

        conta1.depositar(150.75); // Saida: Deposito efetuado com sucesso!
        conta1.depositar(50);     // Saida: Deposito efetuado com sucesso!


        System.out.println("o saldo é: " + conta1.getSaldo());
        System.out.println(conta1.sacar(200));
        System.out.println(conta1.sacar(200));
        System.out.println("o saldo é: " + conta1.getSaldo());
    }
}