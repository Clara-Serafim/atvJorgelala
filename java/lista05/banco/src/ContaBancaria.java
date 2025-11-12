public class ContaBancaria {
    private double saldo;


    public ContaBancaria(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void depositar(double valor) {
        if (valor > 0){
            this.saldo = this.saldo + valor;
            System.out.println("Deposito efetuado com sucesso!");
        }
        else {
            System.out.println("Valor a ser depositado inválido");
        }
    }

    public void depositar(int valor) {
        if (valor > 0){
            this.saldo = this.saldo + valor;
            System.out.println("Deposito efetuado com sucesso!");
        }
        else {
            System.out.println("Valor a ser depositado inválido");
        }
    }

    public boolean sacar( double valor) {

        if (valor > this.saldo) {
            System.out.println("Erro! Saldo insuficiente para saque.");
            return false;
        }
        else{
            this.saldo = this.saldo - valor;
            return true;
        }
    }
}
