public class Mochila{
    private String modelo;

    public Mochila(String modelo){
        this.modelo = modelo;
    }

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public void guardar(){
        System.out.println("guardando objetos");
    }
}

class App{
    public static void main(String[] args) {
        Mochila mochila = new Mochila("Pelican 2.0");

        System.out.println(pessoa.getModelo() + " está ");
        mochila.guardando();
    }
}
