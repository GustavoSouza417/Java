import java.util.Random;

public class SpamNumerico {
    public static void main(String[] args){
        Random random = new Random();
        
        int numero;
        
        //Random
            System.out.print("Random:\n");
            
            //gera um número grande e sem nenhuma limitação
            numero = random.nextInt();
            System.out.printf("  1) %d\n", numero);
            
            //gera um número aleatório entre zero e trinta
            numero = random.nextInt(30);
            System.out.printf("  2) %d\n", numero);
            
            //você pode usar outros tipos de dados (float, double, bool e etc.) para ter outros resultados 
            System.out.print("-------------------------------\n\n");
        //
    }
}
