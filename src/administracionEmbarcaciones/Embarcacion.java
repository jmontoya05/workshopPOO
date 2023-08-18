package administracionEmbarcaciones;

public abstract class Embarcacion {

    private Capitan capitan;
    private double precioBase;
    private double valorAdicional;
    private int anhoFabricacion;
    private double eslora;

    public Embarcacion(Capitan capitan, double precioBase, int anhoFabricacion, double eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.anhoFabricacion = anhoFabricacion;
        this.eslora = eslora;
        if (this.anhoFabricacion > 2020){
            this.valorAdicional = 20000;
        } else {
            this.valorAdicional = 0;
        }
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public abstract double calcularMontoAlquiler();

    public String mostrarInformacionEmbarcacion(){
        return this.capitan.obtenerDatosCapitan() +
                "\nDatos de la embarcacion: " +
                "\nPrecio base: " + this.precioBase +
                "\nValor adicional: " + this.valorAdicional +
                "\nAño de fabricación: " + this.anhoFabricacion +
                "\nEslora: " +this.eslora;
    }
    
}
