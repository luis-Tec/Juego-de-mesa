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
public class Usuarios {

    //Atributos
    String Nombre;
    String Apellido;
    int Edad;
    String NombreUsuario;
    String Contraseña;
    String TipoUsuario;

    //Punteros
    Usuarios sig, ant;
    Mapas sigMapa;

    public Usuarios(String Nombre, String Apellido, int Edad, String NombreUsuario, String Contraseña, String TipoUsuario) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.NombreUsuario = NombreUsuario;
        this.Contraseña = Contraseña;
        this.TipoUsuario = TipoUsuario;
        sig = ant = null;
        sigMapa = null;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getTipoUsuario() {
        return TipoUsuario;
    }

    public void setTipoUsuario(String TipoUsuario) {
        this.TipoUsuario = TipoUsuario;
    }

    public Usuarios getSig() {
        return sig;
    }

    public void setSig(Usuarios sig) {
        this.sig = sig;
    }

    public Usuarios getAnt() {
        return ant;
    }

    public void setAnt(Usuarios ant) {
        this.ant = ant;
    }

    public Mapas getSigMapa() {
        return sigMapa;
    }

    public void setSigMapa(Mapas sigMapa) {
        this.sigMapa = sigMapa;
    }

}
