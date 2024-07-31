//não é necessário importar nenhuma classe para usar o "Throwable"

//o "Throwable" é a classe pai das subclasses "Exception" e "Error"
//por isso, ela captura tanto exceções quanto erros
//estou a usando apenas para fins educacionais, pois ela não é indicada para ser usada em projetos reais
//isso porque ela captura erros também

import java.util.Scanner;

public class EntradaDeDadosValida4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            try{
                System.out.print("A seguir, digite algum número inteiro: ");
                int numero = scanner.nextInt();
                break;
            }
            catch(Throwable t){
                System.out.println("-----------------------------------");
                System.out.print("\n\nEntrada inválida. Digite apenas números inteiros!\n\n");
                scanner.next();
            }
        }
        
        scanner.close();
    }
}
