public class Passaro{
    private String nome;
    private int idade;
    private String raca;

    public Pessoa(String nome, int idade, String raca){
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public String getRaca(){
        return raca;
    }
    public void setRaca(String raca){
        this.raca = raca;
    }

    public void voar(){
        System.out.println("voando");
    }
    public void comer(){
        System.out.println("HMMMMM YUUM");
    }
}

class App{
    public static void main(String[] args) {
        Passaro passaro = new Passaro("Mordecai", 23, "Bluejay");

        System.out.println(passaro.getNome() + " está ");
        passaro.voar();
    }
}
