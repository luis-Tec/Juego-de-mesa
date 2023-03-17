package Clases;

import Interfaz.Login;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Pintor extends JPanel implements MouseListener, MouseMotionListener {

    //Casilla Temporal
    public static Casillas CasillasTemporal;

    //Instancia de la clase metodos
    Metodos metodos = new Metodos();

    //Nombre del usuario actual
    public static String NombreUsuario = Login.RespaldoUsuario.getNombreUsuario();

    //Posiciones del mouse
    public static int PosMouseX;
    public static int PosMouseY;

    //Tamaño para casilla
    static int Tamaño = 65;

    public Pintor() {
        addMouseListener(this);
        repaint();
    }

    /**
     * Dibuja la última línea que se le haya pasado.
     */
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        //Puntero Auxiliar      
        Casillas Auxcasillas = Login.RespaldoUsuario.getSigMapa().CasillaSig;
        while (Auxcasillas != null) {
            repaint();
            if (Auxcasillas.getColor().equals("")) {
                g.setColor(Color.BLACK);
                Auxcasillas.Pintar(g);

            }
            if (Auxcasillas.getColor().equals("Verde")) {
                g.setColor(Color.GREEN);
                Auxcasillas.Pintar(g);

            }
            if (Auxcasillas.getColor().equals("Rojo")) {
                g.setColor(Color.RED);
                Auxcasillas.Pintar(g);

            }
            if (Auxcasillas.getColor().equals("Azul")) {
                g.setColor(Color.BLUE);
                Auxcasillas.Pintar(g);

            }

            if (Auxcasillas.getColor().equals("Amarillo")) {
                g.setColor(Color.YELLOW);
                Auxcasillas.Pintar(g);

            }
            Auxcasillas = Auxcasillas.sig;
            repaint();
        }

    }

    @Override

    public void mouseClicked(MouseEvent e
    ) {
        //Puntero Auxiliar      
        Casillas Auxcasillas = Login.RespaldoUsuario.getSigMapa().CasillaSig;

        int MouseX = (int) e.getX();
        int MouseY = (int) e.getY();

        //Salir de la ventana
        if (e.isShiftDown() == true) {
            String Mensaje = "Desea Salir?";
            String Titutlo = "Salir";
            int CuadroDialogo = JOptionPane.showConfirmDialog(null, Mensaje, Titutlo, JOptionPane.YES_NO_OPTION);
            if (CuadroDialogo == JOptionPane.YES_OPTION) {
                Login.mapaNuevo.jFrame.dispose();
                Login.usuarioMapa.jFrameEditar.dispose();
                Login.usuarioMapa.setVisible(true);

                //Contador de casillas
                int Contador = 1;
                //Enumera las casillas
                while (Auxcasillas != null) {
                    Auxcasillas.setNumero(Contador);
                    Contador += 1;
                    Auxcasillas = Auxcasillas.sig;
                }
            }
            return;
        }

        //Click izq agrega casillas
        if (e.getButton() == 1) {
            if (metodos.AgregarCasillas(NombreUsuario, e.getX(), e.getY(), e.getX() + Tamaño, e.getY() + Tamaño, 0, "", 0, 0, 0, MouseX, MouseY) == true) {
                repaint();
            }
        }
        //Boton central agrega funciones a las casillas
        if (e.getButton() == 2) {
            if (metodos.VerificarCasilla(NombreUsuario, e.getX(), e.getY(), e.getX() + Tamaño, e.getY() + Tamaño, MouseX, MouseY) != null) {
                CasillasTemporal = metodos.VerificarCasilla(NombreUsuario, e.getX(), e.getY(), e.getX() + Tamaño, e.getY() + Tamaño, MouseX, MouseY);
                Login.asignarFunciones.setVisible(true);
            }

        }
        //Click derecho elimina casillas
        if (e.getButton() == 3) {
            Login.metodos.EliminarCasilla(NombreUsuario, e.getX(), e.getY(), e.getX() + Tamaño, e.getY() + Tamaño, MouseX, MouseY);
            repaint();
        }
    }

    @Override
    public void mousePressed(MouseEvent e
    ) {
    }

    @Override
    public void mouseReleased(MouseEvent e
    ) {

    }

    @Override
    public void mouseEntered(MouseEvent e
    ) {

    }

    @Override
    public void mouseExited(MouseEvent e
    ) {
    }

    @Override
    public void mouseMoved(MouseEvent e
    ) {
    }

    @Override
    public void mouseDragged(MouseEvent e
    ) {

    }
}
