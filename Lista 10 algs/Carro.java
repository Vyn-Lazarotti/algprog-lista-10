public class Carro{
    private String modelo;
    private int ano;
    private String cor;

    public Pessoa(String modelo, int ano, String cor){
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public int getAno(){
        return ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }

    public void acelerar(){
        System.out.println("acelerando!");
    }
    public void parar(){
        System.out.println("parando");
    }
}

class App{
    public static void main(String[] args) {
        Carro carro = new Carro("Honda NSX", 1991, "Vermelho");

        System.out.println(carro.getNome() + " está ");
        carro.acelerar();
    }
}
