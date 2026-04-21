package domain;

public abstract class Vehiculo {
    protected String patente;
    protected Marca marca;
    protected String modelo;
    protected int anio;
    protected double capacidadCarga;
    protected Sucursal sucursal;
    private VehiculoTipo tipo;
    protected double kmARecorrer; 

    public Vehiculo(VehiculoTipo tipo, String patente, Marca marca, String modelo, int anio, double capacidadCarga, Sucursal sucursal, double kmARecorrer) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.capacidadCarga = capacidadCarga;
        this.sucursal = sucursal;
        this.tipo = tipo;
        this.kmARecorrer = kmARecorrer; // Lo asignamos acá
    }

    public String getPatente() {
        return patente;
    }

    public VehiculoTipo getTipo(){
        return tipo;
    }

    public double getCapacidadCarga(){
        return capacidadCarga;
    }

    public int getAnio(){
        return anio;
    }

    // 3. AGREGAMOS EL GETTER: Lo va a necesitar el ViewModel
    public double getKmARecorrer() {
        return kmARecorrer;
    }

    public String getCodigoSucursal(){
        return sucursal.getCodigo();
    }

    // 4. CAMBIO IMPORTANTE: Como es una clase abstracta, el método debería ser abstracto
    // o al menos dejar que los hijos lo sobreescriban bien.
    public abstract double calcularConsumo(double kilometros);

    public boolean esDe(VehiculoTipo tipo){
        return this.tipo == tipo;
    }

    @Override
    public String toString() {
        // Usamos marca.getNombre() porque ahora Marca es un objeto
        return marca.getNombre() + " " + modelo + " - Sucursal: " + sucursal.getCodigo();
    }
}
