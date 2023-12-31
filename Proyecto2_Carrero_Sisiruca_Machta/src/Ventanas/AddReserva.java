/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import static Ventanas.MenuReserva.Reserva;
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


public class AddReserva extends javax.swing.JFrame {
    
    static HashTableEstadoActual Estado;
    static AVL_Reserva Reserva;
    static AVL_Historico Historico;
    static ListaHabitacion list_habitaciones;
    public AddReserva(HashTableEstadoActual Estado, AVL_Reserva Reserva, AVL_Historico Historico, ListaHabitacion list_habitaciones) {
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
        gender = new javax.swing.ButtonGroup();
        tipoHabitacion = new javax.swing.ButtonGroup();
        Female = new javax.swing.JRadioButton();
        Male = new javax.swing.JRadioButton();
        simple = new javax.swing.JRadioButton();
        doble = new javax.swing.JRadioButton();
        triple = new javax.swing.JRadioButton();
        suite = new javax.swing.JRadioButton();
        InputMM = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        InputDD = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        InputCedula = new javax.swing.JTextField();
        InputAAAA = new javax.swing.JTextField();
        InputAAAA2 = new javax.swing.JTextField();
        InputCelular = new javax.swing.JTextField();
        InputNombre = new javax.swing.JTextField();
        InputApellido = new javax.swing.JTextField();
        InputEmail = new javax.swing.JTextField();
        InputDD2 = new javax.swing.JTextField();
        InputMM2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        BackToMenu = new javax.swing.JButton();
        AddClient = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gender.add(Female);
        Female.setText("Female");
        getContentPane().add(Female, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, -1, -1));

        gender.add(Male);
        Male.setText("Male");
        Male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleActionPerformed(evt);
            }
        });
        getContentPane().add(Male, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, -1, -1));

        tipoHabitacion.add(simple);
        simple.setText("simple");
        getContentPane().add(simple, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, -1));

        tipoHabitacion.add(doble);
        doble.setText("doble");
        getContentPane().add(doble, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, -1, -1));

        tipoHabitacion.add(triple);
        triple.setText("triple");
        getContentPane().add(triple, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, -1, -1));

        tipoHabitacion.add(suite);
        suite.setText("suite");
        getContentPane().add(suite, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, -1));

        InputMM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputMMActionPerformed(evt);
            }
        });
        getContentPane().add(InputMM, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 30, 30));

        jLabel17.setBackground(new java.awt.Color(222, 222, 222));
        jLabel17.setFont(new java.awt.Font("Eras Bold ITC", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("/");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 30, 30));

        jLabel15.setBackground(new java.awt.Color(222, 222, 222));
        jLabel15.setFont(new java.awt.Font("Eras Bold ITC", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("LLEGADA:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 70, 30));

        InputDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputDDActionPerformed(evt);
            }
        });
        getContentPane().add(InputDD, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 30, 30));

        jLabel16.setBackground(new java.awt.Color(222, 222, 222));
        jLabel16.setFont(new java.awt.Font("Eras Bold ITC", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("/");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 30, 30));

        jLabel18.setBackground(new java.awt.Color(222, 222, 222));
        jLabel18.setFont(new java.awt.Font("Eras Bold ITC", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("DD           MM          AAAA");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 160, 30));

        jLabel14.setBackground(new java.awt.Color(222, 222, 222));
        jLabel14.setFont(new java.awt.Font("Eras Bold ITC", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("CEDULA:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 70, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Elephant", 0, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRAR RESERVA");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 450, 50));

        jLabel4.setBackground(new java.awt.Color(222, 222, 222));
        jLabel4.setFont(new java.awt.Font("Eras Bold ITC", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("APELLIDO:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 70, 30));

        jLabel5.setBackground(new java.awt.Color(222, 222, 222));
        jLabel5.setFont(new java.awt.Font("Eras Bold ITC", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("/");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 30, 30));

        jLabel6.setBackground(new java.awt.Color(222, 222, 222));
        jLabel6.setFont(new java.awt.Font("Eras Bold ITC", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("NOMBRE:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 70, 30));

        jLabel7.setBackground(new java.awt.Color(222, 222, 222));
        jLabel7.setFont(new java.awt.Font("Eras Bold ITC", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("HABITACION:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 90, 30));

        jLabel8.setBackground(new java.awt.Color(222, 222, 222));
        jLabel8.setFont(new java.awt.Font("Eras Bold ITC", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("EMAIL:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 70, 30));

        jLabel9.setBackground(new java.awt.Color(222, 222, 222));
        jLabel9.setFont(new java.awt.Font("Eras Bold ITC", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("GENERO:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 70, 30));

        jLabel10.setBackground(new java.awt.Color(222, 222, 222));
        jLabel10.setFont(new java.awt.Font("Eras Bold ITC", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("DD           MM          AAAA");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 160, 30));

        jLabel11.setBackground(new java.awt.Color(222, 222, 222));
        jLabel11.setFont(new java.awt.Font("Eras Bold ITC", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("/");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 30, 30));

        jLabel12.setBackground(new java.awt.Color(222, 222, 222));
        jLabel12.setFont(new java.awt.Font("Eras Bold ITC", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("SALIDA:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 60, 30));

        jLabel13.setBackground(new java.awt.Color(222, 222, 222));
        jLabel13.setFont(new java.awt.Font("Eras Bold ITC", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("CELULAR:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 70, 30));

        InputCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputCedulaActionPerformed(evt);
            }
        });
        getContentPane().add(InputCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 120, 30));

        InputAAAA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputAAAAActionPerformed(evt);
            }
        });
        getContentPane().add(InputAAAA, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 50, 30));

        InputAAAA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputAAAA2ActionPerformed(evt);
            }
        });
        getContentPane().add(InputAAAA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 50, 30));

        InputCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputCelularActionPerformed(evt);
            }
        });
        getContentPane().add(InputCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 120, 30));

        InputNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputNombreActionPerformed(evt);
            }
        });
        getContentPane().add(InputNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 120, 30));

        InputApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputApellidoActionPerformed(evt);
            }
        });
        getContentPane().add(InputApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 120, 30));

        InputEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputEmailActionPerformed(evt);
            }
        });
        getContentPane().add(InputEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 120, 30));

        InputDD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputDD2ActionPerformed(evt);
            }
        });
        getContentPane().add(InputDD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 30, 30));

        InputMM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputMM2ActionPerformed(evt);
            }
        });
        getContentPane().add(InputMM2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 30, 30));

        jLabel3.setBackground(new java.awt.Color(222, 222, 222));
        jLabel3.setFont(new java.awt.Font("Eras Bold ITC", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("INGRESE LOS DATOS DE LA RESERVACION A REGISTRAR");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 440, 30));

        BackToMenu.setText("Volver");
        BackToMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMenuActionPerformed(evt);
            }
        });
        getContentPane().add(BackToMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        AddClient.setText("Agregar Nuevo Reserva");
        AddClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddClientActionPerformed(evt);
            }
        });
        getContentPane().add(AddClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InputAAAA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputAAAA2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputAAAA2ActionPerformed

    private void BackToMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMenuActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        MenuReserva menu = new MenuReserva(Estado, Reserva, Historico, list_habitaciones);
        menu.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_BackToMenuActionPerformed

    private void AddClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddClientActionPerformed
       
        
        Male.setActionCommand("Male");
        Female.setActionCommand("Female");
        simple.setActionCommand("simple");
        doble.setActionCommand("doble");
        triple.setActionCommand("triple");
        suite.setActionCommand("suite");
        
        String nombre = InputNombre.getText();
        String apellido = InputApellido.getText();
        String cedulastr = InputCedula.getText();
        String email = InputEmail.getText();
        String celular = InputCelular.getText();
        
        if (!"".equals(nombre) & !"".equals(apellido) & !"".equals(email) & !"".equals(celular) & gender.getSelection() != null & tipoHabitacion.getSelection() != null & !"".equals(cedulastr)){
            try {
                String genero = gender.getSelection().getActionCommand();
                
                String tha = tipoHabitacion.getSelection().getActionCommand();
               
                
                int cedula = Integer.parseInt(cedulastr);
                
                int dd = Integer.parseInt(InputDD .getText());
                int mm = Integer.parseInt(InputMM.getText());
                int aaaa = Integer.parseInt(InputAAAA.getText());
                int[] llegada = {dd, mm, aaaa};
                
                int dd2 = Integer.parseInt(InputDD2.getText());
                int mm2 = Integer.parseInt(InputMM2.getText());
                int aaaa2 = Integer.parseInt(InputAAAA2.getText());
                int[] salida = {dd2, mm2, aaaa2};
                
                Reserva cn = Reserva.buscar2(cedula);
                
                if(verify(dd,mm,aaaa,dd2,mm2,aaaa2)){
                    if (cn == null){
                        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea continuar con el proceso?", "Confirmación", JOptionPane.YES_NO_OPTION);
                   
                        if (opcion == JOptionPane.YES_OPTION) {
                            Reserva new_r = new Reserva(cedula, nombre, apellido, email, genero, tha, celular, llegada, salida);
                            Reserva.agregar(new_r);
                            JOptionPane.showMessageDialog(null, "Reserva Registradoa exitosamente!\n" +new_r.printCliente2());
        
                        } else {
                            JOptionPane.showMessageDialog(null, "Registro de Reserva Cancelado!");
                        }
                    } else {
                    JOptionPane.showMessageDialog(null, "Error! Ya existe una Reserva asignada a esa cedula!");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Error! Verifique el valor o formato de la fecha");
                }
              
                
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error! Recuerde escribir solo valores numericos para la llegada y salida y la cedula!");
            }       
    }
        else{
            JOptionPane.showMessageDialog(null, "Error! recuerde en todos los campos y/o marcar todas las opciones!");
        }
    }//GEN-LAST:event_AddClientActionPerformed

    private void InputCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputCelularActionPerformed

    private void InputNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputNombreActionPerformed

    private void InputApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputApellidoActionPerformed

    private void InputEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputEmailActionPerformed

    private void InputDD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputDD2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputDD2ActionPerformed

    private void InputMM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputMM2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputMM2ActionPerformed

    private void MaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleActionPerformed
       // Male.setActionCommand("Male");
    }//GEN-LAST:event_MaleActionPerformed

    private void InputCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputCedulaActionPerformed

    private void InputDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputDDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputDDActionPerformed

    private void InputMMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputMMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputMMActionPerformed

    private void InputAAAAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputAAAAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputAAAAActionPerformed

    public boolean verify(int dd1, int mm1, int aaaa1, int dd2, int mm2, int aaaa2) {
        if (dd1 > 31 || dd1 < 1 || mm1 > 12 || mm1 < 1 || aaaa1 < 0) {
            // La primera fecha no está en el formato correcto
            return false;
        }

        if (dd2 > 31 || dd2 < 1 || mm2 > 12 || mm2 < 1 || aaaa2 < 0) {
            // La segunda fecha no está en el formato correcto
            return false;
        }

        if (aaaa1 > aaaa2 || (aaaa1 == aaaa2 && mm1 > mm2) || (aaaa1 == aaaa2 && mm1 == mm2 && dd1 > dd2)) {
            // La primera fecha es mayor que la segunda fecha
            return false;
        } else {
            // La segunda fecha es mayor o igual que la primera fecha
            return true;
        }
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
            java.util.logging.Logger.getLogger(AddReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new AddReserva(Estado, Reserva, Historico, list_habitaciones).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddClient;
    private javax.swing.JButton BackToMenu;
    private javax.swing.JRadioButton Female;
    private javax.swing.JTextField InputAAAA;
    private javax.swing.JTextField InputAAAA2;
    private javax.swing.JTextField InputApellido;
    private javax.swing.JTextField InputCedula;
    private javax.swing.JTextField InputCelular;
    private javax.swing.JTextField InputDD;
    private javax.swing.JTextField InputDD2;
    private javax.swing.JTextField InputEmail;
    private javax.swing.JTextField InputMM;
    private javax.swing.JTextField InputMM2;
    private javax.swing.JTextField InputNombre;
    private javax.swing.JRadioButton Male;
    private javax.swing.JRadioButton doble;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButton simple;
    private javax.swing.JRadioButton suite;
    private javax.swing.ButtonGroup tipoHabitacion;
    private javax.swing.JRadioButton triple;
    // End of variables declaration//GEN-END:variables
}
