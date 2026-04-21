package domain;

public class VehiculoElectrico extends Vehiculo {
    private double kwhBase;

    public VehiculoElectrico(String patente, Marca marca, String modelo, int anio, double capacidadCarga,
                             Sucursal sucursal, double kwhBase,double kmARecorrer) {
        super(VehiculoTipo.ELECTRICO, patente, marca, modelo, anio, capacidadCarga, sucursal, kmARecorrer);
        this.kwhBase = kwhBase;
    }
@Override
    public double calcularConsumo(double kilometros) {
        double total = (this.kwhBase * kilometros)/100;

        if (capacidadCarga > 1200) {
            total = total * 1.15;
        }

        return total;
    }
}