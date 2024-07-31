//o "throw" serve para lançar exceções ou erros
//devido a isso, ele consegue fazer um código que está no "Try" mudar de fluxo para o "Catch"
//você pode tanto usar o "new" para criar exceções/erros próprios ou então usar um(a) exceção/erro já existente

import java.io.IOException;

public class EntradaDeDadosValida5 {
    public static void main(String[] args){
        //lançamento de uma exceção genérica
        try{
            throw new Exception("Exceção forçada");
        }
        catch(Exception e){
            System.out.printf("Ocorreu uma exceção: %s\n\n", e.getMessage());
        }
    
        //lançamento de um erro genérico
        try{
            throw new Error("Erro forçado");
        }
        catch(Error e){
            System.out.printf("Ocorreu um erro: %s\n\n", e.getMessage());
        }
        
        //lançamento de uma exceção específica
        try{
            throw new IOException("Erro forçado de entrada/saída");
        }
        catch(IOException e){
            System.out.printf("Ocorreu uma exceção: %s\n\n", e.getMessage());
        }

        //lançamento de um erro específico
        try{
            throw new OutOfMemoryError("Erro forçado de estouro de pilha");
        }
        catch(OutOfMemoryError e){
            System.out.printf("Ocorreu um erro: %s\n\n", e.getMessage());
        }
    }
}
