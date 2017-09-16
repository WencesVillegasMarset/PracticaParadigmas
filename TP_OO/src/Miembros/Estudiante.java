/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Miembros;
import Asignaturas.Curso;
import Asignaturas.Inscripcion;
import java.util.ArrayList;

/**
 *
 * @author Wences
 */
public class Estudiante extends Persona{
    private Integer legajo;
    private ArrayList<Inscripcion> inscripto = new ArrayList<>();
    
    
    public String getLegajo() {
        return legajo.toString();
    }
        public Estudiante(Integer legajo, String nombre){
        super(nombre);
        this.legajo = legajo;
    }
    public void inscribir(Curso c) throws ErrorInscripcion{
        if(inscripto.size() >= 3 ){
            throw new ErrorInscripcion();
        } else {
        Inscripcion nuevaInscr = new Inscripcion(c, this);
        this.inscripto.add(nuevaInscr);
        c.inscribir(nuevaInscr);
        }
    }

    public String getNombre() {
        return nombre;
    }
    public void getCursos(){
        System.out.println("Cursos a los que " + this.getNombre() + " se ha iscripto:");

        for (Inscripcion inscripto1 : inscripto) {
            Curso curso = inscripto1.getParaEl();
            System.out.println(curso.getTitulo());
        }
    }
    
    
}
