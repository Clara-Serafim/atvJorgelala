public class Animais {
    //especie, sexo, nome, dataDeNascimento.
    private String especie;
    private String sexo;
    private String nome;
    private String dataDeNascimento;
    private int numSerie;
    static int quantidadeDeAnimais;


    Animais() {
        this.quantidadeDeAnimais++;
    }

    Animais(String especie, String sexo){
        this();
        this.especie = especie;
        this.sexo = sexo;

    }

    Animais(String especie, String sexo, String nome, String dataDeNascimento){
        this(especie, sexo);
        this.dataDeNascimento = dataDeNascimento;
        this.nome = nome;
    }

    public static int getQuantidadeDeAnimais() {
        return quantidadeDeAnimais;
    }


    public int defNumSerie(){
        this.numSerie = numSerie + 1;
        return this.numSerie;
    }


    public void infoAnimais(){
        System.out.printf("Meu nome é: %s %nMinha especie é: %s %nEu nasci em: %s" , nome, especie, dataDeNascimento);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public int getNumSerie() {
        return numSerie;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public String getEspecie() {
        return especie;
    }

    public String getSexo() {
        return sexo;
    }
}
