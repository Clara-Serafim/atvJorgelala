import entidades.Carro;
import entidades.Motor;

public class runMotor {
    public static void main(String[] args) {

        Motor m = new Motor(2, 1.5, 50);
        Carro c = new Carro("uno", "fiat", m);

        System.out.println("Potecia do "+c.getNome()+", "+c.getFabricante()+":");
        System.out.println(c.getMotor().getPotencia());
    }
}