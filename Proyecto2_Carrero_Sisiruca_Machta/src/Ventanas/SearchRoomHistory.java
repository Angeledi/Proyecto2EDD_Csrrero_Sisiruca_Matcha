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
import proyecto2_carrero_sisiruca_machta.BinarySearchTree;
import proyecto2_carrero_sisiruca_machta.Historic;


public class SearchRoomHistory extends javax.swing.JFrame {
    static BinarySearchTree arbol;

    public SearchRoomHistory(BinarySearchTree arbol) {
        initComponents();
        this.arbol = arbol;
        setLocationRelativeTo(null);

        // Crear el árbol binario de búsqueda
       // arbol = new BinarySearchTree();

        // Leer el archivo de texto y agregar los clientes al árbol
//           try {
//           InputStream inputStream = SearchRoomHistory.class.getResourceAsStream("test\\habitaciones.txt");
//            try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
//                String linea;
//                
//                while ((linea = br.readLine()) != null) {
//                    String[] datos = linea.split(",");
//                    String dni = datos[0].trim();
//                    String firstName = datos[1].trim();
//                    String lastName = datos[2].trim();
//                    String email = datos[3].trim();
//                    String gender = datos[4].trim();
//                    String checkIn = datos[5].trim();
//                    int roomNumber = Integer.parseInt(datos[6].trim());
//                    
//                    Historic cliente = new Historic(dni, firstName, lastName, email, gender, checkIn, roomNumber);
//                    arbol.insertar(cliente);
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
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
        InputRoom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        BackToMenu = new javax.swing.JButton();
        SearchHistoryRoomClient = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textClientHistory = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Elephant", 1, 19)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BUSCAR HISTORIAL DE HABITACIÓN");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 450, 50));

        InputRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputRoomActionPerformed(evt);
            }
        });
        getContentPane().add(InputRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 140, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Eras Bold ITC", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("INGRESE EL NUMERO DE HABITACIÓN ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 250, 30));

        BackToMenu.setText("Volver");
        BackToMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMenuActionPerformed(evt);
            }
        });
        getContentPane().add(BackToMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        SearchHistoryRoomClient.setText("Buscar");
        SearchHistoryRoomClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchHistoryRoomClientActionPerformed(evt);
            }
        });
        getContentPane().add(SearchHistoryRoomClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, -1, -1));

        textClientHistory.setColumns(20);
        textClientHistory.setRows(5);
        jScrollPane1.setViewportView(textClientHistory);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 490, 190));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InputRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputRoomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputRoomActionPerformed

    private void BackToMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMenuActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_BackToMenuActionPerformed

    private void SearchHistoryRoomClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchHistoryRoomClientActionPerformed
        // TODO add your handling code here:
        String palabra = InputRoom.getText();
        if (!"".equals(palabra)){
            try {
                int numHabitacion = Integer.parseInt(InputRoom.getText());
                String str = arbol.printHistoryRoom(numHabitacion);
                textClientHistory.setText(str);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error! Recuerde escribir un numero entero!");
            }       
    }
        else{
            JOptionPane.showMessageDialog(null, "Escribe un numero de habitacion");
        }
    }//GEN-LAST:event_SearchHistoryRoomClientActionPerformed

    public BinarySearchTree getArbol() {
        return arbol;
    }

    public void setArbol(BinarySearchTree arbol) {
        this.arbol = arbol;
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
            java.util.logging.Logger.getLogger(SearchRoomHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchRoomHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchRoomHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchRoomHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchRoomHistory(arbol).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToMenu;
    private javax.swing.JTextField InputRoom;
    private javax.swing.JButton SearchHistoryRoomClient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textClientHistory;
    // End of variables declaration//GEN-END:variables
}
