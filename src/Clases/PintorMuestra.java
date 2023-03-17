package Clases;

import Interfaz.Login;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PintorMuestra extends JPanel implements MouseListener, MouseMotionListener {

    //Instancia de la clase metodos
    Metodos metodos = new Metodos();

    public PintorMuestra() {
        addMouseListener(this);
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        //Puntero Auxiliar      
        Casillas Auxcasillas = Login.adminMapas.Mapas.getSigMapa().CasillaSig;
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
        //Salir de la ventana
        if (e.isShiftDown() == true) {
            String Mensaje = "Desea Salir?";
            String Titutlo = "Salir";
            int CuadroDialogo = JOptionPane.showConfirmDialog(null, Mensaje, Titutlo, JOptionPane.YES_NO_OPTION);
            if (CuadroDialogo == JOptionPane.YES_OPTION) {
                Login.adminMapas.UsuariosMapas.dispose();
                Login.adminMapas.setVisible(true);
            }
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
