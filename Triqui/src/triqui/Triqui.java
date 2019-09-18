/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triqui;

/**
 *
 * @author chris
 */
public class Triqui {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador(true);
        Tablero tablero = new Tablero(); 
        System.out.println("Para jugar, tome el teclado numerico como una tablero de 3x3 e inserte el numero donde desea su ficha.");
        tablero.imprimir();
        while (!tablero.esVictoria()){
            tablero.escribir(jugador1.jugar(), jugador1.getFigura());
            tablero.imprimir();
            if (!tablero.esVictoria()){
                tablero.escribir(jugador2.jugar(), jugador2.getFigura());
                tablero.imprimir();                
            }          
        }
        
        
        
 
    }
    
}
