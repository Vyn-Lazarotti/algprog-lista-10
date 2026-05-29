public class Dinheiro{
    private double valor;

    public Dinheiro(double valor){
        this.valor = valor;
    }

    public double getValor(){
        return valor;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
    
    public void pagarConta(){
        System.out.println("para pagar as contas do mês");
    }
}

class App{
    public static void main(String[] args) {
        Dinheiro dinheiro = new Dinheiro(574.20);

        System.out.println("Aqui. Esses " + dinheiro.getValor() + " são ");
        dinheiro.pagarConta();
    }
}
