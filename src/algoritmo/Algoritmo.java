/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Algoritmo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               Scanner teclado = new Scanner(System.in);
        System.out.println(" ingese cantidad de letras aleatorias  ");
        int cant = teclado.nextInt();
        
        System.out.println( " letras generadas ");
        for (int i = 0; i < cant; i++) {

            Random random = new Random();

            char letra = (char) (random.nextInt(26) + 'a');
            System.out.print( (i+1 )+" : " + letra + "\n");

        }

    }
    }
    
}
