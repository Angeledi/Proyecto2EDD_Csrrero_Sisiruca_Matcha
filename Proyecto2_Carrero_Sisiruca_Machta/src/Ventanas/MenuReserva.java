/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
import proyecto2_carrero_sisiruca_machta.AVL_Reserva;
import proyecto2_carrero_sisiruca_machta.AVL_Historico;
import proyecto2_carrero_sisiruca_machta.Estado;
import proyecto2_carrero_sisiruca_machta.HashTableEstadoActual;
import proyecto2_carrero_sisiruca_machta.Historico;
import proyecto2_carrero_sisiruca_machta.ListaHabitacion;
import proyecto2_carrero_sisiruca_machta.Reserva;


public class MenuReserva extends javax.swing.JFrame {
    
    static HashTableEstadoActual Estado;
    static AVL_Reserva Reserva;
    static AVL_Historico Historico;
    static ListaHabitacion list_habitaciones;
    public MenuReserva(HashTableEstadoActual Estado, AVL_Reserva Reserva, AVL_Historico Historico, ListaHabitacion list_habitaciones) {
        initComponents();
        this.Estado = Estado;
        this.Reserva = Reserva;
        this.Historico = Historico;
        this.list_habitaciones = list_habitaciones;
        setLocationRelativeTo(null);

       
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        InputCedula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        BackToMenu = new javax.swing.JButton();
        MostrarAllClients = new javax.swing.JButton();
        AddClient = new javax.swing.JButton();
        SearchClientEstado = new javax.swing.JButton();
        SearchClientEstado1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textClient = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(222, 222, 222));
        jLabel1.setFont(new java.awt.Font("Elephant", 0, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BUSCAR RESERVAS");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 510, 50));

        jLabel4.setBackground(new java.awt.Color(222, 222, 222));
        jLabel4.setFont(new java.awt.Font("Eras Bold ITC", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ó");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 20, 30));

        jLabel5.setBackground(new java.awt.Color(222, 222, 222));
        jLabel5.setFont(new java.awt.Font("Eras Bold ITC", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CEDULA:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 70, 30));

        InputCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputCedulaActionPerformed(evt);
            }
        });
        getContentPane().add(InputCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 120, 30));

        jLabel3.setBackground(new java.awt.Color(222, 222, 222));
        jLabel3.setFont(new java.awt.Font("Eras Bold ITC", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("INGRESE LOS DATOS DEL CLIENTE A BUSCAR Ó BORRAR (CEDULA)");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 440, 30));

        BackToMenu.setText("Volver");
        BackToMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMenuActionPerformed(evt);
            }
        });
        getContentPane().add(BackToMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        MostrarAllClients.setText("Mostrar todas las Rerservas");
        MostrarAllClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarAllClientsActionPerformed(evt);
            }
        });
        getContentPane().add(MostrarAllClients, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, -1));

        AddClient.setText("Agregar Nueva Reserva");
        AddClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddClientActionPerformed(evt);
            }
        });
        getContentPane().add(AddClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, -1, -1));

        SearchClientEstado.setText("Borrar Reserva");
        SearchClientEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchClientEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(SearchClientEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, -1));

        SearchClientEstado1.setText("Buscar");
        SearchClientEstado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchClientEstado1ActionPerformed(evt);
            }
        });
        getContentPane().add(SearchClientEstado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));

        textClient.setColumns(20);
        textClient.setRows(5);
        jScrollPane1.setViewportView(textClient);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 490, 170));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackToMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMenuActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Menu menu = new Menu(Estado, Reserva, Historico, list_habitaciones);
        menu.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_BackToMenuActionPerformed

    private void SearchClientEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchClientEstadoActionPerformed
        // TODO add your handling code here:
        String cedulastr = InputCedula.getText();
        
        if (!"".equals(cedulastr)){
            try {
                int cedula = Integer.parseInt(cedulastr);
                Reserva found_r = Reserva.buscar2(cedula);
                if (found_r == null){
                    JOptionPane.showMessageDialog(null, "Error! La Reservacion ya fue borrada o la cedula no coincide con la base de datos");
                } else {
                int opcion = JOptionPane.showConfirmDialog(null, "¿Desea continuar con el proceso?", "Confirmación", JOptionPane.YES_NO_OPTION);
                    
                if (opcion == JOptionPane.YES_OPTION) {
                    Reserva.eliminar(cedula);
                    JOptionPane.showMessageDialog(null, "Reserva eliminada Satisfactoriamente!");
                    textClient.setText("Eliminado:\n"+found_r.printCliente2());
                } else {
                    
                    // Cancelar el proceso
                    JOptionPane.showMessageDialog(null, "Eliminacion Cancelada!");
                }
            }
                
                

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error! Recuerde escribir una cedula en valor numerico, sin puntos ni letras!");
            }       
    }
        else{
            JOptionPane.showMessageDialog(null, "Error! recuerde escribir en el campo 'cedula'!");
        }
    }//GEN-LAST:event_SearchClientEstadoActionPerformed

    private void MostrarAllClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarAllClientsActionPerformed
        String str = Reserva.reservasToString();
        textClient.setText(str);
    }//GEN-LAST:event_MostrarAllClientsActionPerformed

    private void AddClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddClientActionPerformed
        this.setVisible(false);
        AddReserva add = new AddReserva(Estado, Reserva, Historico, list_habitaciones);
        add.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AddClientActionPerformed

    private void InputCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputCedulaActionPerformed

    private void SearchClientEstado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchClientEstado1ActionPerformed
        String cedulastr = InputCedula.getText();
        
        if (!"".equals(cedulastr)){
            try {
                int cedula = Integer.parseInt(cedulastr);
                Reserva found_r = Reserva.buscar2(cedula);
                String str = found_r.printCliente2();
                textClient.setText("Reserva encontrada: \n\n"+str);
              

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error! Recuerde escribir una cedula que este registrado!");
            }       
        }
        else{
            JOptionPane.showMessageDialog(null, "Error! recuerde escribir en el campo 'cedula'!");
        }
                     
    }//GEN-LAST:event_SearchClientEstado1ActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(MenuReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuReserva(Estado, Reserva, Historico, list_habitaciones).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddClient;
    private javax.swing.JButton BackToMenu;
    private javax.swing.JTextField InputCedula;
    private javax.swing.JButton MostrarAllClients;
    private javax.swing.JButton SearchClientEstado;
    private javax.swing.JButton SearchClientEstado1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textClient;
    // End of variables declaration//GEN-END:variables
}
