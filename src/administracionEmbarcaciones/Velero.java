package administracionEmbarcaciones;

public class Velero extends Embarcacion{

    private int cantidadDeMastiles;

    public Velero(Capitan capitan, double precioBase, int anhoFabricacion, double eslora, int cantidadDeMastiles) {
        super(capitan, precioBase, anhoFabricacion, eslora);
        this.cantidadDeMastiles = cantidadDeMastiles;
    }

    public boolean validarTamanoGrande(){//Metodo para validar si un administracionEmbarcaciones.Velero es grande o no
        return this.cantidadDeMastiles > 4;
    }
    @Override
    public double calcularMontoAlquiler() {
        double valorAlquiler = this.getPrecioBase() + this.getValorAdicional();
        //Se implementa que si el velero es grande se incremente el valor adicional en 20000
        if (this.validarTamanoGrande()){
            valorAlquiler += 20000;
        }
        return valorAlquiler;
    }

    @Override
    public String mostrarInformacionEmbarcacion(){
        return super.mostrarInformacionEmbarcacion() +
                "\nTipo de embarcación: administracionEmbarcaciones.Velero" +
                "\nCantidad de mástiles: " + this.cantidadDeMastiles +
                "\nValor alquiler: " + this.calcularMontoAlquiler() + "\n";
    }
}
