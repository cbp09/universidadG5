package UniversidadMain;

import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;
import universidad.Entidades.Alumno;
import universidadg5.AccesoADatos.AlumnoData;
import universidadg5.AccesoADatos.Conexion;

public class UniversidadG5 {

    public static void main(String[] args) {
        
         
//        Alumno juan = new Alumno(3,123123123,"Juan Pedro","Luna",LocalDate.of(1980, 4, 25),true);
        AlumnoData alu = new AlumnoData();
//        alu.guardarAlumno(juan);
//        alu.modificarAlumno(juan);
//       alu.eliminarAlumno(3);
        Alumno alumnoEncontrado = alu.buscarAlumnoPorId(3);
        System.out.println(alumnoEncontrado);
        
    }
    
}
