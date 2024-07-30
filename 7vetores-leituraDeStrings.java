import java.util.Scanner;

public class ArmazemExibidorDeNomes {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        //declaração do vetor
        String[] nomes = new String[5];
        
        for(int i = 0; i < 5; i++){
            System.out.printf("%dº nome: ", i + 1);
            //serve para coletar dados até uma quebra de linha (costuma ser usado para coletar strings)
            nomes[i] = scanner.nextLine();
        }
        
        scanner.close();
        
        System.out.print("\nNomes digitados:\n\n");
        for(int i = 0; i < 5; i++)
            System.out.println(nomes[i]);
    }
}
