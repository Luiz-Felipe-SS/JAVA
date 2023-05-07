
package tratamento.de.exceção;

import java.util.Scanner;


public class Ex02 {
    
    public static void main(String[] args){
    
        Scanner teclado = new Scanner(System.in);
        try {
            System.out.println("Eu sei dividir");
        System.out.println("Informe um valor: ");
        int entradaValor1 = teclado.nextInt();
        
        System.out.println("Informe o segundo valor: ");
        int entradaValor2 = teclado.nextInt();
        
        double valorFinal = entradaValor1 + entradaValor2;
        
        System.out.println("O resultado " + valorFinal);
        
        boolean test = true;    
        
        } catch (NullPointerException er) {
            System.out.println("ERRO voce nao infromou um valor");
        } catch (Exception er){
            System.out.println("Insira um numero");
        }
       
        
    }
    
}
