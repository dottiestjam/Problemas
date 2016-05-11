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
public class multiplicacion {
    
    public static int operacion()
    {
        Random n = new Random();
        
        int n1 = n.nextInt(9)+1;
        int n2 = n.nextInt(9)+1;
        int resul = n1 * n2;
        
        return resul;
    }
    
}
