public class Camera{
    private String modelo;

    public Camera(String modeo){
        this.modelo = modelo;
    }

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
   
    public void fotografar(){
        System.out.println("fotografando");
    }
}

class App{
    public static void main(String[] args) {
        Camera camera = new Camera("Canon G7X");

        System.out.println(camera.getModelo() + " está ");
        camera.fotografar();
    }
}
