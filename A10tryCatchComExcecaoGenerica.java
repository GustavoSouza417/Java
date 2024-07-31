//classe que trata de exceções genéricas
import java.io.IOException;
import java.util.Scanner;

public class EntradaDeDadosValida2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            try{
                System.out.print("A seguir, digite algum número inteiro: ");
                int numero = scanner.nextInt();
                break;
            }
            catch(Exception e){
                System.out.print("Ocorreu algum erro durante a execução da aplicação. Por favor, tente novamente.\n\n");
                scanner.next();
            }

            //esse Exception consegue capturar qualquer exceção        
            //de qualquer forma, sempre que possível, é melhor usar exceções específicas do que exceções genéricas
            //exceções genéricas só devem ser usadas para garantir que não ocorram erros inesperados
        }
        
        scanner.close();
    }
}
