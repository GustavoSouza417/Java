import java.util.Scanner;

public class MiniCalculadora {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("A seguir, digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.print("A seguir, digite o segundo número: ");
        int numero2 = scanner.nextInt();
        
        System.out.println("\n(1) Soma");
        System.out.println("(2) Subtração");
        System.out.println("(3) Multiplicação");
        System.out.println("(4) Divisão");
        
        System.out.print("\nR: ");
        int opcao = scanner.nextInt();
        scanner.close();
        
        int resultado = 0;
        
        switch(opcao){
            case 1:
                resultado = numero1 + numero2;
                break;
                
            case 2:
                resultado = numero1 - numero2;
                break;
                
            case 3:
                resultado = numero1 * numero2;
                break;
                
            case 4:
                resultado = numero1 / numero2;
                break;
                
            default:
                System.out.print("Número inválido!");
                System.exit(0);
        }
        
        System.out.printf("\nO resultado da operação é %d", resultado);
    }
}
