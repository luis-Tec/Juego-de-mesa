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
public class Fichas {

    String ColorFicha;
    String NombreJugador;
    int numeroCasilla;
    Casillas casilla;
    Fichas sig, ant;

    public Fichas(String ColorFicha, String NombreJugador, int numeroCasilla, Casillas casilla) {
        this.ColorFicha = ColorFicha;
        this.NombreJugador = NombreJugador;
        this.numeroCasilla = numeroCasilla;
        this.casilla = casilla;
        this.sig = null;
        this.ant = null;
    }

    public String getColorFicha() {
        return ColorFicha;
    }

    public void setColorFicha(String ColorFicha) {
        this.ColorFicha = ColorFicha;
    }

    public String getNombreJugador() {
        return NombreJugador;
    }

    public void setNombreJugador(String NombreJugador) {
        this.NombreJugador = NombreJugador;
    }

    public int getNumeroCasilla() {
        return numeroCasilla;
    }

    public void setNumeroCasilla(int numeroCasilla) {
        this.numeroCasilla = numeroCasilla;
    }

    public Casillas getCasilla() {
        return casilla;
    }

    public void setCasilla(Casillas casilla) {
        this.casilla = casilla;
    }

    public Fichas getSig() {
        return sig;
    }

    public void setSig(Fichas sig) {
        this.sig = sig;
    }

    public Fichas getAnt() {
        return ant;
    }

    public void setAnt(Fichas ant) {
        this.ant = ant;
    }

}
