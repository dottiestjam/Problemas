/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Random;
/**
 *
 * @author oscar
 */
public class adivinanza {
    
    public static String evaluar(int n)
    {
        Random rand = new Random();
        int valor = rand.nextInt(9)+1;

        String res = "";

        if(n > valor){
            res = "Menor";
        }
        if(n < valor){
            res = "Mayor";
        }
        if(n == valor){
            res = "Correcto";
        }
        
        return res;
    }
    
}
