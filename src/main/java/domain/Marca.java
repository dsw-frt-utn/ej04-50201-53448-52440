/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author tatun
 */
public class Marca {
    private String nombre;
    private String pais;
    public Marca(String nombre, String Pais){
    this.nombre = nombre;
    this.pais=pais;
}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }
}
