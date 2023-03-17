package Clases;

import java.awt.Color;
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Usuario
 */
public class Casillas {

    //Atributos
    int PosX;
    int PosY;
    int PosX2;
    int PosY2;
    static int Tamaño = 65;

    int Numero;
    String Color;
    int Adelantar;
    int Retrasar;
    int LanzarDado;

    //Punteros
    Casillas sig, ant;

    public Casillas(int PosX, int PosY, int PosX2, int PosY2, int Numero, String Color, int Adelantar, int Retrasar, int LanzarDado) {
        this.PosX = PosX;
        this.PosY = PosY;
        this.PosX2 = PosX2;
        this.PosY2 = PosY2;
        this.Numero = Numero;
        this.Color = Color;
        this.Adelantar = Adelantar;
        this.Retrasar = Retrasar;
        this.LanzarDado = LanzarDado;
        this.sig = this.ant = null;

    }

    public int getPosX() {
        return PosX;
    }

    public void setPosX(int PosX) {
        this.PosX = PosX;
    }

    public int getPosY() {
        return PosY;
    }

    public void setPosY(int PosY) {
        this.PosY = PosY;
    }

    public int getPosX2() {
        return PosX2;
    }

    public void setPosX2(int PosX2) {
        this.PosX2 = PosX2;
    }

    public int getPosY2() {
        return PosY2;
    }

    public void setPosY2(int PosY2) {
        this.PosY2 = PosY2;
    }

    public static int getTamaño() {
        return Tamaño;
    }

    public static void setTamaño(int Tamaño) {
        Casillas.Tamaño = Tamaño;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
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

    public Casillas getSig() {
        return sig;
    }

    public void setSig(Casillas sig) {
        this.sig = sig;
    }

    public Casillas getAnt() {
        return ant;
    }

    public void setAnt(Casillas ant) {
        this.ant = ant;
    }

    public void Pintar(Graphics graphics) {

        if (this.getColor().equals("")) {
            graphics.drawRect(PosX, PosY, Tamaño, Tamaño);

        }
        if (this.getColor().equals("Verde")) {
            graphics.drawRect(PosX, PosY, Tamaño, Tamaño);

        }
        if (this.getColor().equals("Rojo")) {
            graphics.drawRect(PosX, PosY, Tamaño, Tamaño);

        }
        if (this.getColor().equals("Azul")) {
            graphics.drawRect(PosX, PosY, Tamaño, Tamaño);

        }

        if (this.getColor().equals("Amarillo")) {
            graphics.drawRect(PosX, PosY, Tamaño, Tamaño);

        }
       
    }
}
