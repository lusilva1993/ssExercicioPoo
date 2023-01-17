public class Moto extends Veiculo{

    // Sobrescrita
    //assinatura acelerar()
    public void acelerar(){
        System.out.println("Acelerando a moto!");
    }

    // Sobrescrita
    //assinatura acelerar(String, String)
    public void definidoVeiculo(String cor, String marca){
        System.out.println("Moto " +  marca + " da cor " + cor +".");
    }

    // Sobrecarga
    //assinatura acelerar(Integer)
    public void acelerar(Integer velocidade){
        System.out.println("A moto está a " + velocidade + "km/h.");
    }

    // Sobrecarga
    //assinatura definidoVeiculo(String)
    public void definidoVeiculo(String modelo){
        System.out.println("Essa moto é uma " + modelo + ".");
    }

}
