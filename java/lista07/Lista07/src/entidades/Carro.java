package entidades;

public class Carro extends Produto{
    private int quantPortas;
    private int quantRodas;

    public Carro(String nome, double preco, int quantPortas, int quantRodas) {
        super(nome, preco);
        this.quantPortas = quantPortas;
        this.quantRodas = quantRodas;
    }

    public int getQuantPortas() {
        return quantPortas;
    }

    public int getQuantRodas() {
        return quantRodas;
    }

    public void getValor(){

        if(getPreco() > 10000){
            System.out.println("É caro");
        }
        else{
            System.out.println("É barato");
        }
    }

    public void setQuantPortas(int quantPortas) {
        this.quantPortas = quantPortas;
    }


    public void setQuantRodas(int quantRodas) {
        this.quantRodas = quantRodas;
    }

    public void showInfos(){
        System.out.printf("%nO nome do carro é: %s %nO preço é: %.2f %nTem %d portas e %d rodas ", getNome(),getPreco(),getQuantPortas(),getQuantRodas());
    }
}
