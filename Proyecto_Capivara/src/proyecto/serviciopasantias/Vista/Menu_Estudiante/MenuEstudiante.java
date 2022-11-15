/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto.serviciopasantias.Vista.Menu_Estudiante;

import proyecto.serviciopasantias.Vista.Menu_Estudiante.MisPasantiasEstudiante;
import java.awt.BorderLayout;
import proyecto.serviciopasantias.Modelo.Estudiantes;
import proyecto.serviciopasantias.Vista.Login;

/**
 *
 * @author Windows
 */
public class MenuEstudiante extends javax.swing.JFrame {

    /**
     * Creates new form Login_User
     */
    public MenuEstudiante() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Img_atras = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        Panel_Contenido = new javax.swing.JPanel();
        Boton_Usuario = new javax.swing.JPanel();
        Boton_InfoPersonal = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        Boton_Usuario1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        Boton_Usuario3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(148, 180, 59));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(86, 90, 92));
        jPanel2.setPreferredSize(new java.awt.Dimension(1366, 110));
        jPanel2.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/serviciopasantias/Vista/Images/LogoUN.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(1120, 0, 214, 110);

        Img_atras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Img_atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/serviciopasantias/Vista/Images/Atras.png"))); // NOI18N
        Img_atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Img_atrasMouseClicked(evt);
            }
        });
        jPanel2.add(Img_atras);
        Img_atras.setBounds(38, 38, 33, 33);

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Menú Principal");
        jLabel5.setToolTipText("");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(0, 0, 1366, 110);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1366, 110);

        jPanel3.setBackground(new java.awt.Color(86, 90, 92));
        jPanel3.setLayout(null);

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jSeparator2);
        jSeparator2.setBounds(0, 110, 1324, 14);

        Panel_Contenido.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Panel_ContenidoLayout = new javax.swing.GroupLayout(Panel_Contenido);
        Panel_Contenido.setLayout(Panel_ContenidoLayout);
        Panel_ContenidoLayout.setHorizontalGroup(
            Panel_ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1150, Short.MAX_VALUE)
        );
        Panel_ContenidoLayout.setVerticalGroup(
            Panel_ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        jPanel3.add(Panel_Contenido);
        Panel_Contenido.setBounds(10, 120, 1150, 420);

        Boton_Usuario.setBackground(new java.awt.Color(114, 137, 48));
        Boton_Usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton_UsuarioMouseClicked(evt);
            }
        });
        Boton_Usuario.setLayout(null);

        Boton_InfoPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/serviciopasantias/Vista/Images/Usuario.png"))); // NOI18N
        Boton_Usuario.add(Boton_InfoPersonal);
        Boton_InfoPersonal.setBounds(30, 0, 110, 110);

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 30)); // NOI18N
        jLabel4.setText("Personal");
        Boton_Usuario.add(jLabel4);
        jLabel4.setBounds(200, 60, 110, 30);

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 0, 30)); // NOI18N
        jLabel9.setText("Información");
        Boton_Usuario.add(jLabel9);
        jLabel9.setBounds(130, 30, 150, 30);

        jPanel3.add(Boton_Usuario);
        Boton_Usuario.setBounds(0, 0, 390, 110);

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator5);
        jSeparator5.setBounds(390, 0, 2, 110);

        Boton_Usuario1.setBackground(new java.awt.Color(114, 137, 48));
        Boton_Usuario1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton_Usuario1MouseClicked(evt);
            }
        });
        Boton_Usuario1.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/serviciopasantias/Vista/Images/Inventario.png"))); // NOI18N
        Boton_Usuario1.add(jLabel3);
        jLabel3.setBounds(10, 20, 90, 80);

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 30)); // NOI18N
        jLabel6.setText("&");
        Boton_Usuario1.add(jLabel6);
        jLabel6.setBounds(210, 40, 20, 30);

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 0, 30)); // NOI18N
        jLabel10.setText("Práticas");
        Boton_Usuario1.add(jLabel10);
        jLabel10.setBounds(170, 70, 100, 30);

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 0, 30)); // NOI18N
        jLabel11.setText("Mis Pasantias");
        Boton_Usuario1.add(jLabel11);
        jLabel11.setBounds(130, 10, 170, 30);

        jPanel3.add(Boton_Usuario1);
        Boton_Usuario1.setBounds(390, 0, 390, 110);

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator6);
        jSeparator6.setBounds(780, 0, 2, 110);

        Boton_Usuario3.setBackground(new java.awt.Color(114, 137, 48));
        Boton_Usuario3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton_Usuario3MouseClicked(evt);
            }
        });
        Boton_Usuario3.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/serviciopasantias/Vista/Images/Pasantias.png"))); // NOI18N
        Boton_Usuario3.add(jLabel2);
        jLabel2.setBounds(10, 10, 100, 90);

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 0, 30)); // NOI18N
        jLabel7.setText("Disponibles");
        Boton_Usuario3.add(jLabel7);
        jLabel7.setBounds(180, 70, 140, 30);

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 0, 30)); // NOI18N
        jLabel8.setText("Pasantias/Practicas");
        Boton_Usuario3.add(jLabel8);
        jLabel8.setBounds(130, 30, 240, 30);

        jPanel3.add(Boton_Usuario3);
        Boton_Usuario3.setBounds(780, 0, 390, 110);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(98, 164, 1170, 550);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1366, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Img_atrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Img_atrasMouseClicked
        Login b = new Login();
        b.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Img_atrasMouseClicked

    private void Boton_UsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_UsuarioMouseClicked
        Estudiantes.GetInfo();
        InformacionPersonalEstudiante p1 = new InformacionPersonalEstudiante();
        p1.setSize(1150,420);
        p1.setLocation(0,0);
        
        Panel_Contenido.removeAll();
        Panel_Contenido.add(p1,BorderLayout.CENTER);
        Panel_Contenido.revalidate();
        Panel_Contenido.repaint(); 
        

    }//GEN-LAST:event_Boton_UsuarioMouseClicked

    private void Boton_Usuario1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_Usuario1MouseClicked
        MisPasantiasEstudiante p3 = new MisPasantiasEstudiante();
        p3.setSize(1150,420);
        p3.setLocation(0,0);
        
        Panel_Contenido.removeAll();
        Panel_Contenido.add(p3,BorderLayout.CENTER);
        Panel_Contenido.revalidate();
        Panel_Contenido.repaint();
    }//GEN-LAST:event_Boton_Usuario1MouseClicked

    private void Boton_Usuario3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_Usuario3MouseClicked
        PasantiasDisponiblesEstudiante p2 = new PasantiasDisponiblesEstudiante();
        p2.setSize(1150,420);
        p2.setLocation(0,0);
        
        Panel_Contenido.removeAll();
        Panel_Contenido.add(p2,BorderLayout.CENTER);
        Panel_Contenido.revalidate();
        Panel_Contenido.repaint();
    }//GEN-LAST:event_Boton_Usuario3MouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Boton_InfoPersonal;
    private javax.swing.JPanel Boton_Usuario;
    private javax.swing.JPanel Boton_Usuario1;
    private javax.swing.JPanel Boton_Usuario3;
    private javax.swing.JLabel Img_atras;
    private javax.swing.JPanel Panel_Contenido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    // End of variables declaration//GEN-END:variables
}
