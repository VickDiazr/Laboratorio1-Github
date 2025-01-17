/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyecto.serviciopasantias.Vista.Menu_Profesor;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import proyecto.serviciopasantias.Modelo.Conexion;
import java.sql.SQLException;
import proyecto.serviciopasantias.Modelo.Docentes;
/**
 *
 * @author Windows
 */
public class InformacionPasantiaProfesor extends javax.swing.JPanel {
    public static String id;
    /**
     * Creates new form InformacionPersonal
     */
    public InformacionPasantiaProfesor() {
        initComponents();
        mostrar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    public void mostrar()
    {
        String [] registros = new String[7];
        Connection cn = null;
        PreparedStatement pst= null;
        ResultSet rs=null;
        try
        {
            cn = Conexion.conectar();           
            pst = cn.prepareStatement("SELECT persona.NOMBRE, empresa.NOMBRE, pasantia.TITULO,pasantia.OBJETIVO_GENERAL,pasantia.INTRODUCCION,pasantia.NOTA,pasantia.ID FROM pasantia INNER JOIN estudiante ON pasantia.ESTUDIANTE = estudiante.ID INNER JOIN persona ON estudiante.PERSONA_ID = persona.ID INNER JOIN responsable ON pasantia.RESPONSABLE = responsable.ID INNER JOIN empresa ON responsable.EMPRESA = empresa.ID INNER JOIN usuario ON persona.ID = usuario.PERSONA INNER JOIN docente ON pasantia.DOCENTE_DIRECTOR = docente.ID WHERE persona.NOMBRE = '" + PasantiasDisponiblesProfesor.Id + "'");            
            rs = pst.executeQuery();
            while(rs.next())
            {
                registros[0] = rs.getString(1);
                registros[1] =  rs.getString(2);
                registros[2] = rs.getString(3);
                registros[3] = rs.getString(4);
                registros[4] = rs.getString(5);
                registros[5] = rs.getString(6);
                registros[6] = rs.getString(7);
            }  
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Error al conectar");
        }
        finally
        {
            try
            {
                if (pst != null) pst.close();
                if (rs != null) rs.close();
                if (cn != null) cn.close();
            }
            catch( SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
        Nombre_Container.setText(registros[0]);
        Empresa_Container.setText(registros[1]);
        Pasantia_Container.setText(registros[2]);
        Descricion_Container.setText(registros[3]);
        Introduccion_Container.setText(registros[4]);
        Calificacion_Contair.setText(registros[5]);
        id = registros[6];
    }    
    
    public void Guardar(String id){
        Connection cn = null;
        PreparedStatement pst= null;
        String nota = Calificacion_Contair.getText();
        
        try
        {
            cn = Conexion.conectar();
            pst = cn.prepareStatement("update pasantia set nota = '" + nota + "' where id = '" + id + "'");
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "La nota ha sido actualizada", "Actualizado", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(SQLException e)
        {
            
            JOptionPane.showMessageDialog(null,"Error al conectar");        
        }
        finally
        {
            try
            {
                if (pst != null) pst.close();
                if (cn != null) cn.close();
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
    }
    
        
        
        
    
    
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TablaContenido = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Boton_Editar = new javax.swing.JLabel();
        Img_atras = new javax.swing.JLabel();
        Descricion_Container = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Calificacion_Contair = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Empresa_Container = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        Pasantia_Container = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        Nombre_Container = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        Introduccion_Container = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setPreferredSize(new java.awt.Dimension(1150, 420));

        TablaContenido.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(148, 180, 59));
        jPanel2.setLayout(null);

        Boton_Editar.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        Boton_Editar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Boton_Editar.setText("Calificar");
        Boton_Editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton_EditarMouseClicked(evt);
            }
        });
        jPanel2.add(Boton_Editar);
        Boton_Editar.setBounds(0, 0, 140, 60);

        TablaContenido.add(jPanel2);
        jPanel2.setBounds(990, 330, 140, 60);

        Img_atras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Img_atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/serviciopasantias/Vista/Images/Atras.png"))); // NOI18N
        Img_atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Img_atrasMouseClicked(evt);
            }
        });
        TablaContenido.add(Img_atras);
        Img_atras.setBounds(10, 10, 33, 33);

        Descricion_Container.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        Descricion_Container.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Descricion_Container.setEnabled(false);
        Descricion_Container.setFocusCycleRoot(true);
        Descricion_Container.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Descricion_ContainerActionPerformed(evt);
            }
        });
        TablaContenido.add(Descricion_Container);
        Descricion_Container.setBounds(150, 230, 770, 90);

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel8.setText("Calificación:");
        TablaContenido.add(jLabel8);
        jLabel8.setBounds(550, 150, 100, 25);

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel9.setText("Estudiante:");
        TablaContenido.add(jLabel9);
        jLabel9.setBounds(40, 50, 90, 25);

        Calificacion_Contair.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        Calificacion_Contair.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Calificacion_Contair.setEnabled(false);
        Calificacion_Contair.setFocusCycleRoot(true);
        Calificacion_Contair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calificacion_ContairActionPerformed(evt);
            }
        });
        TablaContenido.add(Calificacion_Contair);
        Calificacion_Contair.setBounds(660, 150, 70, 25);

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel10.setText("Empresa:");
        TablaContenido.add(jLabel10);
        jLabel10.setBounds(40, 100, 90, 25);

        Empresa_Container.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        Empresa_Container.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Empresa_Container.setEnabled(false);
        Empresa_Container.setFocusCycleRoot(true);
        Empresa_Container.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Empresa_ContainerActionPerformed(evt);
            }
        });
        TablaContenido.add(Empresa_Container);
        Empresa_Container.setBounds(150, 100, 250, 25);

        jLabel15.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel15.setText("Pasantia:");
        TablaContenido.add(jLabel15);
        jLabel15.setBounds(40, 150, 90, 25);

        Pasantia_Container.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        Pasantia_Container.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Pasantia_Container.setEnabled(false);
        Pasantia_Container.setFocusCycleRoot(true);
        Pasantia_Container.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pasantia_ContainerActionPerformed(evt);
            }
        });
        TablaContenido.add(Pasantia_Container);
        Pasantia_Container.setBounds(150, 150, 250, 25);

        jLabel16.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel16.setText("Descrición:");
        TablaContenido.add(jLabel16);
        jLabel16.setBounds(40, 230, 90, 25);

        Nombre_Container.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        Nombre_Container.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Nombre_Container.setEnabled(false);
        Nombre_Container.setFocusCycleRoot(true);
        Nombre_Container.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nombre_ContainerActionPerformed(evt);
            }
        });
        TablaContenido.add(Nombre_Container);
        Nombre_Container.setBounds(150, 50, 250, 25);

        jLabel17.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel17.setText("Introducción:");
        TablaContenido.add(jLabel17);
        jLabel17.setBounds(550, 50, 100, 25);

        Introduccion_Container.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        Introduccion_Container.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Introduccion_Container.setEnabled(false);
        Introduccion_Container.setFocusCycleRoot(true);
        Introduccion_Container.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Introduccion_ContainerActionPerformed(evt);
            }
        });
        TablaContenido.add(Introduccion_Container);
        Introduccion_Container.setBounds(660, 50, 250, 80);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TablaContenido.add(jSeparator1);
        jSeparator1.setBounds(500, 0, 3, 210);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TablaContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TablaContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Img_atrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Img_atrasMouseClicked
        PasantiasDisponiblesProfesor p1 = new PasantiasDisponiblesProfesor();
        p1.setSize(1150,420);
        p1.setLocation(0,0);
        
        TablaContenido.removeAll();
        TablaContenido.add(p1,BorderLayout.CENTER);
        TablaContenido.revalidate();
        TablaContenido.repaint();
    }//GEN-LAST:event_Img_atrasMouseClicked

    private void Descricion_ContainerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Descricion_ContainerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Descricion_ContainerActionPerformed

    private void Calificacion_ContairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calificacion_ContairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Calificacion_ContairActionPerformed

    private void Empresa_ContainerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Empresa_ContainerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Empresa_ContainerActionPerformed

    private void Pasantia_ContainerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pasantia_ContainerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pasantia_ContainerActionPerformed

    private void Nombre_ContainerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nombre_ContainerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nombre_ContainerActionPerformed

    private void Introduccion_ContainerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Introduccion_ContainerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Introduccion_ContainerActionPerformed

    private void Boton_EditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_EditarMouseClicked
        // TODO add your handling code here:
        if (Calificacion_Contair.isEnabled() == false){
            
            Calificacion_Contair.setEnabled(true);
            
        }
        else{
            
            
            Calificacion_Contair.setEnabled(false);
            Guardar(id);
        
        }
        
   
            
            
        
        
    }//GEN-LAST:event_Boton_EditarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Boton_Editar;
    private javax.swing.JTextField Calificacion_Contair;
    private javax.swing.JTextField Descricion_Container;
    private javax.swing.JTextField Empresa_Container;
    private javax.swing.JLabel Img_atras;
    private javax.swing.JTextField Introduccion_Container;
    private javax.swing.JTextField Nombre_Container;
    private javax.swing.JTextField Pasantia_Container;
    private javax.swing.JPanel TablaContenido;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
