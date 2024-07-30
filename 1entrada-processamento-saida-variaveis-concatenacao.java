//importa uma classe que é utilizada para realizar entrada de dados
import java.util.Scanner;

//o nome do arquivo deve ser o mesmo nome da classe principal
public class Soma {
    //este método é o corpo do programa e sempre deve ser chamado de "main"
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("A seguir, digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.print("A seguir, digite o segundo número: ");
        int numero2 = scanner.nextInt();

        //encerra o scanner
        scanner.close();
        
        //é uma saída formatada igual a do C
        System.out.printf("O resultado da soma é %d", numero1 + numero2);
    }
}
