package entidades;

public class Carrinho extends Carro{
    private String cor;
    public Carrinho(String nome, String fabricante, Motor motor, String cor){
        super(nome, fabricante, motor);
        this.cor = cor;
    }

    public void fazerBibi(){
        System.out.println("Bibiiiiiiiiiiiiii");
    }


}
