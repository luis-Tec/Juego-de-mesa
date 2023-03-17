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
public class Turnos {

    String color;
    Turnos sig;
    Turnos ant;
    int numeroCasilla;
    boolean ganador;

    public Turnos(String color, int numeroCasilla, boolean ganador) {
        this.color = color;
        this.sig = null;
        this.ant = null;
        this.numeroCasilla = numeroCasilla;
        this.ganador = ganador;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Turnos getSig() {
        return sig;
    }

    public void setSig(Turnos sig) {
        this.sig = sig;
    }

    public Turnos getAnt() {
        return ant;
    }

    public void setAnt(Turnos ant) {
        this.ant = ant;
    }

    public int getNumeroCasilla() {
        return numeroCasilla;
    }

    public void setNumeroCasilla(int numeroCasilla) {
        this.numeroCasilla = numeroCasilla;
    }

    public boolean isGanador() {
        return ganador;
    }

    public void setGanador(boolean ganador) {
        this.ganador = ganador;
    }

}
