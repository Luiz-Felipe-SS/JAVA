package tratamento.de.exceção;


public class Ex01 {
    
    static void metodo1(){
        System.out.println("inicio do metodo1");
        metodo2();
        System.out.println("Fim do metado1");
    }
   
    static void metodo2(){
        
        
        try {
            System.out.println("Inicio do metado2");
            int array[] = new int[10];
            for(int i = 0; i < 15; i++){
            array[i] = i;
            System.out.println("1");
        }
        System.out.println("Fim do metodo2");
            
        } catch (Exception e) {
            System.out.println("Algo deu errado");
        
        }
        
        
    }
    
    public static void main(String[] args){
        
        System.out.println("Inicio do main");
        metodo1();
        System.out.println("Fim do main");
        
    }
}
