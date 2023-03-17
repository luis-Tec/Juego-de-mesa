package Clases;

import static Clases.Jugar.FichaAmarilla;
import static Clases.Jugar.FichaAzul;
import static Clases.Jugar.FichaRoja;
import static Clases.Jugar.FichaVerde;
import static Clases.Jugar.Ganador;
import static Interfaz.AdminMapas.jComboBoxUsuarios;
import static Interfaz.AdminUsuarios.jComboBoxEliminar;
import static Interfaz.AdminUsuarios.jComboBoxModificar;
import static Interfaz.CargarMapa.Mapas;
import static Interfaz.CargarMapa.jComboBoxUsuarios2;
import static Interfaz.Dado.NumeroDado;
import Interfaz.Login;
import static Interfaz.Login.login;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Usuario
 */
public class Metodos {

    //
    Usuarios Inicio, Fin;

    Admin InicioA, FinA;

    Funciones SigFuncion;

    Mapas SigMapa;

    Casillas InicioCasilla, FinCasilla;

    Turnos inicioT;

    Turnos FinalT;

    public Turnos tempT = inicioT;

    //Admin
    public void insertarUsuariosArchivos(String Nombre, String Apellido, int Edad, String NombreUsuario, String Contraseña, String TipoUsuario) {
        File usuarios = new File("Usuarios.txt");
        try {
            FileWriter escribir = new FileWriter(usuarios, true);
            try (BufferedWriter bW = new BufferedWriter(escribir)) {
                bW.append(Nombre);
                bW.newLine();
                bW.append(Apellido);
                bW.newLine();
                bW.append(Integer.toString(Edad));
                bW.append(NombreUsuario);
                bW.append(Contraseña);
                bW.append(TipoUsuario);
                bW.newLine();
                bW.close();
            }
        } catch (IOException ex) {
        }
    }
//Archivos

    public void cargarUsuarios(String Nombre, String Apellido, int Edad, String NombreUsuario, String Contraseña, String TipoUsuario) {
        Usuarios NuevoUsuario = new Usuarios(Nombre, Apellido, Edad, NombreUsuario, Contraseña, TipoUsuario);
        if (Inicio == null) {
            Inicio = Fin = NuevoUsuario;
        } else {
            Inicio.ant = NuevoUsuario;
            NuevoUsuario.sig = Inicio;
            Inicio = NuevoUsuario;
        }
    }

    public void leerUsuarios() {
        File usuarios = new File("Persona.txt");
        try {
            BufferedReader lector = new BufferedReader(new FileReader(usuarios));
            int temp = 1;
            String bfRead;
            String nombre = "";
            String apellido = "";
            int edad = 0;
            String nombreUsuario = "";
            String contraseña = "";
            String tipoUsuario = "";

            while ((bfRead = lector.readLine()) != null) {
                if (temp == 1) {
                    nombre = bfRead;
                }
                if (temp == 2) {
                    apellido = bfRead;
                }
                if (temp == 3) {
                    edad = Integer.parseInt(bfRead);
                }
                if (temp == 4) {
                    nombreUsuario = bfRead;
                }
                if (temp == 5) {
                    contraseña = bfRead;
                }
                if (temp == 6) {
                    tipoUsuario = (bfRead);
                    cargarUsuarios(nombre, apellido, edad, nombreUsuario, contraseña, tipoUsuario);
                    temp = 0;
                }
                temp++;
            }
            System.out.println("Usuarios Cargados");

        } catch (IOException ex) {
        }
    }

    public void insertarMapasArchivos(String NombreUsuario, String NombreMapa, int PosX, int PosY, int PosX2, int PosY2, int Numero, String Color, int Adelantar, int Retrasar, int LanzarDado) {
        File mapas = new File("Mapas.txt");
        try {
            FileWriter escribir = new FileWriter(mapas, true);
            try (BufferedWriter bW = new BufferedWriter(escribir)) {
                bW.append(NombreUsuario);
                bW.newLine();
                bW.append(NombreMapa);
                bW.newLine();
                bW.append(Integer.toString(PosX));
                bW.newLine();
                bW.append(Integer.toString(PosY));
                bW.newLine();
                bW.append(Integer.toString(PosX2));
                bW.newLine();
                bW.append(Integer.toString(PosY2));
                bW.append(Integer.toString(Numero));
                bW.newLine();
                bW.append(Color);
                bW.newLine();
                bW.append(Integer.toString(Adelantar));
                bW.newLine();
                bW.append(Integer.toString(Retrasar));
                bW.newLine();
                bW.append(Integer.toString(LanzarDado));
                bW.newLine();
                bW.close();
            }
        } catch (IOException ex) {
        }
    }

    public void cargarMapas(String NombreUsuario, String NombreMapa, int PosX, int PosY, int PosX2, int PosY2, int Numero, String Color, int Adelantar, int Retrasar, int LanzarDado) {
        Casillas AuxCasillas = Login.RespaldoUsuario.getSigMapa().getCasillaSig();
        Casillas casillas = new Casillas(PosX, PosY, PosX2, PosY2, Numero, Color, Adelantar, Retrasar, LanzarDado);
        if (AuxCasillas == null) {
            Login.RespaldoUsuario.sigMapa.CasillaSig = casillas;
        } else {
            while (AuxCasillas != null) {
                if (AuxCasillas.sig == null) {
                    AuxCasillas.sig = casillas;
                    casillas.ant = AuxCasillas;
                }
                AuxCasillas = AuxCasillas.sig;
            }
        }
    }

    public void leerMapas() {
        File usuarios = new File("Persona.txt");
        try {
            BufferedReader lector = new BufferedReader(new FileReader(usuarios));
            int temp = 1;
            String bfRead;
            String nombreUsuario = "";
            String nombreMapa = "";
            String Color = "";
            int PosX = 0;
            int PosY = 0;
            int PosX2 = 0;
            int PosY2 = 0;
            int numero = 0;
            int adelantar = 0;
            int retrasar = 0;
            int lanzarDado = 0;
            while ((bfRead = lector.readLine()) != null) {
                if (temp == 1) {
                    nombreUsuario = bfRead;
                }
                if (temp == 2) {
                    nombreMapa = bfRead;
                }
                if (temp == 3) {
                    PosX = Integer.parseInt(bfRead);
                }
                if (temp == 4) {
                    PosY = Integer.parseInt(bfRead);
                }
                if (temp == 5) {
                    PosX2 = Integer.parseInt(bfRead);
                }
                if (temp == 6) {
                    PosX2 = Integer.parseInt(bfRead);
                }
                if (temp == 7) {
                    numero = Integer.parseInt(bfRead);
                }
                if (temp == 8) {
                    adelantar = Integer.parseInt(bfRead);
                }
                if (temp == 9) {
                    retrasar = Integer.parseInt(bfRead);
                }
                if (temp == 10) {
                    lanzarDado = Integer.parseInt(bfRead);
                    cargarMapas(nombreUsuario, nombreMapa, PosX, PosY, PosX2, PosY2, numero, Color, adelantar, retrasar, lanzarDado);
                    temp = 0;
                }
                temp++;
            }
            System.out.println("Mapas Cargados");

        } catch (IOException ex) {
        }
    }
///////////

    //Metodo para ingresar usuarios a la lista
    public boolean RegistroUsuarios(String Nombre, String Apellido, int Edad, String NombreUsuario, String Contraseña, String TipoUsuario) {
        Usuarios NuevoUsuario = new Usuarios(Nombre, Apellido, Edad, NombreUsuario, Contraseña, TipoUsuario);
        if (Inicio == null) {
            Inicio = Fin = NuevoUsuario;
            insertarUsuariosArchivos(Nombre, Apellido, Edad, NombreUsuario, Contraseña, TipoUsuario);
            return true;
        }
        if (VerificarUsuario(NombreUsuario) == null) {
            Inicio.ant = NuevoUsuario;
            NuevoUsuario.sig = Inicio;
            Inicio = NuevoUsuario;
            insertarUsuariosArchivos(Nombre, Apellido, Edad, NombreUsuario, Contraseña, TipoUsuario);
            return true;

        }
        return false;

    }
//Verifica que el nombre de usuario no este en uso

    public Usuarios VerificarUsuario(String Nombreusuario) {
        Usuarios aux = Inicio;
        while (aux != null) {
            if (aux.NombreUsuario.equals(Nombreusuario)) {
                return aux;
            }
            aux = aux.sig;
        }

        return null;
    }
//Elimina un usuario de la lista

    public boolean EliminarUsuario(String NombreUsuario) {
        Usuarios UsuarioAux = VerificarUsuario(NombreUsuario);
        if (UsuarioAux == Inicio) {
            if (UsuarioAux == null) {
                return false;
            } else {
                Inicio = Inicio.sig;
                Login.metodos.MostrarNombreUsuario();
                return true;
            }

        }
        Usuarios aux = Inicio;
        if (UsuarioAux.sig == null) {
            UsuarioAux.ant.sig = null;
            Login.metodos.MostrarNombreUsuario();
            return true;
        }
        while (aux != null) {
            if (aux.getNombreUsuario().equals(NombreUsuario)) {
                aux.ant.sig = aux.sig;
                aux.sig.ant = aux.ant;
                Login.metodos.MostrarNombreUsuario();
                return true;
            } else {
                aux = aux.sig;
            }
        }
        return false;
    }
//Verifica el nombre de usuario y la contraseña

    public Usuarios InicioSesion(String NombreUsuario, String Contraseña) {
        Usuarios aux = Inicio;
        while (aux != null) {
            if (aux.NombreUsuario.equals(NombreUsuario) && aux.Contraseña.equals(Contraseña)) {
                return aux;
            }
            aux = aux.sig;
        }
        return null;
    }
//Verifica el nombre de usuario y la contraseña

    public Admin InicioSesionAdmin(String NombreUsuario, String Contraseña) {
        Admin aux = InicioA;
        while (aux != null) {
            if (aux.NombreUsuario.equals(NombreUsuario) && aux.Contraseña.equals(Contraseña)) {
                return aux;
            }
            aux = aux.sig;
        }
        return null;
    }
//Registra un administrador

    public boolean RegistrarAdministrador(String Nombre, String Apellido, int Edad, String NombreUsuario, String Contraseña, String TipoUsuario) {
        Admin admin = new Admin(Nombre, Apellido, Edad, NombreUsuario, Contraseña, TipoUsuario);

        if (InicioA == null) {
            InicioA = admin;
            return true;
        }

        return false;

    }
//Inserta un mapa a un usuario

    public boolean InsertarMapa(String NombreUsuario, String NombreMapa) {
        if (VerificarUsuario(NombreUsuario) != null) {
            Usuarios Aux = VerificarUsuario(NombreUsuario);
            Mapas Nuevo = new Mapas(NombreMapa, NombreUsuario);
            if (Aux.sigMapa == null) {
                Aux.sigMapa = Nuevo;
                return true;
            }
        }
        return false;
    }

    public Usuarios Mapa(String NombreUsuario) {
        if (VerificarUsuario(NombreUsuario) != null) {
            Usuarios Aux = VerificarUsuario(NombreUsuario);
            if (Aux.sigMapa != null) {
                return Aux;
            }
        }
        return null;
    }
//Agrega casillas al mapa del usuario actual

    public boolean AgregarCasillas(String NombreUsuario, int PosX, int PosY, int PosX2, int PosY2, int Numero, String Color, int Adelantar, int Retrasar, int LanzarDado, int MouseX, int MouseY) {
        Casillas AuxCasillas = Login.RespaldoUsuario.getSigMapa().getCasillaSig();
        Casillas casillas = new Casillas(PosX, PosY, PosX2, PosY2, Numero, Color, Adelantar, Retrasar, LanzarDado);
        if (AuxCasillas == null) {
            Login.RespaldoUsuario.sigMapa.CasillaSig = casillas;
            System.out.println(Login.RespaldoUsuario.sigMapa.CasillaSig.getPosX());
            insertarMapasArchivos(NombreUsuario, Login.RespaldoUsuario.getSigMapa().Nombre, PosX, PosY, PosX2, PosY2, Numero, Color, Adelantar, Retrasar, LanzarDado);
            return true;
        }
        if (VerificarCasilla(NombreUsuario, PosX, PosY, PosX2, PosY2, MouseX, MouseY) == null) {

            while (AuxCasillas != null) {
                if (AuxCasillas.sig == null) {
                    AuxCasillas.sig = casillas;
                    casillas.ant = AuxCasillas;
                    insertarMapasArchivos(NombreUsuario, Login.RespaldoUsuario.getSigMapa().Nombre, PosX, PosY, PosX2, PosY2, Numero, Color, Adelantar, Retrasar, LanzarDado);
                    return true;
                }
                AuxCasillas = AuxCasillas.sig;
            }

        }
        return false;

    }
//Verifica que la casilla no se cree dentro de otra

    public Casillas VerificarCasilla(String NombreUsuario, int PosX, int PosY, int PosX2, int PosY2, int MouseX, int MouseY) {
        Casillas AuxCasillas = Login.RespaldoUsuario.getSigMapa().CasillaSig;
        while (AuxCasillas != null) {
            if (MouseX >= AuxCasillas.getPosX() && MouseX <= AuxCasillas.getPosX2() && MouseY >= AuxCasillas.getPosY() && MouseY <= AuxCasillas.getPosY2()) {
                return AuxCasillas;
            }
            AuxCasillas = AuxCasillas.sig;

        }
        return null;
    }
//Elimina una casilla que se encuentre dentro del rango donde se dio click

    public boolean EliminarCasilla(String NombreUsuario, int PosX, int PosY, int PosX2, int PosY2, int MouseX, int MouseY) {
        Casillas AuxCasilla = VerificarCasilla(NombreUsuario, PosX, PosY, PosX2, PosY2, MouseX, MouseY);
        if (AuxCasilla != null) {
            if (AuxCasilla == Login.RespaldoUsuario.sigMapa.CasillaSig) {
                Login.RespaldoUsuario.sigMapa.CasillaSig = Login.RespaldoUsuario.sigMapa.CasillaSig.sig;

                return true;
            }
            if (AuxCasilla.sig == null) {
                AuxCasilla.ant.sig = null;

                return true;
            } else {
                AuxCasilla.ant.sig = AuxCasilla.sig;
                AuxCasilla.sig.ant = AuxCasilla.ant;

                return true;
            }
        }
        return false;
    }
//Agrega una funcion al administrador actual

    public boolean crearFunciones(String Color, int Adelantar, int Retrasar, int LanzarDado) {
        Funciones nuevaF = new Funciones(Color, Adelantar, Retrasar, LanzarDado);
        if (Login.RespaldoAdmin.sigFunc == null) {
            Login.RespaldoAdmin.sigFunc = nuevaF;
            return true;
        } else {
            Funciones temp = Login.RespaldoAdmin.sigFunc;
            while (temp.sig != null) {
                System.out.println(temp.getColor());
                temp = temp.sig;
            }
            temp.sig = nuevaF;
            nuevaF.ant = temp;
            return true;
        }
    }
//Carga los jcomobobox

    public void MostrarNombreUsuario() {
        Usuarios aux = Inicio;
        jComboBoxModificar.removeAllItems();
        jComboBoxEliminar.removeAllItems();
        jComboBoxUsuarios.removeAllItems();
        jComboBoxUsuarios2.removeAllItems();
        while (aux != null) {
            jComboBoxModificar.addItem(aux.getNombreUsuario());
            jComboBoxEliminar.addItem(aux.getNombreUsuario());
            jComboBoxUsuarios.addItem(aux.getNombreUsuario());
            jComboBoxUsuarios2.addItem(aux.getNombreUsuario());
            aux = aux.sig;
        }
    }
//Agrega fichas al administrador

    public boolean AgregarFicha(String Color) {
        Fichas nuevaF = new Fichas(Color, "", 0, null);
        if (Login.RespaldoAdmin.sigFicha == null) {
            Login.RespaldoAdmin.sigFicha = nuevaF;
            return true;
        } else {
            Fichas temp = Login.RespaldoAdmin.sigFicha;
            Fichas ant = temp;
            while (temp != null) {
                if (temp.ColorFicha.equals(Color)) {
                    return false;
                }
                ant = temp;
                temp = temp.sig;
            }
            ant.sig = nuevaF;
            nuevaF.ant = temp;
            return true;
        }
    }
// Verifica que las fichas no sean igual

    public Fichas RetornarFichas(String Color) {
        if (Login.RespaldoAdmin.sigFicha == null) {
            JOptionPane.showMessageDialog(null, "No hay fichas creadas");
        } else {
            Fichas temp = Login.RespaldoAdmin.sigFicha;
            Fichas ant = temp;
            while (temp != null) {
                if (temp.ColorFicha.equals(Color)) {
                    return temp;
                }
                ant = temp;
                temp = temp.sig;
            }
        }
        return null;
    }
//Retorna el total de casillas que contiene un mapa

    public int TotalCasillas() {
        Casillas CasillasAux = Mapas.sigMapa.CasillaSig;
        while (CasillasAux != null) {
            if (CasillasAux.sig == null) {
                return CasillasAux.getNumero();
            }
            CasillasAux = CasillasAux.sig;
        }
        return 0;
    }
//Verifica si la ficha ya gano

    public int dado() {
        if (Ganador == false) {
            play(NumeroDado);
        } else {
            tempT = null;
            inicioT = null;
            return -1;
        }
        return -1;
    }

//Busca en numero de casilla en donde tiene que moverse
    public void EncontrarNumeroCasilla() {
        Casillas CasillasAux = Mapas.sigMapa.CasillaSig;
        while (CasillasAux != null) {
            if(tempT == null){
                return;
            }
            if (CasillasAux.Numero == tempT.numeroCasilla) {
                VerFuncionCasilla(tempT, tempT.color, CasillasAux);
            }
            CasillasAux = CasillasAux.sig;
        }
    }
//Verifica las funciones de las casillas cuando una ficha esta en esa casilla

    public void VerFuncionCasilla(Turnos temp, String Color, Casillas aux) {
        if (aux.Adelantar != 0) {
            int adelantar = aux.Adelantar;
            if (temp.color.equals(aux.Color)) {
                adelantar *= 2;
                JOptionPane.showMessageDialog(null, "La ficha " + tempT.color + "se adelanta: " + adelantar + " Casillas");
            }
            while (adelantar > 0 && aux != null) {
                if (aux.sig == null) {
                    tempT.numeroCasilla = aux.Numero;
                    GanadorJuego(aux);
                }
                adelantar--;
                aux = aux.sig;
            }
            if(tempT == null){
                return;
            }
            tempT.numeroCasilla = aux.Numero;
            GanadorJuego(aux);
        }
        if (aux.Retrasar != 0) {
            int retrasar = aux.Retrasar;
            while (retrasar > 0 && aux != null) {
                if (aux.ant == null) {
                    tempT.numeroCasilla = aux.Numero;
                    GanadorJuego(aux);
                }
                retrasar--;
                aux = aux.ant;
            }
            if(tempT == null){
                return;
            }
            tempT.numeroCasilla = aux.Numero;
            JOptionPane.showMessageDialog(null, "La ficha " + tempT.color + " se retrasa a la casilla: " + aux.Numero);
            GanadorJuego(aux);
        }
        if (aux.LanzarDado != 0) {
            JOptionPane.showMessageDialog(null, "La ficha " + tempT.color + " vuelve a lanzar el dado");
            MoverFicha(tempT.color, aux.PosX, aux.PosY);
            tempT = tempT.ant;
        } else {
            MoverFicha(tempT.color, aux.PosX, aux.PosY);
        }
    }
//Mueve la ficha a una casilla

    public void MoverFicha(String Color, int PosX, int PosY) {

        if (Color.equals("Verde")) {
            FichaVerde.setLocation(PosX, PosY);

        }
        if (Color.equals("Amarillo")) {
            FichaAmarilla.setLocation(PosX, PosY);

        }
        if (Color.equals("Rojo")) {
            FichaRoja.setLocation(PosX, PosY);

        }
        if (Color.equals("Azul")) {
            FichaAzul.setLocation(PosX, PosY);

        }
    }
//Asigna los turnos a las fichas

    public boolean asignarTurnos(String color, int NumeroCasilla, boolean Ganador) {
        Turnos nuevoT = new Turnos(color, NumeroCasilla, Ganador);
        if (inicioT == null) {
            inicioT = nuevoT;
            FinalT = nuevoT;
            setTempT(inicioT);
            return true;
        } else {
            FinalT.sig = nuevoT;
            nuevoT.ant = FinalT;
            nuevoT.sig = inicioT;
            FinalT = nuevoT;
            inicioT.ant = FinalT;
            return true;
        }
    }
//Hace el ultimo movimiento de la ficha

    public boolean GanadorJuego(Casillas auxC) {
        if (tempT.numeroCasilla >= Login.metodos.TotalCasillas()) {
            Casillas aux = Mapas.sigMapa.CasillaSig;
            while (aux != null) {
                if (aux.sig == null) {
                    if (tempT.color.equals("Verde")) {
                        FichaVerde.setLocation(aux.PosX, aux.PosY);
                    }
                    if (tempT.color.equals("Amarillo")) {
                        FichaAmarilla.setLocation(aux.PosX, aux.PosY);
                    }
                    if (tempT.color.equals("Rojo")) {
                        FichaRoja.setLocation(aux.PosX, aux.PosY);
                    }
                    if (tempT.color.equals("Azul")) {
                        FichaAzul.setLocation(aux.PosX, aux.PosY);
                    }
                }
                aux = aux.sig;
            }
            JOptionPane.showMessageDialog(null, "La ficha " + tempT.color + " ha ganado");
            Ganador = true;
            dado();
        } else {
            EncontrarNumeroCasilla();
            if (auxC != null) {
                MoverFicha(tempT.color, auxC.PosX, auxC.PosY);
            }
        }
        return true;
    }
//Metodo donde recibe el numero del dado para luego verificar a donde se tiene que mocer

    public void play(int dado) {
        if (tempT.color.equals("Verde")) {
            tempT.numeroCasilla += dado;
            //Mover Ficha
            boolean ganar = GanadorJuego(null);
            if (ganar == false) {
                EncontrarNumeroCasilla();
            }
            if(Ganador == true){
                return;
            }
            if (tempT.sig == null) {
                tempT = inicioT;
            } else {
                tempT = tempT.sig;
            }
            return;
        } else if (tempT.color.equals("Amarillo")) {
            tempT.numeroCasilla += dado;
            //Mover Ficha
            boolean ganar = GanadorJuego(null);
            if (ganar == false) {
                EncontrarNumeroCasilla();
            }
            if(Ganador == true){
                return;
            }
            if (tempT.sig == null) {
                tempT = inicioT;
            } else {
                tempT = tempT.sig;
            }
            return;
        } else if (tempT.color.equals("Rojo")) {
            tempT.numeroCasilla += dado;
            boolean ganar = GanadorJuego(null);
            if (ganar == false) {
                EncontrarNumeroCasilla();
            }
            if(Ganador == true){
                return;
            }
            if (tempT.sig == null) {
                tempT = inicioT;
            } else {
                tempT = tempT.sig;
            }
            return;
        } else if (tempT.color.equals("Azul")) {
            tempT.numeroCasilla += dado;
            boolean ganar = GanadorJuego(null);
            if (ganar == false) {
                EncontrarNumeroCasilla();
            }
            if(Ganador == true){
                return;
            }
            if (tempT.sig == null) {
                tempT = inicioT;
            } else {
                tempT = tempT.sig;
            }
            return;
        } else if (tempT == null) {
            JOptionPane.showMessageDialog(null, "Juego Finalizado");
            return;
        }
    }

    public Usuarios getInicio() {
        return Inicio;
    }

    public void setInicio(Usuarios Inicio) {
        this.Inicio = Inicio;
    }

    public Usuarios getFin() {
        return Fin;
    }

    public void setFin(Usuarios Fin) {
        this.Fin = Fin;
    }

    public Admin getInicioA() {
        return InicioA;
    }

    public void setInicioA(Admin InicioA) {
        this.InicioA = InicioA;
    }

    public Admin getFinA() {
        return FinA;
    }

    public void setFinA(Admin FinA) {
        this.FinA = FinA;
    }

    public Funciones getSigFuncion() {
        return SigFuncion;
    }

    public void setSigFuncion(Funciones SigFuncion) {
        this.SigFuncion = SigFuncion;
    }

    public Mapas getSigMapa() {
        return SigMapa;
    }

    public void setSigMapa(Mapas SigMapa) {
        this.SigMapa = SigMapa;
    }

    public Casillas getInicioCasilla() {
        return InicioCasilla;
    }

    public void setInicioCasilla(Casillas InicioCasilla) {
        this.InicioCasilla = InicioCasilla;
    }

    public Casillas getFinCasilla() {
        return FinCasilla;
    }

    public void setFinCasilla(Casillas FinCasilla) {
        this.FinCasilla = FinCasilla;
    }

    public Turnos getTempT() {
        return tempT;
    }

    public void setTempT(Turnos tempT) {
        this.tempT = tempT;
    }
}
