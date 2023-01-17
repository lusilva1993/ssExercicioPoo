/*
 * GRUPO:
 * LUCIANA
 * IVO
 * JOYCE
 * */

public class Main {
    public static void main(String[] args) {

        Carro veiculo1 = new Carro();
        veiculo1.acelerar();
        veiculo1.definidoVeiculo("verde", "X3");

        veiculo1.acelerar("152451254B", 115);
        veiculo1.definidoVeiculo("BMW");

        System.out.println();

        Moto veiculo2 = new Moto();
        veiculo2.acelerar();
        veiculo2.definidoVeiculo("pink", "Honda");

        veiculo2.acelerar(15);
        veiculo2.definidoVeiculo("XRE300");

    }
}