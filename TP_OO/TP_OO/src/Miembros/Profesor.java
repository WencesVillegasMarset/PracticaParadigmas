/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Miembros;

import Asignaturas.Curso;

/**
 *
 * @author Wences
 */
public class Profesor  extends Persona {
    private Curso docente;
    public Profesor(String nombre){
        super(nombre);
    }
    
    
    public void dicta(Curso curso){
        this.docente = curso;
    }

    public void getDocente() {
        System.out.println(docente.getTitulo());
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
