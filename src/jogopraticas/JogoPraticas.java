/*
 * Autor: Mateus Roberto Algayer
 * Funcionalidade:
 * Data:
 */
package jogopraticas;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author matea
 */
public class JogoPraticas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        DecimalFormat df = new DecimalFormat("00");

        int valor[] = new int[3];
        int resultado[] = new int[2];
        int numero;
        
        int operadores[] = new int[2];
        
        int resposta; 
        
        boolean continua = true;
        
        while(continua){
                           
            for(int y = 0; y < 2; y++){
                numero = rand.nextInt(31);
                
                if(numero < 10){
                    operadores[y] = 1;
                } else if(numero < 20){
                    operadores[y] = 2;
                } else {
                    operadores[y] = 3;
                }
            }
                
            for(int i = 0; i < 3; i++){
                valor[0] = rand.nextInt(50);
                valor[1] = rand.nextInt(50); 
                valor[2] = rand.nextInt(50); 
                
                switch(operadores[0]){
                    case 1:
                        resultado[0] = valor[0] + valor[1];
                        break;
                    case 2:
                         resultado[0] = valor[0] - valor[1];
                         break;
                    case 3:
                        resultado[0] = valor[0] * valor[1];
                        break;
                }
                
                switch(operadores[1]){
                    case 1:
                            resultado[1] = resultado[0] + valor[2];
                            break;
                    case 2:
                            resultado[1] = resultado[0] - valor[2];
                            break;
                    case 3:
                            resultado[1] = resultado[0] * valor[2];
                            break;
                }
                
                
                if(i == 2){
                    System.out.println(df.format(valor[0]) + " " + df.format(valor[1]) + " " + df.format(valor[2]) + " = x");
                } else {
                    System.out.println(df.format(valor[0]) + " " + df.format(valor[1]) + " " + df.format(valor[2]) + " = " + resultado[1]);
                }
            }
            
            System.out.println("Quanto vale 'x'?");
            resposta = sc.nextInt();
            
            if(resultado[1] == resposta){
                System.out.println("Certa Resposta");
            } else {
                System.out.println("Resposta errada, o número correto era " + resultado[1]);
            }
            
            System.out.println("Continuar?");
            continua = "SIM".equals(sc.next());
            
        }
        
    }
    
}
