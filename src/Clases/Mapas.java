package Clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Mapas {
    //Atributos
    
    String Nombre;
    String Creador;
    
    
    //Puntero
    Casillas CasillaSig;

    public Mapas(String Nombre, String Creador) {
        this.Nombre = Nombre;
        this.Creador = Creador;
        this.CasillaSig = null;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCreador() {
        return Creador;
    }

    public void setCreador(String Creador) {
        this.Creador = Creador;
    }

    public Casillas getCasillaSig() {
        return CasillaSig;
    }

    public void setCasillaSig(Casillas CasillaSig) {
        this.CasillaSig = CasillaSig;
    }
    
}
