package Inmuebles;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wences
 */
public class TesterParaEjercicios {
    public static void main(String[] args) throws CloneNotSupportedException{
    
        System.out.println("TESTER EJERCICIOS");
        int ejercicio;
        do{
        System.out.println("Ingrese el numero de ejercicio desde el 1 al 8, con 0 termina la ejecucion ");
        Scanner input = new Scanner(System.in);
        ejercicio = input.nextInt();
        switch (ejercicio){
            case 0: break;
            
            case 1: ejercicioUno();
                    break;
            case 2: ejercicioDos();
                    break;
            case 3: ejercicioTres();
                    break;
            case 4: ejercicioCuatro();
                    break;
            case 5: ejercicioCinco();
                    break;
            case 6: ejercicioSeis();
                    break;
            case 7: ejercicioSiete();
                    break;
            case 8: ejercicioOcho();
                    break;
            }        
        }while(ejercicio != 0);
        Lote sampleLote = new Lote(123, "San martin", 1234, 1);
        try{
            FileOutputStream fs = new FileOutputStream("loteYRegistro.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(sampleLote);
            os.close();
            //deserializing
            FileInputStream fileIn = new FileInputStream("loteYRegistro.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Lote loteRecuperado =(Lote) in.readObject();
            in.close();
            fileIn.close();
            loteRecuperado.mostrar();

            
        }
        catch(FileNotFoundException exc){
            exc.getMessage();
        }
        catch (IOException exc){
            exc.getMessage();
        }
        catch(Exception exc){
            exc.getMessage();
        }
    }
    
    public static void ejercicioUno(){
        Lote sampleLote = new Lote(123, "San martin", 1234, 1);
        Escritura primerEscritura = new Escritura(1234, 44, "La Paz 416", sampleLote);
        primerEscritura.showObject();
        primerEscritura.getDomicilio();
        Escritura segundaEscritura = primerEscritura.copia();
        System.out.println("Mostrar copia de la primera, copiada con metodo");
        segundaEscritura.showObject();
    }
    public static void ejercicioDos() throws CloneNotSupportedException{
        Lote nuevoLote = new Lote(124, "San Martin 12", 134, 11);
        nuevoLote.mostrar();
        Lote segundoLote = (Lote) nuevoLote.clone();
        System.out.println("Mostrando copia del primero");
        System.out.println("Cambiando valores de atributos de copia");
        segundoLote.setAvaluoXmt(124511);
        segundoLote.setDomicilio("Nuevo Domicilio asnfu");
        segundoLote.mostrar();
    }
    public static void ejercicioTres(){
    
    }
    public static void ejercicioCuatro(){
    }
    public static void ejercicioCinco(){
    }
    public static void ejercicioSeis(){
    }
    public static void ejercicioSiete(){
    }
    public static void ejercicioOcho(){
    }
    
    
    
}
