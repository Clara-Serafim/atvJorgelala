package entidades;

public class Carro {
    private String nome;
    private  String fabricante;
    private Motor motor;
    public Carro(String nome, String fabricante, Motor motor){
        this.nome = nome;
        this.fabricante = fabricante;
        this.motor = motor;
    }

    public String getNome() {
        return nome;
    }

    public Motor getMotor() {
        return motor;
    }

    public String getFabricante() {
        return fabricante;
    }


}
