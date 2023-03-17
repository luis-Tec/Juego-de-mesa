package Clases;

import Interfaz.Login;
import static Interfaz.SeleccionFichas.jFrameJugar;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Jugar extends JPanel implements MouseListener, MouseMotionListener {

    //Instancia de la clase metodos
    Metodos metodos = new Metodos();

    //Se crean nuevos JLabel
    public static JLabel FichaVerde = new JLabel();
    public static JLabel FichaAmarilla = new JLabel();
    public static JLabel FichaRoja = new JLabel();
    public static JLabel FichaAzul = new JLabel();

    //Fichas auxiliares;
    public static Fichas fichas1;
    public static Fichas fichas2;
    public static Fichas fichas3;
    public static Fichas fichas4;

    //Cantidad de jugadores;
    public static int TotalJugadores;

    public static int TotalNumeroCasillas = Login.metodos.TotalCasillas();

    //Variable para los turnos
    int Turno = 1;

    //Se encarga de posicionar las fichas
    boolean Agregar = false;

    //
    public static boolean Ganador = false;

    //Auxiliar global Casilla
    Casillas CasillaGlobal;

    //constructor
    public Jugar() {
        String path1 = "/Imagenes/FichaVerde1.png";
        URL url1 = this.getClass().getResource(path1);
        ImageIcon icon1 = new ImageIcon(url1);

        String path2 = "/Imagenes/FichaAzul1.png";
        URL url2 = this.getClass().getResource(path2);
        ImageIcon icon2 = new ImageIcon(url2);

        String path3 = "/Imagenes/FichaAmarilla1.png";
        URL url3 = this.getClass().getResource(path3);
        ImageIcon icon3 = new ImageIcon(url3);

        String path4 = "/Imagenes/FichaRoja1.png";
        URL url4 = this.getClass().getResource(path4);
        ImageIcon icon4 = new ImageIcon(url4);

        FichaVerde.setIcon(icon1);
        FichaAzul.setIcon(icon2);
        FichaAmarilla.setIcon(icon3);
        FichaRoja.setIcon(icon4);

        add(FichaVerde);
        add(FichaAmarilla);
        add(FichaRoja);
        add(FichaAzul);
        addMouseListener(this);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //Puntero Auxiliar      
        Casillas Auxcasillas = Login.cargarMapa.Mapas.getSigMapa().CasillaSig;
        CasillaGlobal = Auxcasillas;

        while (Auxcasillas != null) {
            repaint();
            //Carga las imagenes de las fichas en la ventana
            if (Agregar == false) {
                if (Auxcasillas.getNumero() == 1) {
                    if (fichas1 != null) {
                        FichaVerde.setVisible(true);
                        FichaVerde.setLocation(Auxcasillas.getPosX() - 30, Auxcasillas.getPosY() - 10);
                    } else {
                        FichaVerde.setVisible(false);
                    }
                    if (fichas2 != null) {
                        FichaAmarilla.setVisible(true);
                        FichaAmarilla.setLocation(Auxcasillas.getPosX() - 30, Auxcasillas.getPosY() + 30);
                    } else {
                        FichaAmarilla.setVisible(false);
                    }
                    if (fichas3 != null) {
                        FichaRoja.setVisible(true);
                        FichaRoja.setLocation(Auxcasillas.getPosX() - 60, Auxcasillas.getPosY() - 10);
                    } else {
                        FichaRoja.setVisible(false);
                    }
                    if (fichas4 != null) {
                        FichaAzul.setVisible(true);
                        FichaAzul.setLocation(Auxcasillas.getPosX() - 60, Auxcasillas.getPosY() + 30);
                    } else {
                        FichaAzul.setVisible(false);
                    }
                    Agregar = true;
                }
            }
            if (Auxcasillas.getColor().equals("")) {
                g.setColor(Color.BLACK);
                g.drawString(Auxcasillas.getNumero() + "", Auxcasillas.getPosX() + 33, Auxcasillas.getPosY() + 32);
                Auxcasillas.Pintar(g);

            }
            if (Auxcasillas.getColor().equals("Verde")) {
                g.setColor(Color.GREEN);
                g.drawString(Auxcasillas.getNumero() + "", Auxcasillas.getPosX() + 33, Auxcasillas.getPosY() + 32);
                Auxcasillas.Pintar(g);

            }
            if (Auxcasillas.getColor().equals("Rojo")) {
                g.setColor(Color.RED);
                g.drawString(Auxcasillas.getNumero() + "", Auxcasillas.getPosX() + 33, Auxcasillas.getPosY() + 32);
                Auxcasillas.Pintar(g);

            }
            if (Auxcasillas.getColor().equals("Azul")) {
                g.setColor(Color.BLUE);
                g.drawString(Auxcasillas.getNumero() + "", Auxcasillas.getPosX() + 33, Auxcasillas.getPosY() + 32);
                Auxcasillas.Pintar(g);

            }

            if (Auxcasillas.getColor().equals("Amarillo")) {
                g.setColor(Color.YELLOW);
                g.drawString(Auxcasillas.getNumero() + "", Auxcasillas.getPosX() + 20, Auxcasillas.getPosY() + 20);
                Auxcasillas.Pintar(g);

            }
            Auxcasillas = Auxcasillas.sig;
            repaint();
        }
    }

    @Override

    public void mouseClicked(MouseEvent e) {
        //Guardan la ultima posicion
        int MouseX = (int) e.getX();
        int MouseY = (int) e.getY();
        if (e.isShiftDown() == true) {
            Login.dado.setVisible(true);
        }
        if (e.isAltDown() == true) {
            String Mensaje = "Desea Salir?";
            String Titutlo = "Salir";
            int CuadroDialogo = JOptionPane.showConfirmDialog(null, Mensaje, Titutlo, JOptionPane.YES_NO_OPTION);
            if (CuadroDialogo == JOptionPane.YES_OPTION) {
                Login.cargarMapa.setVisible(true);
                jFrameJugar.dispose();
                
                Ganador = false;
                
                fichas1 = null;
                fichas2 = null;
                fichas3 = null;
                fichas4 = null;
                
                Agregar = false;
               
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
    public void mouseDragged(MouseEvent e) {

    }
}
