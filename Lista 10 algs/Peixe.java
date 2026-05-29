public class Peixe{
    private String especie;

    public Peixe(String especie){
        this.especie = especie;
    }

    public String getEspecie(){
        return especie;
    }
    public void setEspecie(String especie){
        this.especie = especie;
    }
   
    public void nadar(){
        System.out.println("nadando bem rápido!");
    }
    public void comer(){
        System.out.println("devorando outro peixe");
    }
}

class App{
    public static void main(String[] args) {
        Peixe peixe = new Peixe("Megalodon");

        System.out.println(peixe.getEspecie() + " está ");
        peixe.nadar();
    }
}
