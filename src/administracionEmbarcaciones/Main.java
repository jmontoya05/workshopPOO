package administracionEmbarcaciones;

public class Main {
    public static void main(String[] args) {

        Capitan capitanVeterano = new Capitan("David","Jones", 1001);
        Capitan capitanPirata = new Capitan("Jack","Sparrow", 1002);
        Capitan capitanAprendiz = new Capitan("Will","Turner", 1003);
        Capitan capitanMalvado = new Capitan("Barba","Negra", 1004);

        Velero veleroLigero = new Velero(capitanAprendiz,10000,2010,6,2);
        Velero veleroCrucero = new Velero(capitanPirata, 18500, 2021, 12,9);

        System.out.println("El precio de alquiler del velero lígero es de " + veleroLigero.calcularMontoAlquiler());
        System.out.println(veleroLigero.mostrarInformacionEmbarcacion());

        System.out.println("El precio de alquiler del velero crucero es de " + veleroCrucero.calcularMontoAlquiler());
        System.out.println(veleroCrucero.mostrarInformacionEmbarcacion());

        Yate yateRecreo = new Yate(capitanMalvado,25000,2019,3,5);
        Yate yateCrucero = new Yate(capitanVeterano, 37000, 2023, 10,10);

        System.out.println("El precio de alquiler del yate de recreo es de " + yateRecreo.calcularMontoAlquiler());
        System.out.println(yateRecreo.mostrarInformacionEmbarcacion());

        System.out.println("El precio de alquiler del yate crucero es de " + yateCrucero.calcularMontoAlquiler());
        System.out.println(yateCrucero.mostrarInformacionEmbarcacion());



    }
}
