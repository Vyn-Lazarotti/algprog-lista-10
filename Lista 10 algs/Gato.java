public class Cachorro{
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
    public void setCpf(String raca){
        this.raca = raca;
    }

    public void miar(){
        System.out.println("MIAUUUUUUUUU");
    }
    public void comer(){
        System.out.println("HMMMMM YUUM");
    }
    public void dormir(){
        System.out.println("ZZZ..");
    }
}

class App{
    public static void main(String[] args) {
        Gato gato = new Gato("Garfield", 4, "Laranja");

        System.out.println(gato.getNome() + " está comendo lasanha");
    }
}
