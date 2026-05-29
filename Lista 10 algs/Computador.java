public class Computador{
    private String modelo;
    private double tela;
    private String teclado;
    private String cpu;

    public Pessoa(String modelo, double tela, String teclado, String cpu){
        this.modelo = modelo;
        this.tela = tela;
        this.teclado = teclado;
        this.cpu = cpu;
    }

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public double getTela(){
        return tela;
    }
    public void setTela(double tela){
        this.tela = tela;
    }
    public String getTeclado(){
        return teclado;
    }
    public void setTeclado(String teclado){
        this.teclado = teclado;
    }
    public String getCpu(){
        return cpu;
    }
    public void setCpu(String cpu){
        this.cpu = cpu;
    }

    public void verFilme(){
        System.out.println("transmistindo o filme 'Kamen Rider Saber: Trio Of Deep Sin'");
    }
    public void codar(){
        System.out.println("rodando o Visual Studio Code");
    }
    public void jogar(){
        System.out.println("rodando Dragon Quest");
    }
}

class App{
    public static void main(String[] args) {
        Computador computador = new Computador("Lenovo Ideapad S145", "378.229", "QWERTY", " ");

        System.out.println(computador.getModelo() + " está ");
        computador.verFilme();
    }
}
