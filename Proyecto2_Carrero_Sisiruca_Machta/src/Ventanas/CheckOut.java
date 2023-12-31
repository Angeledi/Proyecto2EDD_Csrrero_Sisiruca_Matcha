/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import javax.swing.JOptionPane;
import proyecto2_carrero_sisiruca_machta.Historico;
import proyecto2_carrero_sisiruca_machta.Estado;
import proyecto2_carrero_sisiruca_machta.AVL_Reserva;
import proyecto2_carrero_sisiruca_machta.AVL_Historico;
import proyecto2_carrero_sisiruca_machta.HashTableEstadoActual;
import proyecto2_carrero_sisiruca_machta.ListaHabitacion;

public class CheckOut extends javax.swing.JFrame {
    private HashTableEstadoActual Estado;
    private AVL_Reserva Reserva;
    private AVL_Historico Historico;
    private ListaHabitacion Habitaciones;
    
    public CheckOut() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public CheckOut(HashTableEstadoActual Estado, AVL_Reserva Reserva, AVL_Historico Historico, ListaHabitacion Habitaciones) {
        initComponents();
        this.Estado = Estado;
        this.Reserva = Reserva;
        this.Historico = Historico;
        this.Habitaciones = Habitaciones;
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
        InputNombre = new javax.swing.JTextField();
        InputApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        BackToMenu = new javax.swing.JButton();
        SearchHistoryRoomClient = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(222, 222, 222));
        jLabel1.setFont(new java.awt.Font("Elephant", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CHECK-OUT");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 450, 50));

        jLabel4.setBackground(new java.awt.Color(222, 222, 222));
        jLabel4.setFont(new java.awt.Font("Eras Bold ITC", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("APELLIDO:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 70, 30));

        jLabel5.setBackground(new java.awt.Color(222, 222, 222));
        jLabel5.setFont(new java.awt.Font("Eras Bold ITC", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NOMBRE:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 70, 30));

        InputNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputNombreActionPerformed(evt);
            }
        });
        getContentPane().add(InputNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 140, 30));

        InputApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputApellidoActionPerformed(evt);
            }
        });
        getContentPane().add(InputApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 140, 30));

        jLabel3.setBackground(new java.awt.Color(222, 222, 222));
        jLabel3.setFont(new java.awt.Font("Eras Bold ITC", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("INGRESE EL NOMBRE Y APELLIDO DEL HUÉSPED Y TERMINAR SU ESTADIA:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 480, 30));

        BackToMenu.setText("Volver");
        BackToMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMenuActionPerformed(evt);
            }
        });
        getContentPane().add(BackToMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 80, 30));

        SearchHistoryRoomClient.setText("Realizar");
        SearchHistoryRoomClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchHistoryRoomClientActionPerformed(evt);
            }
        });
        getContentPane().add(SearchHistoryRoomClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 90, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InputApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputApellidoActionPerformed

    private void BackToMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMenuActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Menu menu = new Menu(Estado, Reserva, Historico, Habitaciones);
        menu.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_BackToMenuActionPerformed

    private void SearchHistoryRoomClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchHistoryRoomClientActionPerformed
        
        String nombre = InputNombre.getText();
        String apellido = InputApellido.getText();
        if(!"".equals(nombre) & !"".equals(apellido)){
            
            Estado e = Estado.getEstado(nombre, apellido);
            
        if(e == null){
            JOptionPane.showMessageDialog(null, "Este huésped no se encuentra registrado!");
        } else {
            int opcion = JOptionPane.showConfirmDialog(null, "¿Desea continuar con el proceso?", "Confirmación", JOptionPane.YES_NO_OPTION);
                   
            if (opcion == JOptionPane.YES_OPTION) {
            String str;
            if (e.getCedula() == -1) {
                str = "No disponible no hizo reservacion";
            } else {
                str = Integer.toString(e.getCedula());
            }
            e.llegadatoString();
            
            Historico h = new Historico(str, e.getNombre(), e.getApellido(), e.getEmail(), e.getGender(), e.llegadatoString(), e.getNum_habitacion());
            
            Historico.agregar(h);  
            Estado.eliminarEstado(nombre, apellido);
            Habitaciones.desocuparHabitacion(e.getNum_habitacion());
            JOptionPane.showMessageDialog(null, "El Cliente ha dejado las instalaciones:\n"+"Nombre: "+e.getNombre()+" "+e.getApellido()+"\n"+"Cedula: " + str+"\nEmail: "+ e.getEmail()+"\nGenero: "+e.getGender()+"\nLlegada: "+ e.llegadatoString());
            JOptionPane.showMessageDialog(null, "La habitación " + e.getNum_habitacion()+ " ahora se encuentra disponible");
            } else{
                JOptionPane.showMessageDialog(null, "Check-out Cancelado, el cliente continua su estadia.");
            }
        }
            
        } else{
            JOptionPane.showMessageDialog(null, "Introduzca el nombre y apellido del huésped en los campos");
        }
        
    }//GEN-LAST:event_SearchHistoryRoomClientActionPerformed

    private void InputNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputNombreActionPerformed

    public AVL_Historico getArbol() {
        return Historico;
    }

    public void setArbol(AVL_Historico arbol) {
        this.Historico = arbol;
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
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckOut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToMenu;
    private javax.swing.JTextField InputApellido;
    private javax.swing.JTextField InputNombre;
    private javax.swing.JButton SearchHistoryRoomClient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
