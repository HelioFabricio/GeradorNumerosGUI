/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geradornumeros;

import java.util.Random;
public class GeradorNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        
        System.out.println("Generated random numbers:");
        for (int i = 0; i < 5; i++) {
            int randomNumber = random.nextInt(101);  // Generates a number from 0 to 100
            System.out.println(randomNumber);
        }
    }
}
