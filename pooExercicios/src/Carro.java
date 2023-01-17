public class Carro extends Veiculo{

    private Integer velocidade;

    // Sobrescrita
    //assinatura acelerar()
    public void acelerar(){
        System.out.println("Acelerando o carro!");
    }

    // Sobrescrita
    //assinatura definidoVeiculo(String , String)
    public void definidoVeiculo(String cor, String modelo){
        System.out.println(modelo + " da cor " + cor + ".");
    }

    // Sobrecarga
    //assinatura acelerar(String, Integer)
    public void acelerar(String placa, Integer velocidade) {
        if (velocidade > 100) {
            System.out.println("Checando placa " + placa + ". O condutor excedeu limite de velocidade e acarretará muta!");
        }
    }

    // Sobrecarga
    //assinatura definidoVeiculo(String)
    public void definidoVeiculo(String marca) {
        System.out.println("Esta marca " + marca + " é conhecida pelos preços exorbitantes!");
    }
}
