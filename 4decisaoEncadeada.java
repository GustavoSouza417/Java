import java.util.Scanner;

public class ClassificadorDeNotasDeAlunos {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("A seguir, digite uma nota de 0 a 10: ");
        float nota = scanner.nextFloat();
        scanner.close();
        
        if(nota >= 0 && nota <= 5)
            System.out.print("Menção C");
            
        else if(nota > 5 && nota <= 7.5)
            System.out.print("Menção B");
            
        else if(nota > 7.5 && nota <= 10)
            System.out.print("Menção A");
            
        else
            System.out.print("Número inválido");
    }
}
