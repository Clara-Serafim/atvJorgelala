package pacote_a;

public class Base {
    public String attPublico = "publico_A";
    protected String attProtegido = "protegido_A";
    String attPadrao = "padrao_A";
    private String attPrivado = "privado_A";


    public Base(String attPublico, String attProtegido, String attPadrao, String attPrivado) {
        this.attPublico = attPublico;
        this.attProtegido = attProtegido;
        this.attPadrao = attPadrao;
        this.attPrivado = attPrivado;

    }
}
