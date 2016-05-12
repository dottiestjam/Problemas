/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author oscar
 */
public class deuda {
    
    public static int resolver()
    {
        double valor_inicial = 6000;
        double multiplicador = 0.15;
        double valor_final = 0;
        int contador = 0;
        boolean flag = true;
        
        do{
            valor_final = valor_inicial * multiplicador;
            
            if(valor_final == 55000){
                flag = false;
            }
            
            else{
                contador++;
            }
            
        }while(flag);
        
        return contador;
        
    }
    
}
