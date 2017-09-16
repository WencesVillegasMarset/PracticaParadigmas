/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asignaturas;

import Miembros.Estudiante;

/**
 *
 * @author Wences
 */
public class Inscripcion {
    private final Curso paraEl;
    private final Estudiante alumno;

    public Curso getParaEl() {
        return paraEl;
    }
    
    public Inscripcion(Curso paraEl, Estudiante alumno){
        this.alumno = alumno;
        this.paraEl = paraEl;
    }
    public void showInfo(){
        System.out.println("Inscripcion de: " + alumno.getNombre() + ", para el curso: " + paraEl.getTitulo());
    }

    public String nombreAlumno() {
        return alumno.getNombre();
    }
    public String legajo(){
        return alumno.getLegajo();
    }
    public Boolean checkearInscripcion(String nombreEstudiante, String nombreCurso){
        return paraEl.getTitulo().equals(nombreCurso) && alumno.getNombre().equals(nombreEstudiante);
    }
    
}
