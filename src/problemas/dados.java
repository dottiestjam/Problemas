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
public class dados {
    
    public static String evaluar (){
        Random numero = new Random();
        
        int num1 = numero.nextInt(9)+1;
        int num2 = numero.nextInt(9)+1;
        int num3 = numero.nextInt(9)+1;
        String resultado = null;
        
        if (num1 == 6 && num2 == 6 && num3 == 6 ){
            resultado = "Excelente";
        }
        
        if (num1 == 6 && num2 == 6){
            resultado = "Muy bien";
        }
        
        if (num1 == 6 && num3 == 6){
            resultado = "Muy bien";
        }
        
        if(num2 == 6 && num3 == 6 ){
            resultado = "Muy bien";
        }
        
        if(num1 == 6 || num2 == 6 || num3 == 6){
            resultado = "Regular";
        }
        
        if(num1 != 6 && num2 != 6 && num3 != 6){
            resultado = "Pesimo";
        }
        
        return resultado;
    }
}
