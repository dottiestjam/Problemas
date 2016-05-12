/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class Problemas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int n1 = 0;
       
        
        do{
            System.out.println("Introduce un numero");
            n1 = scan.nextInt();
            
            switch(n1){
                case 1:
                    dados();
                    break;
                case 2:
                    llamarSuma();
                    break;
                case 3:
                    multi();
                    break;
                case 5: 
                    adiv();
                    break;
                case 6:
                    verDeuda();
                    break;      
            }
        }while(true);
    }
    
    public static void dados(){
        dados d1 = new dados();
        
        String resul = d1.evaluar();
        
        System.out.println(resul);
    }
    
    public static void llamarSuma(){
        Scanner scan = new Scanner(System.in);
        Suma s1 = new Suma();
        int numero = 0;
        float valor = 0;
        int contador = 0;
        int resultado = 0;
        boolean flag = true;
       
        do{
            System.out.println("Introduce un numero a sumar");
            numero = scan.nextInt();
            valor = numero % 2;
                
            if (valor == 0){
                contador ++;
                resultado = resultado + s1.Sumar(numero);
                System.out.println(resultado);
            }
            else{
                resultado = resultado + s1.Sumar(numero);
            }
            if (contador == 5){
                flag = false;
            }
           
       }while(flag);
        
        System.out.println("resultado final: " + resultado);
    }
    
    public static void multi()
    {
        Scanner scan = new Scanner(System.in);
        multiplicacion m1 = new multiplicacion();
        int valor = m1.operacion();
        int num = 0;
        int contador = 0;
        boolean flag = true;
        System.out.println(valor);
        do{
            System.out.println("Resultado de la multiplicacion?");
            num = scan.nextInt();
            
            if(num == valor){
                System.out.println("Resultado Correcto");
                flag = false;
            }
            if( num != valor){
                contador++;
                System.out.println(contador);
            }
            if( contador == 5 ){
                System.out.println("El resultado es " + valor);
                flag = false;
            }
            
        }while(flag);
        
    }
    
    public static void adiv(){
        Scanner scan = new Scanner(System.in);
        adivinanza a1 = new adivinanza();
        boolean flag = true;
        int numero = 0;
        String res = "";
        do{
            System.out.println("Introduce un numero para adivinar");
            numero = scan.nextInt();
            
            res = a1.evaluar(numero);

            
            if (res.equals("Correcto")){
                System.out.println("Numero correcto");
                flag = false;
            }
            
            if(res.equals("Mayor")){
                System.out.println("Es mayor el numero");
            }
            if (res.equals("Menor")){
                System.out.println("Es menor el numero");
            }
            
        }while(flag);
        
    }
    
    public static void verDeuda(){
        deuda d1 = new deuda();
        int cont = d1.resolver();
        System.out.println(cont);
        
    }    
}
