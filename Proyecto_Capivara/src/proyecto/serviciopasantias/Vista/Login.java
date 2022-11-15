/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto.serviciopasantias.Vista;
import java.awt.Color;
import javax.swing.JOptionPane;
import proyecto.serviciopasantias.Modelo.LoginForAll;
import proyecto.serviciopasantias.Vista.Menu_Estudiante.*;
import proyecto.serviciopasantias.Vista.Menu_Empresa.*;
import proyecto.serviciopasantias.Vista.Menu_Profesor.*;

/**
 *
 * @author Windows
 */
public class Login extends javax.swing.JFrame {
    /**
     * Creates new form Loginn
     */
    public Login() {
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Ingresar_Usuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Ingresar_Pass = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Ass = new javax.swing.JPanel();
        Boton_Ingresar = new javax.swing.JLabel();
        as = new javax.swing.JPanel();
        Boton_Registrar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(148, 180, 59));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(148, 180, 59));
        jPanel1.setForeground(new java.awt.Color(148, 180, 59));
        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(86, 90, 92));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(null);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/serviciopasantias/Vista/Images/User.png"))); // NOI18N
        jPanel3.add(jLabel7);
        jLabel7.setBounds(430, 240, 35, 35);

        Ingresar_Usuario.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        Ingresar_Usuario.setForeground(new java.awt.Color(204, 204, 204));
        Ingresar_Usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Ingresar_Usuario.setText("Ingrese Usuario");
        Ingresar_Usuario.setToolTipText("Usuario");
        Ingresar_Usuario.setBorder(null);
        Ingresar_Usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Ingresar_Usuario.setName(""); // NOI18N
        Ingresar_Usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Ingresar_UsuarioMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Ingresar_UsuarioMouseReleased(evt);
            }
        });
        Ingresar_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ingresar_UsuarioActionPerformed(evt);
            }
        });
        jPanel3.add(Ingresar_Usuario);
        Ingresar_Usuario.setBounds(420, 230, 300, 50);
        Ingresar_Usuario.getAccessibleContext().setAccessibleName("");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/serviciopasantias/Vista/Images/PasswordUn.png"))); // NOI18N
        jPanel3.add(jLabel8);
        jLabel8.setBounds(430, 310, 36, 34);

        Ingresar_Pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Ingresar_Pass.setText("************");
        Ingresar_Pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Ingresar_PassMousePressed(evt);
            }
        });
        Ingresar_Pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ingresar_PassActionPerformed(evt);
            }
        });
        jPanel3.add(Ingresar_Pass);
        Ingresar_Pass.setBounds(420, 300, 300, 50);

        jPanel4.setLayout(null);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/serviciopasantias/Vista/Images/Capybara.png"))); // NOI18N
        jPanel4.add(jLabel10);
        jLabel10.setBounds(33, 5, 104, 124);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(485, 20, 170, 140);

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Sistema de Practicas y Pasantias");
        jLabel6.setToolTipText("");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(0, 170, 1140, 53);

        Ass.setBackground(new java.awt.Color(148, 180, 59));
        Ass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Ass.setLayout(null);

        Boton_Ingresar.setFont(new java.awt.Font("Tw Cen MT", 1, 28)); // NOI18N
        Boton_Ingresar.setForeground(new java.awt.Color(255, 255, 255));
        Boton_Ingresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Boton_Ingresar.setText("Ingresar");
        Boton_Ingresar.setToolTipText("");
        Boton_Ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton_IngresarMouseClicked(evt);
            }
        });
        Ass.add(Boton_Ingresar);
        Boton_Ingresar.setBounds(0, 0, 250, 60);

        jPanel3.add(Ass);
        Ass.setBounds(170, 400, 250, 60);

        as.setBackground(new java.awt.Color(148, 180, 59));
        as.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        as.setToolTipText("");
        as.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                asMouseClicked(evt);
            }
        });
        as.setLayout(null);

        Boton_Registrar.setFont(new java.awt.Font("Tw Cen MT", 1, 28)); // NOI18N
        Boton_Registrar.setForeground(new java.awt.Color(255, 255, 255));
        Boton_Registrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Boton_Registrar.setText("Registrarse");
        Boton_Registrar.setToolTipText("");
        Boton_Registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Boton_Registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton_RegistrarMouseClicked(evt);
            }
        });
        as.add(Boton_Registrar);
        Boton_Registrar.setBounds(0, 0, 250, 60);

        jPanel3.add(as);
        as.setBounds(720, 400, 250, 60);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(113, 179, 1140, 520);

        jPanel2.setBackground(new java.awt.Color(86, 90, 92));
        jPanel2.setPreferredSize(new java.awt.Dimension(1366, 0));
        jPanel2.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/serviciopasantias/Vista/Images/LogoUN.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(1120, 0, 214, 110);

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Servicio de pasantías");
        jLabel5.setToolTipText("");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(0, 0, 1366, 110);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, -1, 1366, 110);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-1, 0, 1366, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Ingresar_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ingresar_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ingresar_UsuarioActionPerformed

    private void Ingresar_UsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ingresar_UsuarioMousePressed
        if (Ingresar_Usuario.getText().equals("Ingrese Usuario")){            
            Ingresar_Usuario.setText("");
            Ingresar_Usuario.setForeground(Color.black);  
        }        
        if (String.valueOf(Ingresar_Pass.getPassword()).isEmpty()){            
            Ingresar_Pass.setText("************");
            Ingresar_Pass.setForeground(Color.gray);   
        }         
    }//GEN-LAST:event_Ingresar_UsuarioMousePressed

    private void Ingresar_UsuarioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ingresar_UsuarioMouseReleased
        
    }//GEN-LAST:event_Ingresar_UsuarioMouseReleased

    private void Ingresar_PassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ingresar_PassMousePressed
        if (Ingresar_Usuario.getText().isEmpty()){
            
            Ingresar_Usuario.setText("Ingrese Usuario");
            Ingresar_Usuario.setForeground(Color.gray);
        }
        if (String.valueOf(Ingresar_Pass.getPassword()).equals("************")){ 
            Ingresar_Pass.setText("");
            Ingresar_Pass.setForeground(Color.black);   
        }
    }//GEN-LAST:event_Ingresar_PassMousePressed

    private void Ingresar_PassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ingresar_PassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ingresar_PassActionPerformed

    private void asMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_asMouseClicked

    }//GEN-LAST:event_asMouseClicked

    private void Boton_RegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_RegistrarMouseClicked
        RegistroUser a = new RegistroUser();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Boton_RegistrarMouseClicked
    
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
            java.util.logging.Logger.getLogger(RegistroUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    private void Boton_IngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_IngresarMouseClicked
        Login frame = new Login();
        if ("Ingrese Usuario".equals(Ingresar_Usuario.getText()) && "************".equals(Ingresar_Pass.getText())){
            JOptionPane.showMessageDialog(frame, "Las casillas de usuario y contraseña se encuentran vacías.", "Campos Vacíos", JOptionPane.ERROR_MESSAGE);   
        }
        else if ("Ingrese Usuario".equals(Ingresar_Usuario.getText()) && "".equals(Ingresar_Pass.getText())){
            JOptionPane.showMessageDialog(frame, "Las casillas de usuario y contraseña se encuentran vacías.", "Campos Vacíos", JOptionPane.ERROR_MESSAGE);   
        }
        else if ("".equals(Ingresar_Usuario.getText()) && "************".equals(Ingresar_Pass.getText())){
            JOptionPane.showMessageDialog(frame, "Las casillas de usuario y contraseña se encuentran vacías.", "Campos Vacíos", JOptionPane.ERROR_MESSAGE);   
        }
        else{
            String resultado = LoginForAll.Login(Ingresar_Usuario.getText(), Ingresar_Pass.getText()); 
            if ("Error".equals(resultado)){
                JOptionPane.showMessageDialog(frame, "Revise sus credenciales.", "Ingreso Fallido", JOptionPane.ERROR_MESSAGE);
            }
            else if ("Estudiante".equals(resultado)){
                JOptionPane.showMessageDialog(frame, "Bienvenido a la plataforma, estudiante.", "Ingreso Correcto", JOptionPane.INFORMATION_MESSAGE);
                MenuEstudiante menuest = new MenuEstudiante();
                menuest.setVisible(true);
                this.dispose();
            }
            else if ("Docente".equals(resultado)){
                JOptionPane.showMessageDialog(frame, "Bienvenido a la plataforma, docente.", "Ingreso Fallido", JOptionPane.INFORMATION_MESSAGE);
                MenuProfesor menuprof = new MenuProfesor();
                menuprof.setVisible(true);  
                this.dispose();
            }
            else if ("Empresa".equals(resultado)){
                JOptionPane.showMessageDialog(frame, "Bienvenido a la plataforma, empresario.", "Ingreso Fallido", JOptionPane.INFORMATION_MESSAGE);
                MenuEmpresa menuemp = new MenuEmpresa();
                menuemp.setVisible(true);  
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(frame, resultado, "Ingreso Fallido", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_Boton_IngresarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Ass;
    private javax.swing.JLabel Boton_Ingresar;
    private javax.swing.JLabel Boton_Registrar;
    private javax.swing.JPasswordField Ingresar_Pass;
    private javax.swing.JTextField Ingresar_Usuario;
    private javax.swing.JPanel as;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
