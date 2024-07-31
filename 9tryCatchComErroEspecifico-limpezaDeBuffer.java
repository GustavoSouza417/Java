//importação da classe da exceção necessitada (sempre importe as exceções que precisar)
import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaDeDadosValida1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            try{
                System.out.print("A seguir, digite alguma entrada numérica: ");
                float dividendo = scanner.nextFloat();
                break;
            }
            //este "e" é uma instância desta classe de erro (ele pode ter outros nomes, mas "e" é o padrão)
            catch(InputMismatchException e){
                System.out.print("O tipo de dado digitado não é numérico!\n\n");
                scanner.next(); //limpa a entrada anterior (sempre limpe o buffer após uma entrada inválida)
            }
        }
        
        scanner.close();
    }
}
