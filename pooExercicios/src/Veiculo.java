public class Veiculo {

    private String cor;
    private String modelo;
    private String marca;
    private String placa;
    private Integer velocidade;

    public Veiculo(){
    }

    public Veiculo(String cor, String modelo, String marca, String placa) {
        this.cor = cor;
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Integer getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Integer velocidade) {
        this.velocidade = velocidade;
    }

    public void acelerar(){
        System.out.println("Acelerando veiculo.");
    }

    public void definidoVeiculo(String cor, String marca){
        System.out.println("Veiculo " + marca + " " + cor);
    }



}
