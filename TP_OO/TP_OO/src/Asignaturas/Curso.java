/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asignaturas;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author Wences
 */
public class Curso {
    private String titulo;
    //private ArrayList<Inscripcion> delAlumno = new ArrayList<>();
    Hashtable<String, Inscripcion> delAlumno = new Hashtable<>();
    public Curso(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void inscribir(Inscripcion inscripcion){
        delAlumno.put( inscripcion.legajo(), inscripcion);
        
        
    }
    public void inscriptos(){
        /*Iterator<Inscripcion> iterador = delAlumno.iterator();
        while(iterador.hasNext()){
            Inscripcion a = iterador.next();
            System.out.println(a.nombreAlumno());
        }*/
        Enumeration<Inscripcion> alumnosInscriptos = delAlumno.elements();
        while(alumnosInscriptos.hasMoreElements()){
            System.out.println(alumnosInscriptos.nextElement().nombreAlumno());
        }
    }
    public double getCantidadInscriptos(){
        return delAlumno.size();  
    }
}
