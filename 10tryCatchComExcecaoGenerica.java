//classe que recebe erros genéricos de exceção (ela não trata erros graves)
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
            //o "Exception" é a classe que trata de erros genéricos e ela faz instância em "e"
            catch(Exception e){
                System.out.print("Ocorreu algum erro durante a execução da aplicação. Por favor, tente novamente.\n\n");
                scanner.next();
            }
            
            //esse Exception consegue captar vários erros, como de outros tipos de dados (textos, números de ponto flutuante e etc.)
            //de qualquer forma, sempre que possível, é melhor usar exceções específicas do que exceções genéricas
            //exceções genéricas só devem ser usadas para erros muito inesperados
        }
        
        scanner.close();
    }
}
