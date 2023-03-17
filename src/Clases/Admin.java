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
public class Admin {

    String Nombre;
    String Apellido;
    int Edad;
    String NombreUsuario;
    String Contraseña;
    String TipoUsuario;
    Admin sig;
    Funciones sigFunc;
    Fichas sigFicha;

    public Admin(String Nombre, String Apellido, int Edad, String NombreUsuario, String Contraseña, String TipoUsuario) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.NombreUsuario = NombreUsuario;
        this.Contraseña = Contraseña;
        this.TipoUsuario = TipoUsuario;
        this.sig = null;
        this.sigFunc = null;
        this.sigFicha = null;
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

    public Admin getSig() {
        return sig;
    }

    public void setSig(Admin sig) {
        this.sig = sig;
    }

    public Funciones getSigFunc() {
        return sigFunc;
    }

    public void setSigFunc(Funciones sigFunc) {
        this.sigFunc = sigFunc;
    }

}
