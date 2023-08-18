package sistemaDeParqueo;

public class Main {
    public static void main(String[] args) {

        Carro carroRenault = new Carro("FFG988","Renault", "Sandero");
        Carro carroToyota = new Carro("ABC156","Toyota", "TXL");
        Carro carroChevrolet = new Carro("GRS569","Chevrolet", "Spark");
        Carro carroMazda = new Carro("MSL520","Mazda", "CX30");
        Carro carroKia = new Carro("WQD631","KIA", "Picanto");
        Carro carroFord = new Carro("XMO047","Ford", "Raptor");

        Parqueadero parkinkCar = new Parqueadero(2000);

        parkinkCar.mostrarEstadoParqueadero();

        if (parkinkCar.parquearCarro(carroRenault, 5,9)){
            System.out.println("Carro parqueado con éxito");
        }

        parkinkCar.mostrarEstadoParqueadero();

        if (parkinkCar.parquearCarro(carroRenault, 1,3)){
            System.out.println("Carro parqueado con éxito");
        }

        parkinkCar.mostrarEstadoParqueadero();

        if (parkinkCar.parquearCarro(carroToyota, 1,3)){
            System.out.println("Carro parqueado con éxito");
        }

        parkinkCar.mostrarEstadoParqueadero();

        if (parkinkCar.parquearCarro(carroToyota, 4,3)){
            System.out.println("Carro parqueado con éxito");
        }

        parkinkCar.mostrarEstadoParqueadero();

        if (parkinkCar.parquearCarro(carroChevrolet, 2,3)){
            System.out.println("Carro parqueado con éxito");
        }

        parkinkCar.mostrarEstadoParqueadero();

        if (parkinkCar.parquearCarro(carroFord, 1,10)){
            System.out.println("Carro parqueado con éxito");
        }

        parkinkCar.mostrarEstadoParqueadero();

        if (parkinkCar.parquearCarro(carroKia, 8,3)){
            System.out.println("Carro parqueado con éxito");
        }

        parkinkCar.mostrarEstadoParqueadero();

        if (parkinkCar.parquearCarro(carroMazda, 9,8)){
            System.out.println("Carro parqueado con éxito");
        }

        parkinkCar.mostrarEstadoParqueadero();

        System.out.println("Valor del parquéo: " + parkinkCar.cobrarPorTiempo(carroRenault, 2));
        System.out.println("Valor del parquéo: " + parkinkCar.cobrarPorTiempo(carroChevrolet, 5));
        System.out.println("Valor del parquéo: " + parkinkCar.cobrarPorTiempo(carroToyota, 8));

        parkinkCar.setTarifaHora(2500);

        System.out.println("Valor del parquéo: " + parkinkCar.cobrarPorTiempo(carroFord, 1));
        System.out.println("Valor del parquéo: " + parkinkCar.cobrarPorTiempo(carroKia, 3));
        System.out.println("Valor del parquéo: " + parkinkCar.cobrarPorTiempo(carroMazda, 6));
    }



}
