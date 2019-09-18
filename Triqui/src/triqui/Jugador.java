/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triqui;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class Jugador {
    
 
    private char figura;    

    public Jugador(){  
        figura = 'X';        
    }
    public Jugador(boolean o){  
        figura = 'O';        
    }
    public char getFigura(){
        return figura;
    }
    
    public int jugar(){
        Scanner sc = new Scanner(System.in);
        int posicion = sc.nextInt();
        return posicion;        
    }
}
