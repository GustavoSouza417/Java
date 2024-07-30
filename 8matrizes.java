import java.util.Scanner;

public class SomadorDeHorizontaisDeMatriz {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        //declaração de matriz
        int[][] matriz = new int[3][3];
        int[] somaDeHorizontais = new int[3];
        
        //inicializa os elementos do acumulador de soma
        for(int i = 0; i < 3; i++)
            somaDeHorizontais[i] = 0;
        
        //recebe os valores da matriz
        for(int i = 0; i < 3; i++){
            System.out.printf("%dº linha:\n", i + 1);
            
            for(int j = 0; j < 3; j++){
                System.out.printf("- %d) ", j + 1);
                matriz[i][j] = scanner.nextInt();
            }
            
            System.out.println();
        }
        
        scanner.close();
 
        //faz a soma dos elementos de cada vertical da matriz      
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                somaDeHorizontais[i] += matriz[i][j];
            }
        }
        
        //exibe o valor da soma dos elementos de cada vertical
        System.out.println("Soma das horizontais:");
        for(int i = 0; i < 3; i++)
            System.out.printf("- %d) %d\n", i + 1, somaDeHorizontais[i]);
    }
}
