package data;

import domain.*;
import java.util.ArrayList;
import java.util.Optional;

public class Persistencia {
    private static ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    private static ArrayList<Responsable> responsables = new ArrayList<>();
    private static ArrayList<Sucursal> sucursales = new ArrayList<>();
    private static ArrayList<Marca> marcas = new ArrayList<>();
    
    private static void inicializarResponsables(){
        Responsable r1 = new Responsable("Carlos Gómez", "25444111", "3815551111");
        Responsable r2 = new Responsable("Laura Pérez", "30111222", "3815552222");
        // ¡IMPORTANTE! Hay que agregarlos a la lista
        responsables.add(r1);
        responsables.add(r2);
    }
    
    private static void inicializarSucursales(){
        // Ahora get(0) y get(1) no van a fallar porque ya agregamos los responsables antes
        Sucursal s1 = new Sucursal("SUC01", "Av. Belgrano 1200", "Tucumán", responsables.get(0));
        Sucursal s2 = new Sucursal("SUC02", "San Martín 450", "Yerba Buena", responsables.get(1));
        
        // ¡IMPORTANTE! También hay que agregar las sucursales
        sucursales.add(s1);
        sucursales.add(s2);
    }

    private static void inicializarMarcas() {
        marcas.add(new Marca("Renault", "Francia"));
        marcas.add(new Marca("Ford", "Estados Unidos"));
        marcas.add(new Marca("Iveco", "Italia"));
        marcas.add(new Marca("Mercedes", "Alemania"));
    }

    private static void inicializarVehiculos(){
        // Vacío para que vos cargues desde la ventana
    }
    
    public static ArrayList<Vehiculo> getVehiculos(){
        return vehiculos;
    }

    public static ArrayList<Sucursal> getSucursales() {
        return sucursales;
    }

    public static ArrayList<Marca> getMarcas() {
        return marcas;
    }
    
    public static Optional<Vehiculo> getVehiculo(String patente){
        return vehiculos.stream()
                .filter(v -> v.getPatente().equals(patente))
                .findFirst();
    }
    
    public static void inicializar(){
        // EL ORDEN ES CLAVE:
        inicializarResponsables(); // 1. Llenamos responsables
        inicializarSucursales();   // 2. Usamos esos responsables para las sucursales
        inicializarMarcas();       // 3. Llenamos marcas para los combos
        inicializarVehiculos();    // 4. Lista de vehículos vacía
    }
}