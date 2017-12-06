/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.Conexion;
import Clases.ManagerSoViaticos;
import Clases.ExceptionDatosIncompletos;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class addSolicitudViaticos extends javax.swing.JDialog {
    ManagerSoViaticos manager_viaticos;
     public int varida[];
     Conexion cbd=new Conexion();
    Connection cn=cbd.getConexion();
    public static boolean imprimirSolicitud=false;
    /**
     * Creates new form addSolicitudViaticos
     */
    public addSolicitudViaticos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        //maxid();
        //txtid.setText(varida[0]+1+"");
        manager_viaticos = new ManagerSoViaticos();
        ArrayList<String> carros=cbd.acceder("select linea from vehiculos");
        for(int i=0;i<carros.size();i++){
            cmb_Vehiculo.addItem(carros.get(i));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_addInventario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        txt_Puesto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_Actividad = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_Lugar = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lblAviso = new javax.swing.JLabel();
        date_Salida = new com.toedter.calendar.JDateChooser();
        date_Llegada = new com.toedter.calendar.JDateChooser();
        cmb_Vehiculo = new javax.swing.JComboBox();
        chb_Pernoctado = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        txtKilometraje = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nueva Solicitud");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_addInventario.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nombre:");

        txt_Nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Nombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_NombreFocusLost(evt);
            }
        });

        txt_Puesto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Puesto:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Actividad a realizar:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Fecha de salida:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Fecha de llegada:");

        txt_Actividad.setColumns(20);
        txt_Actividad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Actividad.setRows(5);
        jScrollPane1.setViewportView(txt_Actividad);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Vehiculo:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Lugar:");

        txt_Lugar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Lugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_LugarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Pernoctado:");

        lblAviso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        cmb_Vehiculo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione vehiculo" }));
        cmb_Vehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cmb_VehiculoMouseReleased(evt);
            }
        });
        cmb_Vehiculo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cmb_VehiculoPropertyChange(evt);
            }
        });

        jLabel9.setText("Kilometraje");

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane2.setViewportView(txtDescripcion);

        jLabel6.setText("Descripcion");

        javax.swing.GroupLayout pn_addInventarioLayout = new javax.swing.GroupLayout(pn_addInventario);
        pn_addInventario.setLayout(pn_addInventarioLayout);
        pn_addInventarioLayout.setHorizontalGroup(
            pn_addInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_addInventarioLayout.createSequentialGroup()
                .addGroup(pn_addInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_addInventarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pn_addInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pn_addInventarioLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(date_Salida, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pn_addInventarioLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(date_Llegada, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pn_addInventarioLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(chb_Pernoctado)
                                .addGap(194, 194, 194))
                            .addGroup(pn_addInventarioLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txt_Lugar, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pn_addInventarioLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txt_Puesto, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pn_addInventarioLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pn_addInventarioLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lblAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pn_addInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_addInventarioLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(pn_addInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pn_addInventarioLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pn_addInventarioLayout.createSequentialGroup()
                                .addGroup(pn_addInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pn_addInventarioLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmb_Vehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pn_addInventarioLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtKilometraje, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(127, 127, 127)))
                        .addContainerGap(48, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_addInventarioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        pn_addInventarioLayout.setVerticalGroup(
            pn_addInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_addInventarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_addInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_addInventarioLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pn_addInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn_addInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Puesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(9, 9, 9)
                        .addGroup(pn_addInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(date_Salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(pn_addInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(date_Llegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(pn_addInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(chb_Pernoctado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pn_addInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(txt_Lugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addComponent(lblAviso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(pn_addInventarioLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addGroup(pn_addInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cmb_Vehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn_addInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtKilometraje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pn_addInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        getContentPane().add(pn_addInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 930, 330));

        btnAceptar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/aceptar.png"))); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, -1, -1));

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void maxid(){
        String sql="Select max(idSolicitud) from solicitud_viatico";
        int datos[]=new int[1];
        try{
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
              datos[0]=rs.getInt("max(idSolicitud)");
            //datos[0]=rs.getString("max(idDatos)");
            varida=datos;
        }
    }catch(SQLException ex){
           javax.swing.JOptionPane.showMessageDialog(null, "Error"); 
        }
    }
    private void txt_NombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_NombreFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_NombreFocusLost

    private void txt_LugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_LugarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_LugarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
       
        try{
            verificar_excepcion=true;
            validarDatos(true,"");
            insertar_Solicitud();
        }catch(ExceptionDatosIncompletos e){
            if(verificar_excepcion)JOptionPane.showMessageDialog(this, e.getMessage());
            return;
        }
       
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cmb_VehiculoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmb_VehiculoMouseReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cmb_VehiculoMouseReleased

    private void cmb_VehiculoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cmb_VehiculoPropertyChange
        // TODO add your handling code here:
        if(cmb_Vehiculo.getSelectedIndex()!=0){
            txtKilometraje.setEnabled(true);
            txtDescripcion.setEnabled(true);
        }
    }//GEN-LAST:event_cmb_VehiculoPropertyChange
    public void insertar_Solicitud(){
        try{
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            String fecha_Salida=sdf.format(date_Salida.getDate().getTime());
            String fecha_Llegada=sdf.format(date_Llegada.getDate().getTime());
            Conexion conexion=new Conexion();
            conexion.getConexion();
            String pernoctado="No";
            if(chb_Pernoctado.isSelected()){
                pernoctado="Si";
            }
            System.out.print("insert into Solicitud_viatico (Fecha_Salida,Lugar,Nombre,Actividad,Pernoctado,Vehiculo,Puesto,Fecha_Llegada,Estado,Reporte) values('"+fecha_Salida+"','"+txt_Lugar.getText()+"'"
                + ",'"+txt_Nombre.getText()+"','"+txt_Actividad.getText()+"','"+pernoctado+"','"+cmb_Vehiculo.getSelectedItem().toString()+"'"
                + ",'"+txt_Puesto.getText()+"','"+fecha_Llegada+"','P','0')");
            boolean insersion=conexion.ejecutar("insert into Solicitud_viatico (Fecha_Salida,Lugar,Nombre,Actividad,Pernoctado,Vehiculo,Puesto,Fecha_Llegada,Estado,Reporte) values('"+fecha_Salida+"','"+txt_Lugar.getText()+"'"
                + ",'"+txt_Nombre.getText()+"','"+txt_Actividad.getText()+"','"+pernoctado+"','"+cmb_Vehiculo.getSelectedItem().toString()+"'"
                + ",'"+txt_Puesto.getText()+"','"+fecha_Llegada+"','P','0')");
            conexion.ejecutar("insert into viaticos_vehiculos(kilometraje,descripcion,Vehiculos_Matricula) values('"+txtKilometraje.getText()+"','"
                    + txtDescripcion.getText()+"',(select matricula from vehiculos where linea='"+cmb_Vehiculo.getSelectedItem()+"'))");
            if(insersion){
                JOptionPane.showMessageDialog(this, "Insersión correcta");
                this.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(this, "Error al insertar pero no excepción");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    //Función para validar los datos que se insertan en el formulario.
    public void validarDatos(boolean verificar_fecha,String cad)throws ExceptionDatosIncompletos{
        try{
            if(verificar_fecha && date_Llegada.getDate().before(date_Salida.getDate())){
                if(cad.equals("")){
                    cad+="-La fecha de salida es mayor que la de llegada";
                }
                else{
                    cad+="\n-La fecha de salida es mayor que la de llegada";
                }
            }
        }catch(NullPointerException e){
            if(cad.equals("")){
                cad+="-No se ha insertado alguna de las fechas, inserte las fechas de salida y de llegada";
            }
            else{
                cad+="\n-No se ha insertado alguna de las fechas, inserte las fechas de salida y de llegada";
            }
            try{
                verificar_excepcion=false;
                validarDatos(false,cad);
                return;
            }catch(ExceptionDatosIncompletos ex){
                JOptionPane.showMessageDialog(this, ex.getMessage());
                return;
            }
        }
        if(chb_Pernoctado.isSelected()){
            if(date_Salida.getDate().getYear()==date_Llegada.getDate().getYear()
                    && date_Salida.getDate().getMonth()==date_Llegada.getDate().getMonth()
                    && date_Salida.getDate().getDate()==date_Llegada.getDate().getDate()){
                cad+="\nNo se puede seleccionar pernoctadar para una fecha de salida y de llagada igual";
            }
            
        }
        /*if(cmb_Vehiculo.getSelectedIndex()==0){
            if(cad.equals("")){
                cad+="-Vehiculo no seleccionado";
            }
            else{
                cad+="\n-Vehiculo no seleccionado";
            }
        }*/
        if(cmb_Vehiculo.getSelectedIndex()!=0){
            if(txtKilometraje.getText().equals("")){
                cad+="-Asigne el kilometraje al vehiculo";
            }
            if(txtDescripcion.getText().equals("")){
                cad+="-Escriba la descripción del vehiculo";
            }
        }
        if(txt_Actividad.getText().equals("")){
            if(cad.equals("")){
                cad+="-No se ha insertado ninguna actividad, escriba la acitividad y vuelva a intentarlo";
            }
            else{
                cad+="\n-No se ha insertado ninguna actividad, escriba la acitividad y vuelva a intentarlo";
            }
        }
        if(txt_Lugar.getText().equals("")){
            if(cad.equals("")){
                cad+="-No se ha insertado el lugar, escriba el lugar y vuelva a intentarlo";
            }
            else{
                cad+="\n-No se ha insertado el lugar, escriba el lugar y vuelva a intentarlo";
            }
        }
        if(txt_Nombre.getText().equals("")){
            if(cad.equals("")){
                cad+="-No se ha insertado el nombre del epmpleado, escriba el nombre del empleado y vuelva a intentarlo";
            }
            else{
                cad+="\n-No se ha insertado el nombre del epmpleado, escriba el nombre del empleado y vuelva a intentarlo";
            }
        }
        if(txt_Puesto.getText().equals("")){
            if(cad.equals("")){
                cad+="-No se ha insertado el puesto del epmpleado, escriba el nombre del empleado y vuelva a intentarlo";
            }
            else{
                cad+="\n-No se ha insertado el puesto del epmpleado, escriba el nombre del empleado y vuelva a intentarlo";
            }
        }
        if(!cad.equals("")){
            throw new ExceptionDatosIncompletos(cad);
        }else{
            return;
        }
    }
    
    private boolean verificar_excepcion=true;
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
            java.util.logging.Logger.getLogger(addSolicitudViaticos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addSolicitudViaticos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addSolicitudViaticos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addSolicitudViaticos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                addSolicitudViaticos dialog = new addSolicitudViaticos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JCheckBox chb_Pernoctado;
    private javax.swing.JComboBox cmb_Vehiculo;
    private com.toedter.calendar.JDateChooser date_Llegada;
    private com.toedter.calendar.JDateChooser date_Salida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAviso;
    private javax.swing.JPanel pn_addInventario;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtKilometraje;
    private javax.swing.JTextArea txt_Actividad;
    private javax.swing.JTextField txt_Lugar;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_Puesto;
    // End of variables declaration//GEN-END:variables
}
