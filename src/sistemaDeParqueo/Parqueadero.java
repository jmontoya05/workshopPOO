package sistemaDeParqueo;

public class Parqueadero {

    private Carro[][] estacionamientos;
    private double tarifaHora;

    public Parqueadero(double tarifaHora) {
        this.tarifaHora = tarifaHora;
        this.estacionamientos = new Carro[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                this.estacionamientos[i][j] = null;
            }
        }
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    public boolean parquearCarro(Carro carro, int fila, int columna) {

        if ((fila >= 1 && fila <= 9) && (columna >= 1 && columna <= 9)) {
            if (this.estacionamientos[fila - 1][columna - 1] == null) {
                if (encontrarCarro(carro)) {
                    System.out.println("El carro ya está parqueado en otra celda");
                    return false;
                } else {
                    this.estacionamientos[fila - 1][columna - 1] = carro;
                    carro.mostrarInformacionCarro();
                    return true;
                }

            } else {
                System.out.println("La celda " + fila + "," + columna + " ya está ocupada");
                return false;
            }
        } else {
            System.out.println("No es posible parquear, ingresó una dimensión fuera de los límites (9x9)");
            return false;
        }

    }

    public double cobrarPorTiempo(Carro carro, int horas) {
        if (encontrarCarro(carro)) {
            System.out.println(carro.mostrarInformacionCarro());
            return this.tarifaHora * horas;
        } else {
            System.out.println("El vehiculo no se encuentra en este parqueadero");
            return 0;
        }
    }

    public void mostrarEstadoParqueadero() {
        System.out.println("Fil/Col   1    2    3    4    5    6    7    8    9");
        System.out.println("        —————————————————————————————————————————————");
        for (int i = 0; i < 9; i++) {
            System.out.print(" " + (i + 1) + "      ");
            for (int j = 0; j < 9; j++) {
                if (this.estacionamientos[i][j] == null) {
                    System.out.print("|   |");
                } else {
                    System.out.print("| X |");
                }
            }
            System.out.println(" ");
            System.out.println("        —————————————————————————————————————————————");
        }
    }
   //Metodo para validar si un carro está en el parqueadero
    private boolean encontrarCarro(Carro carro) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (carro.equals(this.estacionamientos[i][j])) {
                    return true;
                }
            }
        }
        return false;
    }
}
