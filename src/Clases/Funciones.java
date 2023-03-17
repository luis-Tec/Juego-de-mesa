/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Usuario
 */
public class Funciones {

    //Atributos
    String Color;
    int Adelantar;
    int Retrasar;
    int LanzarDado;

    //Puntero
    Funciones sig, ant;

    public Funciones(String Color, int Adelantar, int Retrasar, int LanzarDado) {
        this.Color = Color;
        this.Adelantar = Adelantar;
        this.Retrasar = Retrasar;
        this.LanzarDado = LanzarDado;
        this.sig = this.ant = null;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getAdelantar() {
        return Adelantar;
    }

    public void setAdelantar(int Adelantar) {
        this.Adelantar = Adelantar;
    }

    public int getRetrasar() {
        return Retrasar;
    }

    public void setRetrasar(int Retrasar) {
        this.Retrasar = Retrasar;
    }

    public int getLanzarDado() {
        return LanzarDado;
    }

    public void setLanzarDado(int LanzarDado) {
        this.LanzarDado = LanzarDado;
    }

    public Funciones getSig() {
        return sig;
    }

    public void setSig(Funciones sig) {
        this.sig = sig;
    }

    public Funciones getAnt() {
        return ant;
    }

    public void setAnt(Funciones ant) {
        this.ant = ant;
    }

}
