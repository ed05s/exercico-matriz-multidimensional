/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe4_matriz;

import java.util.Random;

/**
 *
 * @author ADMIN
 */
public class Exe4_Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random =new Random();
        int[][] M = new int[4][4];
        
        for(int i = 0; i< M.length;i++){
            for (int j=0 ;j<M[i].length;j++){
                M[i][j]= random.nextInt(9);
                
            }  
        }
        System.out.println("Matriz: ");
        for(int[] linha : M){
            for(int coluna : linha){
                System.out.print(coluna + "     ");
            }
            System.out.println();
        }
    }
    
    
}
