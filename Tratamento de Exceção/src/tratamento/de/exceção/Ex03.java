package tratamento.de.exceção;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args){
    
        try {
            Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe um valor para o Dividendo: ");
        int entradaValor1 = teclado.nextInt();
        
        System.out.println("Informe o segundo valor para o Divisor: ");
        int entradaValor2 = teclado.nextInt();
        
        double resultado = (entradaValor1 * 1.0) / (entradaValor2 * 1.0);
            
        } catch (ArithmeticException e) {
            System.out.println("ERRO o numero não pode ser divisivel por zero");
        }catch (InputMismatchException e){
                System.out.println("valor informado ");
         
           
        } 
               
    }
  
}