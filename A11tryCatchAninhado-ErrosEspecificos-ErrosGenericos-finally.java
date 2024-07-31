//a classe "Error" é usada para tratar erros genéricos, e não precisa ser importada
//você também consegue capturar erros específicos, como também ocorre com exceções
//erros específicos, como "StackOverflowError", também não precisam ser importados

//em aplicações profissionais, não se captura erros, e sim apenas exceções, pois na maioria dos casos, aplicações não podem gerenciar erros
//aqui, isso foi feito apenas para fins demonstrativos e educacionais

import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.IOException;

public class EntradaDeDadosValida3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            try{
                System.out.print("A seguir, digite um número: ");
                int numero = scanner.nextInt();
                break;
            }
            //exceção específica
            catch(InputMismatchException e){
                System.out.print("\n\nCaiu em \"Specific Exception\"\n");
                System.out.print("Ocorreu uma exceção. Por favor, tente novamente.");
                scanner.next();
            }
            //exceção geral
            catch(Exception e){
                System.out.print("\n\nCaiu em \"Generic Exception\"\n");
                System.out.print("Ocorreu uma exceção. Por favor, tente novamente.");
                scanner.next();
            }
            //erro específico
            catch(StackOverflowError e){
                System.out.print("\n\nCaiu em \"Specific Error\"\n");
                System.out.print("Ocorreu uma exceção. Por favor, tente novamente.");
                scanner.next();
            }
            //erros em geral
            catch(Error e){
                System.out.print("\n\nCaiu em \"Generic Error\"\n");
                System.out.print("Ocorreu um erro. Por favor, tente novamente.");
                scanner.next();
            }
            //o "finally" sempre é executado após um Try Catch, independente de seu fluxo
            finally{
                System.out.print("\n\n");
            }
        }
        
        scanner.close();
    }
}
