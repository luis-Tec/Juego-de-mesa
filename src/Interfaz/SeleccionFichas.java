/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Clases.Jugar;
import static Interfaz.CargarMapa.NumJugadores;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author Usuario
 */
public class SeleccionFichas extends javax.swing.JFrame {

    //Nueva ventana
    public static JFrame jFrameJugar = new JFrame();

    //Variables globales
    int Num = 0;
    public static String Jugador1;

    public SeleccionFichas() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabelFicha1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Seleccion de fichas");

        jLabelFicha1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FichaVerde1.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FichaAmarilla1.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FichaRoja1.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FichaAzul1.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Jugadores:");

        jLabelCantidad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelCantidad.setText("0/0");

        buttonGroup1.add(jCheckBox1);

        buttonGroup1.add(jCheckBox2);

        buttonGroup1.add(jCheckBox3);

        buttonGroup1.add(jCheckBox4);

        jButton1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton2.setText("Iniciar juego");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setText("  Jugador");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(228, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(111, 111, 111)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelCantidad))
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(163, 163, 163)
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelFicha1)
                                .addGap(42, 42, 42)
                                .addComponent(jCheckBox2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(42, 42, 42)
                                .addComponent(jCheckBox3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addGap(35, 35, 35)
                                .addComponent(jCheckBox4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabelCantidad)))
                .addGap(61, 61, 61)
                .addComponent(jLabel7)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelFicha1)
                    .addComponent(jCheckBox1)
                    .addComponent(jLabel4)
                    .addComponent(jCheckBox3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox4))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (Num != Login.cargarMapa.NumJugadores) {

            if (jCheckBox1.isSelected()) {
                if (jCheckBox1.isEnabled() == true) {
                    String Color = "Verde";
                    //Se pregunta si el metodo retorna algun valor
                    if (Login.metodos.RetornarFichas(Color) != null) {
                        //Se le asigna a la variable global Ficha de la clase Jugar el valor retornado;
                        Jugar.fichas1 = Login.metodos.RetornarFichas(Color);
                        //Se define el numero de jugador que posee dicha ficha
                        Jugar.fichas1.setNombreJugador("Jugador" + Num + "");
                        Num += 1;
                        jLabelCantidad.setText(Num + "" + "/" + Login.cargarMapa.NumJugadores + "");
                        jCheckBox1.setEnabled(false);

                        Login.metodos.asignarTurnos(Color, 0, false);
                    } else {
                        JOptionPane.showMessageDialog(null, "Ficha no disponible");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "La ficha ya fue escogida");
                }
            }
            if (jCheckBox2.isSelected()) {
                if (jCheckBox2.isEnabled() == true) {
                    String Color = "Amarillo";
                    if (Login.metodos.RetornarFichas(Color) != null) {
                        //Se le asigna a la variable global Ficha de la clase Jugar el valor retornado;
                        Jugar.fichas2 = Login.metodos.RetornarFichas(Color);
                        //Se define el numero de jugador que posee dicha ficha
                        Jugar.fichas2.setNombreJugador("Jugador" + Num + "");
                        Num += 1;
                        jLabelCantidad.setText(Num + "" + "/" + Login.cargarMapa.NumJugadores + "");
                        jCheckBox2.setEnabled(false);

                        Login.metodos.asignarTurnos(Color, 0, false);

                    } else {
                        JOptionPane.showMessageDialog(null, "Ficha no disponible");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "La ficha ya fue escogida");
                }

            }
            if (jCheckBox3.isSelected()) {
                if (jCheckBox3.isEnabled() == true) {
                    String Color = "Rojo";
                    if (Login.metodos.RetornarFichas(Color) != null) {
                        //Se le asigna a la variable global Ficha de la clase Jugar el valor retornado;
                        Jugar.fichas3 = Login.metodos.RetornarFichas(Color);
                        //Se define el numero de jugador que posee dicha ficha
                        Jugar.fichas3.setNombreJugador("Jugador" + Num + "");
                        Num += 1;
                        jLabelCantidad.setText(Num + "" + "/" + Login.cargarMapa.NumJugadores + "");
                        jCheckBox3.setEnabled(false);

                        Login.metodos.asignarTurnos(Color, 0, false);

                    } else {
                        JOptionPane.showMessageDialog(null, "Ficha no disponible");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "La ficha ya fue escogida");
                }
            }
            if (jCheckBox4.isSelected()) {
                if (jCheckBox4.isEnabled() == true) {
                    String Color = "Azul";
                    if (Login.metodos.RetornarFichas(Color) != null) {
                        //Se le asigna a la variable global Ficha de la clase Jugar el valor retornado;
                        Jugar.fichas4 = Login.metodos.RetornarFichas(Color);
                        //Se define el numero de jugador que posee dicha ficha
                        Jugar.fichas4.setNombreJugador("Jugador" + Num + "");
                        Num += 1;
                        jLabelCantidad.setText(Num + "" + "/" + Login.cargarMapa.NumJugadores + "");
                        jCheckBox4.setEnabled(false);

                        Login.metodos.asignarTurnos(Color, 0, false);

                    } else {
                        JOptionPane.showMessageDialog(null, "Ficha no disponible");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "La ficha ya fue escogida");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Solo se pueden agregar (" + Login.cargarMapa.NumJugadores + ") jugadores a la partida");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Dirige a la ventana CargarMapa
        Login.cargarMapa.setVisible(true);
        this.dispose();

        //Habilita los CheckBox
        jCheckBox1.setEnabled(true);
        jCheckBox2.setEnabled(true);
        jCheckBox3.setEnabled(true);
        jCheckBox4.setEnabled(true);
        Num = 0;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (Num == Login.cargarMapa.NumJugadores) {
            this.dispose();
            Ventana();
            //Habilita los CheckBox
            jCheckBox1.setEnabled(true);
            jCheckBox2.setEnabled(true);
            jCheckBox3.setEnabled(true);
            jCheckBox4.setEnabled(true);
            Num = 0;
        } else {
            JOptionPane.showMessageDialog(null, "Faltan jugadores");
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    public static void Ventana() {
        jFrameJugar.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Jugar jugar = new Jugar();
        jFrameJugar.add(jugar);
        jFrameJugar.setExtendedState(MAXIMIZED_BOTH);
        jFrameJugar.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SeleccionFichas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeleccionFichas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeleccionFichas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeleccionFichas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeleccionFichas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    public static final javax.swing.JCheckBox jCheckBox1 = new javax.swing.JCheckBox();
    public static final javax.swing.JCheckBox jCheckBox2 = new javax.swing.JCheckBox();
    public static final javax.swing.JCheckBox jCheckBox3 = new javax.swing.JCheckBox();
    public static final javax.swing.JCheckBox jCheckBox4 = new javax.swing.JCheckBox();
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static final javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
    public static final javax.swing.JLabel jLabelCantidad = new javax.swing.JLabel();
    private javax.swing.JLabel jLabelFicha1;
    // End of variables declaration//GEN-END:variables
}
