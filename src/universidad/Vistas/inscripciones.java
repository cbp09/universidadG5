package universidad.Vistas;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidad.AccesoADatos.AlumnoData;
import universidad.AccesoADatos.InscripcionData;
import universidad.Entidades.Alumno;
import universidad.Entidades.Materia;

public class inscripciones extends javax.swing.JInternalFrame {

    private AlumnoData alumnoData = new AlumnoData();
    private InscripcionData inscripcionData = new InscripcionData();
    private DefaultTableModel modelo = new DefaultTableModel();

    public inscripciones() {
        initComponents();
        cargarCombo();
        armarCabecera();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbListaDeAlumnos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaDeMaterias = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jbSalir = new javax.swing.JButton();
        jbAnular = new javax.swing.JButton();
        jbSalirDeInscripcion = new javax.swing.JButton();
        JRB_materiasNoInscriptas = new javax.swing.JRadioButton();
        JRB_materiasInscriptas = new javax.swing.JRadioButton();

        setClosable(true);

        jLabel1.setText("FORMULARIO DE INSCRIPCION");

        jLabel2.setText("Seleccione un alumno:");

        jcbListaDeAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbListaDeAlumnosActionPerformed(evt);
            }
        });

        jtTablaDeMaterias.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtTablaDeMaterias);

        jLabel3.setText("LISTADO DE MATERIAS");

        jbSalir.setText("INSCRIBIR");

        jbAnular.setText("ANULAR INSCRIPCION");

        jbSalirDeInscripcion.setText("SALIR");
        jbSalirDeInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirDeInscripcionActionPerformed(evt);
            }
        });

        JRB_materiasNoInscriptas.setText("Materias no Inscriptas");
        JRB_materiasNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRB_materiasNoInscriptasActionPerformed(evt);
            }
        });

        JRB_materiasInscriptas.setText("Materias  Inscriptas");
        JRB_materiasInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRB_materiasInscriptasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbListaDeAlumnos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(JRB_materiasInscriptas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JRB_materiasNoInscriptas)
                .addGap(133, 133, 133))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(105, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jbSalir)
                .addGap(123, 123, 123)
                .addComponent(jbAnular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSalirDeInscripcion)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbListaDeAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JRB_materiasNoInscriptas)
                    .addComponent(JRB_materiasInscriptas))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAnular)
                    .addComponent(jbSalirDeInscripcion)
                    .addComponent(jbSalir))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirDeInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirDeInscripcionActionPerformed
        // BOTON DE SALIR
        System.exit(0);
    }//GEN-LAST:event_jbSalirDeInscripcionActionPerformed

    private void JRB_materiasInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRB_materiasInscriptasActionPerformed
        //Materias inscriptas
        JRB_materiasNoInscriptas.setSelected(false);
        Alumno alumnoSeleccionado = (Alumno) jcbListaDeAlumnos.getSelectedItem();
        List<Materia> materiasCursadas = inscripcionData.obstenerMateriasCursadas(alumnoSeleccionado.getIdAlumno());
        borrarFilasTabla();
        cargarDatosTabla(materiasCursadas); // el error que me tiraba para cargar los datos era porque en la sentencia sql de obstenerMateriasCursadas necesitaba un espacio antes del "ON" AAAAAAAAAA *Le explota la cabeza*       
    }//GEN-LAST:event_JRB_materiasInscriptasActionPerformed

    private void JRB_materiasNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRB_materiasNoInscriptasActionPerformed
        //Materias NO inscriptas
        JRB_materiasInscriptas.setSelected(false);
        Alumno alumnoSeleccionado = (Alumno) jcbListaDeAlumnos.getSelectedItem();
        List<Materia> materiasNoCursadas = inscripcionData.optenerMateriasNOCurasdas(alumnoSeleccionado.getIdAlumno());
        borrarFilasTabla();
        cargarDatosTabla(materiasNoCursadas);
    }//GEN-LAST:event_JRB_materiasNoInscriptasActionPerformed

    private void jcbListaDeAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbListaDeAlumnosActionPerformed
        //para desmarcar los botones cuando elijo a un alumno
        JRB_materiasNoInscriptas.setSelected(false);
        JRB_materiasInscriptas.setSelected(false);
        //quise agregar el borrar de acá pero tira error
    }//GEN-LAST:event_jcbListaDeAlumnosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton JRB_materiasInscriptas;
    private javax.swing.JRadioButton JRB_materiasNoInscriptas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAnular;
    private javax.swing.JButton jbSalir;
    private javax.swing.JButton jbSalirDeInscripcion;
    private javax.swing.JComboBox<Alumno> jcbListaDeAlumnos;
    private javax.swing.JTable jtTablaDeMaterias;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo() {
        for (Alumno alumno : alumnoData.listarAlumnos()) {
            jcbListaDeAlumnos.addItem(alumno);
        }
    }

    private void armarCabecera() {
        //de la tabla
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");
        jtTablaDeMaterias.setModel(modelo);
    }

    private void cargarDatosTabla(List<Materia> materias) {
        //de la tabla
        for (Materia materia : materias) {
            modelo.addRow(new Object[]{materia.getIdMateria(), materia.getNombre(), materia.getAnioMateria()});
        }
    }

    private void borrarFilasTabla() {
        //para borrar las filas cada vez que selecciono un alumno diferente, elijo mostrar materias cursadas o no cursadas
        int filas = jtTablaDeMaterias.getRowCount() - 1;
        for (; filas >= 0; filas--) {
            modelo.removeRow(filas);
        }
    }
}
