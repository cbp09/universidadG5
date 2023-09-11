package universidadg5.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidad.Entidades.*;

public class InscripcionData {

    private Connection con = null;
    private MateriaData matData;
    private AlumnoData aluData;

    public InscripcionData() {
        con = Conexion.getConexion();
        matData = new MateriaData();
        aluData = new AlumnoData();
    }

    public void guardarInscripcion(Inscripcion insc) {
        String sql = "insert into inscripcion(nota,idAlumno,idMat,estado)"
                + "values(?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, insc.getNota());
            ps.setInt(2, insc.getAlumno().getIdAlumno());
            ps.setInt(3, insc.getMateria().getIdMateria());
            ps.setBoolean(4, insc.isEstado());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                insc.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Cargado exitoso");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }
    }

    public List<Inscripcion> obtenerInscripcion() {
        String sql = "SELECT* FROM inscripcion WHERE estado = 1";
        ArrayList<Inscripcion> inscripciones = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Inscripcion inscr = new Inscripcion();
                inscr.setIdInscripcion(rs.getInt("idInscripto"));
                inscr.setNota(rs.getDouble("nota"));
                inscr.getAlumno().setIdAlumno(rs.getInt("idAlumno"));
                inscr.getMateria().setIdMateria(rs.getInt("idMat"));
                inscr.setEstado(true);

                inscripciones.add(inscr);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de inscripciones");
        }
        return inscripciones;
    }

    public List<Inscripcion> obtenerInscripcionPorAlumno(int id) {
        String sql = "SELECT* FROM inscripcion WHERE idAlumno =" + id + " and estado = 1";
        ArrayList<Inscripcion> inscripciones = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Inscripcion inscr = new Inscripcion();
                inscr.setIdInscripcion(rs.getInt("idInscripto"));
                inscr.setNota(rs.getDouble("nota"));
                inscr.getAlumno().setIdAlumno(rs.getInt("idAlumno"));
                inscr.getMateria().setIdMateria(rs.getInt("idMat"));
                inscr.setEstado(true);

                inscripciones.add(inscr);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de inscripciones");
        }
        return inscripciones;
    }

    public List<Materia> obstenerMateriasCursadas(int id) {
        String sql = "SELECT inscripcion.idMat, nomMat, año FROM inscripción JOIN materias"
                + "ON(inscripción.idMat = materias.idMateria) WHERE inscripcion.idAlumno = ?";
        ArrayList<Materia> materias = new ArrayList<Materia>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Materia materia;
            while (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("inscripcion.idMat"));
                materia.setNombre(rs.getString("noMat"));
                materia.setAnioMateria(rs.getInt("año"));

                materias.add(materia);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener inscripciones " + ex.getMessage());
        }
        return materias;
    }

   // estaba por agregar el método de materias no cursadas pensando que sería lo mismo que arriba excepto que en el where sería idAlumno != ?
   // pero no sería así porque te mostraría todas las materias por más que ese alumno la haya cursado
   // mañana lo vemos, lo dejo anotado para no olvidarme
    
    
    
    
}
