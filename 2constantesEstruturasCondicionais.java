import java.util.Scanner;

public class Senha {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        //declaração de constante
        final int SENHA = 1234;
        
        System.out.print("Senha: ");
        int senha = scanner.nextInt();
        
        if(senha == SENHA)
            System.out.print("Senha correta");
        else
            System.out.print("Senha incorreta");
    }
}
