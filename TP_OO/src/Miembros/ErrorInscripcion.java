/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Miembros;

/**
 *
 * @author Wences
 */
public class ErrorInscripcion extends Exception{
   @Override
   public String getMessage(){
       return "No puede inscribir a mas de 3 cursos";
   }
}
