package sistemaDeParqueo;

public class Carro {

    private String placa;
    private String marca;
    private String modelo;

    public Carro(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String mostrarInformacionCarro(){
        return "\nPlaca: " + this.placa +
                "\nMarca: " + this.marca +
                "\nModelo: " + this.modelo;
    }
}
