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
    public void setRaca(String raca){
        this.raca = raca;
    }

    public void latir(){
        System.out.println("AUAUAUAUAU");
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
        Cachorro cachorro = new Cachorro("Rex", 7, "Beagle");

        System.out.println(cachorro.getNome() + " está ");
        cachorro.latir();
    }
}
