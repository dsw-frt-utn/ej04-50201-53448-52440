package domain;

public class VehiculoCombustible extends Vehiculo {
    private double kilometrosPorLitro;
    private double litrosExtra;

    // 1. Agregamos "double kmARecorrer" al final de los parámetros
    public VehiculoCombustible(String patente, Marca marca, String modelo, int anio, double capacidadCarga,
                               Sucursal sucursal, double kilometrosPorLitro, double litrosExtra, double kmARecorrer) {
        
        // 2. IMPORTANTE: Pasamos kmARecorrer al super para que llegue a la clase Vehiculo
        super(VehiculoTipo.COMBUSTIBLE, patente, marca, modelo, anio, capacidadCarga, sucursal, kmARecorrer);
        
        this.kilometrosPorLitro = kilometrosPorLitro;
        this.litrosExtra = litrosExtra;
    }
    
    public double getKilometrosPorLitro() {
        return kilometrosPorLitro;
    }

    public double getLitrosExtra() {
        return litrosExtra;
    }

    @Override
    public double calcularConsumo(double kilometros) {
        // 3. Ahora usamos los kilómetros reales que tiene el objeto
        // (los que vienen de 'this.kmARecorrer' o el parámetro 'kilometros')
        
        double total = kilometros / kilometrosPorLitro;
        int antiguedad = 2026 - this.anio;
        
        if (antiguedad > 5) {
            total += (kilometros / 15) * litrosExtra;
        }
        
        return total;
    }
}