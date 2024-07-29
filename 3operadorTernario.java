import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("A seguir, digite um número: ");
        int numero = scanner.nextInt();
        String resultado = (numero % 2 == 0) ? "par" : "ímpar";
        
        System.out.printf("O número digitado é %s", resultado);
    }
}
