package empleados;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class EmpleadosGUI extends javax.swing.JFrame {
    
    String [][] empleados;
    DefaultTableModel tblModelEmpleados;
    DefaultTableModel tblModelCargos;
    DefaultTableModel tblModelEmpleadosFiltrados;
    DefaultTableModel modelo;
    List<Empleados> listaEmpleados = new ArrayList<Empleados>();
    DefaultComboBoxModel listaEmpleadosModel = new DefaultComboBoxModel(listaEmpleados.toArray());
    
    public EmpleadosGUI() {
        initComponents();
        
        Empleados e = new Empleados ("");
        
         String titulosColumnasEmpleados [] = new String []{
            "Nombre", "Apellido", "Cargo"
                
        };
        tblModelEmpleados = new DefaultTableModel(empleados, titulosColumnasEmpleados);
        tblEmpleados.setModel(tblModelEmpleados);
        
        
        String titulosColumnasCargos [] = new String []{
        "Nombre", "Apellido", "Cargo"
        
        };
        tblModelEmpleadosFiltrados = new DefaultTableModel(empleados, titulosColumnasCargos);
        tblCargoFiltrado.setModel(tblModelEmpleadosFiltrados);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblApellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        lblCargo = new javax.swing.JLabel();
        comboListaCargos = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblEmpleados = new javax.swing.JTable();
        btnRegistrarEmpleados = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        lblNombreEs = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCargoFiltrado = new javax.swing.JTable();
        comboFiltrarCargos = new javax.swing.JComboBox<>();
        btnFiltrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNombre.setText("Nombre:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        lblApellido.setText("Apellido:");

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        lblCargo.setText("Cargo:");

        comboListaCargos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Contador", "Gerente", "Vendedor" }));
        comboListaCargos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        comboListaCargos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboListaCargosActionPerformed(evt);
            }
        });

        tblEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tblEmpleados);

        btnRegistrarEmpleados.setText("Registrar");
        btnRegistrarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEmpleadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(btnRegistrarEmpleados))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboListaCargos, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarEmpleados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboListaCargos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCargo))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Empleado", jPanel4);

        lblNombreEs.setText("Filtrar cargo:");

        tblCargoFiltrado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblCargoFiltrado);

        comboFiltrarCargos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Contador", "Gerente", "Vendedor" }));
        comboFiltrarCargos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        comboFiltrarCargos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboFiltrarCargosItemStateChanged(evt);
            }
        });

        btnFiltrar.setText("OK");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblNombreEs, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboFiltrarCargos, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btnFiltrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreEs)
                    .addComponent(comboFiltrarCargos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFiltrar))
                .addGap(51, 51, 51)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("FiltrarCargo", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void comboFiltrarCargosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboFiltrarCargosItemStateChanged

    }//GEN-LAST:event_comboFiltrarCargosItemStateChanged

    private void btnRegistrarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEmpleadosActionPerformed
        // TODO add your handling code here:
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String cargo = comboListaCargos.getSelectedItem().toString();
        
        Empleados newEmpleado = new Empleados (nombre, apellido, cargo);
        
        boolean empleadoExiste = false;
        
        if (!nombre.equals("")&& !apellido.equals("")&& !cargo.equals("")){
            int confirmacion= JOptionPane.showConfirmDialog(rootPane, "Estás seguro?","Confirmación",JOptionPane.YES_NO_OPTION);
            if(confirmacion ==0){
                for (Empleados e : listaEmpleados){
                    if (e.getNombre().equals(newEmpleado.getNombre()) && e.getApellido().equals(newEmpleado.getApellido()) && e.getCargo().equals(newEmpleado.getCargo())){
                        empleadoExiste =true;
                        break;
                    }
                }
                if (!empleadoExiste){
                    listaEmpleados.add(newEmpleado);
        
                    tblModelEmpleados.addRow(new String [] {newEmpleado.getNombre(),newEmpleado.getApellido(),cargo});
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Ya existe ese registro");
        
                }
                txtNombre.setText("");
                txtApellido.setText("");
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane,"Debe ingresar todos los campos");
        }   
        
    }//GEN-LAST:event_btnRegistrarEmpleadosActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        // TODO add your handling code here:
        int numeroFilas = tblModelEmpleados.getRowCount();
        for(int i= 0; i<numeroFilas; i++){
            tblModelEmpleados.removeRow(0);
        }

        String cargoFiltrado = (String) comboFiltrarCargos.getSelectedItem();
       
        for(Empleados item: listaEmpleados){
            if(cargoFiltrado.equals("Gerente")){
                if(item.getCargo().equals("Gerente")){
                tblModelEmpleadosFiltrados.addRow (new String[]{item.getNombre(),item.getApellido(),item.getCargo()});
                }
            }
            if(cargoFiltrado.equals("Contador")){             
                if(item.getCargo().equals("Contador")){
                tblModelEmpleadosFiltrados.addRow(new String[]{item.getNombre(),item.getApellido(),item.getCargo()});
                }
            }
            if(cargoFiltrado.equals("Vendedor")){
                if(item.getCargo().equals("Vendedor")){
                tblModelEmpleadosFiltrados.addRow(new String[]{item.getNombre(),item.getApellido(),item.getCargo()});
                }
            }
            if(cargoFiltrado.equals("Obrero")){
                
                if(item.getCargo().equals("Obrero")){
                tblModelEmpleadosFiltrados.addRow(new String[]{item.getNombre(),item.getApellido(),item.getCargo()});
                }
            }
        }
        
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void comboListaCargosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboListaCargosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboListaCargosActionPerformed

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
            java.util.logging.Logger.getLogger(EmpleadosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmpleadosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmpleadosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmpleadosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmpleadosGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnRegistrarEmpleados;
    private javax.swing.JComboBox<String> comboFiltrarCargos;
    private javax.swing.JComboBox<String> comboListaCargos;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreEs;
    private javax.swing.JTable tblCargoFiltrado;
    private javax.swing.JTable tblEmpleados;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void tblModelEmpleadosEspecificos(String[] string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
