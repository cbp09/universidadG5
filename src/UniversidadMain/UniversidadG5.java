package UniversidadMain;

import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;
import universidad.Entidades.*;
import universidadg5.AccesoADatos.*;
import universidadg5.AccesoADatos.Conexion;

public class UniversidadG5 {

    public static void main(String[] args) {
        
         
//        Alumno juan = new Alumno(3,123123123,"Juan Pedro","Luna",LocalDate.of(1980, 4, 25),true);
        AlumnoData alu = new AlumnoData();
//        alu.guardarAlumno(juan);
//        alu.modificarAlumno(juan);
//       alu.eliminarAlumno(3);
//        Alumno alumnoEncontrado = alu.buscarAlumnoPorId(3);
//        System.out.println(alumnoEncontrado);
        
//        for (Alumno arg : alu.listarAlumnos()) {
//            System.out.println(arg.getDni());
//            System.out.println(arg.getApellido());
//        }
        
//        Materia materia1 = new Materia("Lengua", 2, true);
//        Materia materia2 = new Materia("Matematica", 3, true);
//        Materia materia3 = new Materia("RRSS", 1, true);
//        Materia materia4 = new Materia("Sociales", 1, true);
        
        
        MateriaData consultaMaterias = new MateriaData();
        
        Materia materia5 = consultaMaterias.buscarMateriaPorId(4);
        materia5.setNombre("esto esta modificado");
        
//        consultaMaterias.guardarMateria(materia1);
//        consultaMaterias.guardarMateria(materia2);
//        consultaMaterias.guardarMateria(materia3);
//        consultaMaterias.guardarMateria(materia4);
        
        consultaMaterias.modificarMateria(materia5);
        
        //consultaMaterias.eliminarMateria(materia2.getIdMateria());



    }
    
}
