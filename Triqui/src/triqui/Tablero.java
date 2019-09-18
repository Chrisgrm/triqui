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
public class Tablero {
   private char matrizTablero[][];
   private boolean victoria= false;
   
    public Tablero(){ 
        matrizTablero = new char[3][3];
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                matrizTablero[i][j]='-';  
            }
        }
    }
    
    public boolean esVictoria(){
        esVictoriaO();
        esVictoriaX();
        return victoria;
    }
    
    public void esVictoriaO(){      
        int contador=0;
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){           
                if (matrizTablero[i][j]=='O' ){
                    contador++;
                    if (contador==3){
                        victoria=true;                        
                    }              
                }
                i++;
            }           
        }
        contador = 0;
        for (int i=2;i>=0;i--){
            for (int j=0;j<3;j++){
                if (matrizTablero[i][j]=='O' ){
                    contador++;
                    if (contador==3){
                        victoria=true;
                    } 
                }
                i--;
            }            
        }
        contador = 0;
        for (int i = 0; i < 3; i++) {
            for (int j=0;j<3;j++){
                if (matrizTablero[i][j]=='O' ){
                    contador++;
                    if (contador==3){
                        victoria=true;                    
                    }
                }
            }
            contador =0;
        }
        contador = 0;
        
        for (int j = 0; j < 3; j++) {  
            for (int i=0;i<3;i++){
                if (matrizTablero[i][j]=='O' ){
                    contador++;
                    if (contador==3){
                        victoria=true;                        
                    }
                } 
            }
            contador=0;
        }
    }

    public void esVictoriaX(){  

        int contador=0;
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){           
                if (matrizTablero[i][j]=='X'){
                    contador++;
                    if (contador==3){
                        victoria=true;                        
                    }                    
                } 
                i++;
            }
            
        }
        contador = 0;
        for (int i=2;i>=0;i--){
            for (int j=0;j<3;j++){
                if ( matrizTablero[i][j]=='X'){
                    contador++;
                    if (contador==3){
                        victoria=true;                        
                    }                   
                }
                i--;
            }
            
        }
        contador = 0;
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                if (matrizTablero[i][j]=='X'){
                    contador++;
                    if (contador==3){
                        victoria=true;                        
                    }               
                }
            }
            contador = 0;
        }
        contador = 0;
        for(int j=0;j<3;j++){
            for (int i=0;i<3;i++){
                if (matrizTablero[i][j]=='X'){
                    contador++;
                    if (contador==3){
                        victoria=true;                        
                    }               
                }        
            }
        contador = 0;
        }
    }
    
    public void escribir(int posicion, char figura){
        if (posicion==1){
            matrizTablero[2][0]=figura;
        }else if(posicion==2){
            matrizTablero[2][1]=figura;
        }else if(posicion==3){
            matrizTablero[2][2]=figura;
        }else if(posicion==4){
            matrizTablero[1][0]=figura;
        }else if(posicion==5){
            matrizTablero[1][1]=figura;
        }else if(posicion==6){
            matrizTablero[1][2]=figura;
        }else if(posicion==7){
            matrizTablero[0][0]=figura;
        }else if(posicion==8){
            matrizTablero[0][1]=figura;
        }else if(posicion==9){
           matrizTablero[0][2]=figura;
        }
    }
    
    public void imprimir(){
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){             
                System.out.print(matrizTablero[i][j]+" ");                
            }
            System.out.println();  
        }        
    } 
}
