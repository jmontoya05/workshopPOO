package administracionEmbarcaciones;

public class Yate extends Embarcacion{
    private int cantidadDeCamarotes;

    public Yate(Capitan capitan, double precioBase, int anhoFabricacion, double eslora, int cantidadDeCamarotes) {
        super(capitan, precioBase, anhoFabricacion, eslora);
        this.cantidadDeCamarotes = cantidadDeCamarotes;
    }

    public boolean validarLujo(){//Metodo para validar si un administracionEmbarcaciones.Yate es lujoso o no
        return this.cantidadDeCamarotes > 7;
    }
    @Override
    public double calcularMontoAlquiler() {
        double valorAlquiler = this.getPrecioBase() + this.getValorAdicional();
        //Se implementa que si el yate es lujose se incremente el valor adicional en 20000
        if (this.validarLujo()){
            valorAlquiler += 20000;
        }
        return valorAlquiler;
    }

    public void comprarYate(){
        double precioVenta;
        double adicional = 0;
        //Si el yate es lujoso, se incrementa el valor base en 20000
        if (this.validarLujo()){
            adicional = this.getPrecioBase() + 20000;
        }

        //Se establece precio del yate multiplicando * 4 el precio base + el valor adicional
        // ya que en el enunciado no se especificó un monto especifico para la compra
        precioVenta = (this.getPrecioBase() * 4) + adicional;
        System.out.println("Se ha vendido el yate por un valor de : " + precioVenta);
    }

    @Override
    public String mostrarInformacionEmbarcacion(){
        return super.mostrarInformacionEmbarcacion() +
                "\nTipo de embarcación: administracionEmbarcaciones.Yate" +
                "\nCantidad de camarotes: " + this.cantidadDeCamarotes +
                "\nValor alquiler: " + this.calcularMontoAlquiler() + "\n";
    }
   
}
