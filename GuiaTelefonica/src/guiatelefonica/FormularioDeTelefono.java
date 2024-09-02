package guiatelefonica;

import java.util.TreeMap;
import javax.swing.JOptionPane;

public class FormularioDeTelefono extends javax.swing.JFrame {
    
   private TreeMap<Long, Contacto> contactos;
   
   public FormularioDeTelefono() {
        this.contactos = new TreeMap<>();
        initComponents(); // Método para inicializar componentes del formulario
    }

    public FormularioDeTelefono(TreeMap<Long, Contacto> contactos) {
        this.contactos = contactos;
        initComponents();
        agregarContacto();
        buscarContacto();
        buscarTelefono();
        buscarContactos();
        buscarTelefono();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jBSalir = new javax.swing.JButton();
        jBBorrar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jBNuevo = new javax.swing.JButton();
        jTDireccion = new javax.swing.JTextField();
        jTNombre = new javax.swing.JTextField();
        jTApellido = new javax.swing.JTextField();
        jTCiudad = new javax.swing.JTextField();
        jTTelefono = new javax.swing.JTextField();
        jTdni = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario de Contacto");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("DNI:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("Apellido:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setText("Ciudad:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setText("Direccion:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setText("Telefono:");

        jBSalir.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.setBorder(new javax.swing.border.MatteBorder(null));
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBBorrar.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jBBorrar.setText("Borrar");
        jBBorrar.setBorder(new javax.swing.border.MatteBorder(null));
        jBBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBorrarActionPerformed(evt);
            }
        });

        jBGuardar.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jBGuardar.setText("Guardar");
        jBGuardar.setBorder(new javax.swing.border.MatteBorder(null));
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBBuscar.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jBBuscar.setText("Buscar");
        jBBuscar.setBorder(new javax.swing.border.MatteBorder(null));
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBNuevo.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jBNuevo.setText("Nuevo");
        jBNuevo.setBorder(new javax.swing.border.MatteBorder(null));
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jTNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jTDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTCiudad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTdni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(74, 74, 74)
                .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jTdni, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNombreActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        jTdni.setText("");
        jTNombre.setText("");
        jTApellido.setText("");
        jTDireccion.setText("");
        jTCiudad.setText("");
        jTTelefono.setText("");
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        
        String apellido = jTApellido.getText();
        Long telefono = Long.valueOf(jTTelefono.getText());
        
        Contacto contacto = contactos.get(apellido);
        
        if(contacto == null){
            buscarContacto();
        }else{
            buscarTelefono();
        }
        
        
           
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        agregarContacto();
        jTdni.setText("");
        jTNombre.setText("");
        jTApellido.setText("");
        jTDireccion.setText("");
        jTCiudad.setText("");
        jTTelefono.setText("");
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarActionPerformed
        borrarContacto();
        jTdni.setText("");
        jTNombre.setText("");
        jTApellido.setText("");
        jTDireccion.setText("");
        jTCiudad.setText("");
        jTTelefono.setText("");
    }//GEN-LAST:event_jBBorrarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioDeTelefono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioDeTelefono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioDeTelefono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioDeTelefono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioDeTelefono().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBorrar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JTextField jTCiudad;
    private javax.swing.JTextField jTDireccion;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTTelefono;
    private javax.swing.JTextField jTdni;
    // End of variables declaration//GEN-END:variables
    
    private void agregarContacto(){
         try {
        // Obtener datos del formulario
        String nombre = jTNombre.getText();
        String apellido = jTApellido.getText();
        String direccion = jTDireccion.getText();
        String ciudad = jTCiudad.getText();
        String dni = jTdni.getText();
        Long telefono = Long.valueOf(jTTelefono.getText());  // Obtener el teléfono como Long

        // Crear un nuevo contacto
        Contacto nuevoContacto = new Contacto(dni, nombre, apellido, ciudad, direccion);

        // Verificar si el contacto con ese teléfono ya existe
        if (contactos.containsKey(telefono)) {
            // Aquí puedes mostrar un mensaje diciendo que el contacto ya existe
            JOptionPane.showMessageDialog(null, "El contacto con teléfono " + telefono + " ya existe.");
        } else {
            // Agregar el contacto al TreeMap
            contactos.put(telefono, nuevoContacto);
            JOptionPane.showMessageDialog(null, "Contacto agregado exitosamente.");
        }
    } catch (NumberFormatException e) {
        // Manejar error si los campos numéricos no contienen datos válidos
        JOptionPane.showMessageDialog(null, "Error al agregar contacto: " + e.getMessage());
    }
    }
    
    private void borrarContacto() {
    try {
        // Obtener el teléfono ingresado
        Long telefono = Long.valueOf(jTTelefono.getText());

        // Verificar si el contacto con ese teléfono existe
        if (contactos.containsKey(telefono)) {
            // Eliminar el contacto del TreeMap
            contactos.remove(telefono);
            JOptionPane.showMessageDialog(null, "Contacto eliminado exitosamente.");
        } else {
            // Mostrar mensaje si no existe el contacto
            JOptionPane.showMessageDialog(null, "No existe un contacto con el teléfono " + telefono + ".");
        }
    } catch (NumberFormatException e) {
        // Manejar error si el teléfono ingresado no es válido
        JOptionPane.showMessageDialog(null, "Error al eliminar contacto: " + e.getMessage());
    }
}
    
    private void buscarContacto(){
        try {
        // Obtener el número de teléfono ingresado
        Long telefono = Long.valueOf(jTTelefono.getText());

        // Buscar el contacto en el TreeMap
        Contacto contacto = contactos.get(telefono);

        if (contacto != null) {
            // Mostrar los datos del contacto en los campos correspondientes
            jTNombre.setText(contacto.getNombre());
            jTApellido.setText(contacto.getApellido());
            jTDireccion.setText(contacto.getDireccion());
            jTCiudad.setText(contacto.getCiudad());
            jTdni.setText(contacto.getDni());

            // Mostrar mensaje de éxito
            JOptionPane.showMessageDialog(null, "Contacto encontrado.");
        } else {
            // Mostrar mensaje si no se encontró el contacto
            JOptionPane.showMessageDialog(null, "No existe un contacto con el teléfono " + telefono + ".");
        }
       }   catch (NumberFormatException e) {
        // Manejar error si el teléfono ingresado no es válido
        JOptionPane.showMessageDialog(null, "Error al buscar contacto: " + e.getMessage());
        }
    }
    
    //buscarTeléfono() que en base a un apellido nos devuelve un Set<Long> con los números
    //de teléfono asociados a dicho apellido.
    private void buscarTelefono(){
        
        try {
        // Obtener el número de teléfono ingresado
        String apellido = jTApellido.getText();
        Long telefono = Long.valueOf(jTTelefono.getText());
       
        // Buscar el contacto en el TreeMap
      
        Contacto contacto = contactos.get(apellido);

        if (contacto != null) {
            // Mostrar los datos del contacto en los campos correspondientes
            jTNombre.setText(contacto.getNombre());
            jTDireccion.setText(contacto.getDireccion());
            jTCiudad.setText(contacto.getCiudad());
            jTdni.setText(contacto.getDni());
            jTTelefono.setText(telefono.toString());
            

            // Mostrar mensaje de éxito
            JOptionPane.showMessageDialog(null, "Contacto encontrado.");
        } else {
            // Mostrar mensaje si no se encontró el contacto
            JOptionPane.showMessageDialog(null, "No existe un contacto con el teléfono " + telefono + ".");
        }
       }   catch (NumberFormatException e) {
        // Manejar error si el teléfono ingresado no es válido
        JOptionPane.showMessageDialog(null, "Error al buscar contacto: " + e.getMessage());
        }
    }
        
        
    
    
    //buscarContactos() que en base a una ciudad nos devuelve un ArrayList con los
    //Contactos asociados a dicha ciudad
    private void buscarContactos(){
        
    }
}

