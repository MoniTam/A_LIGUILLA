/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_liguilla;

import java.util.Scanner;
import java.util.ArrayList;


/**
 *
 * @author ESTEFANIA TAMAY
 */
public class Array_Liguilla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList <String> Octavos = new ArrayList();
        ArrayList <Integer> p1 = new ArrayList();
        ArrayList <String> Cuartos = new ArrayList();
        ArrayList <Integer> p2 = new ArrayList();
        ArrayList <String> Semifinal = new ArrayList();
        ArrayList <Integer> p3 = new ArrayList();
        
         
        Octavos.add("América");
        Octavos.add("Chivas");
        Octavos.add("Leon");
        Octavos.add("Cruz Azul");
        Octavos.add("Toluca");
        Octavos.add("Tigres");
        Octavos.add("Monterrey");
        Octavos.add("Pachuca");
        
        p1.add(4);
        p1.add(3);
        p1.add(2);
        p1.add(3);
        p1.add(5);
        p1.add(4);
        p1.add(1);
        p1.add(2);
        
        Cuartos.add("Pachuca");
        Cuartos.add("Monterrey");
        Cuartos.add("Leon");
        Cuartos.add("Toluca");
        
        p2.add(4);
        p2.add(2);
        p2.add(8);
        p2.add(3);
        
        Semifinal.add("Pachuca");
        Semifinal.add("Chivas");
        Semifinal.add("Tigres");
        Semifinal.add("Cruz Azul");
        
        p3.add(2);
        p3.add(7);
        p3.add(6);
        p3.add(4);
        
        System.out.println("OCTAVOS DE FINAL");
        System.out.println("");
        Array_Liguilla.partido(Octavos, Cuartos, Semifinal, p1, p2, p3);
        
        
        
        
    }
          public static void partido(ArrayList <String> Octavos, ArrayList <String> Cuartos, 
          ArrayList <String> Semifinal, ArrayList <Integer> p1, ArrayList <Integer> p2, ArrayList <Integer> p3){
          Scanner sc = new Scanner(System.in);
          if(p1.get(0)>p1.get(7)){
          System.out.println("Resultados de octavos de final:");
          System.out.println("");
          System.out.println(Octavos.get(0)+" es el ganador contra "+Octavos.get(7)+" con "+p1.get(0)+" goles");}
          else{System.out.println(Octavos.get(7)+" es el ganador contra "+Octavos.get(0)+" con "+p1.get(7)+" goles");}
          
          if(p1.get(1)>p1.get(6)){
          System.out.println(Octavos.get(1)+" es el ganador contra "+Octavos.get(6)+" con "+p1.get(1)+" goles");}
          else{System.out.println(Octavos.get(6)+" es el ganador contra "+Octavos.get(1)+" con "+p1.get(6)+" goles");}
          
          if(p1.get(2)>p1.get(5)){
          System.out.println(Octavos.get(2)+" es el ganador contra "+Octavos.get(5)+" con "+p1.get(2)+" goles");}
          else{System.out.println(Octavos.get(5)+" es el ganador contra "+Octavos.get(2)+" con "+p1.get(5)+" goles");}
          
          if(p1.get(3)>p1.get(4)){
          System.out.println(Octavos.get(3)+" es el ganador contra "+Octavos.get(4)+" con "+p1.get(3)+" goles");}
          else{System.out.println(Octavos.get(4)+" es el ganador contra "+Octavos.get(3)+" con "+p1.get(4)+" goles");}
          
          System.out.println("");
          if(p2.get(0)>p2.get(3)){
          System.out.println("Resultados de cuarto de final");
          System.out.println(Cuartos.get(0)+" es el ganador contra "+Cuartos.get(3)+" con "+p2.get(0)+" goles");}
          else{System.out.println(Cuartos.get(3)+" es el ganador contra "+Cuartos.get(0)+" con "+p2.get(3)+" goles");}
          if(p2.get(1)>p2.get(2)){
          System.out.println(Cuartos.get(1)+" es el ganador contra "+Cuartos.get(2)+" con "+p2.get(1)+" goles");}
          else{System.out.println(Cuartos.get(2)+" es el ganador contra "+Cuartos.get(1)+" con "+p2.get(2)+" goles");}
          
          System.out.println("");
          if(p3.get(0)>p3.get(3)){
          System.out.println("Resultados de semfinal");
          System.out.println(Semifinal.get(0)+" es el ganador contra "+Semifinal.get(3)+" con "+p3.get(0)+" goles");}
          else{System.out.println(Semifinal.get(3)+" es el ganador contra "+Semifinal.get(0)+" con "+p3.get(3)+" goles");}
          if(p3.get(1)>p3.get(2)){
          System.out.println(Semifinal.get(1)+" es el ganador contra "+Semifinal.get(2)+" con "+p3.get(1)+" goles");}
          else{System.out.println(Semifinal.get(2)+" es el ganador contra "+Semifinal.get(1)+" con "+p3.get(2)+" goles");}
        
        
        
    }
    
}
